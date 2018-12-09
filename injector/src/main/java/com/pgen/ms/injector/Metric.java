package com.pgen.ms.injector;

import java.util.Objects;

public class Metric {
    private String key;
    private String value;

    public Metric() {}

    public Metric(String key, String value) {
        this.key = key;
        this.value = value;
    }

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Metric metric = (Metric) o;
        return Objects.equals(key, metric.key) &&
                Objects.equals(value, metric.value);
    }

    @Override
    public int hashCode() {

        return Objects.hash(key, value);
    }
}
