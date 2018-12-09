package com.pgen.ms.config;

import java.util.Objects;

public class Service {
    private String key;
    private String host;
    private int port;

    public Service() {}

    public Service(String key, String host, int port) {
        this.key = key;
        this.host = host;
        this.port = port;
    }

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public String getHost() {
        return host;
    }

    public void setHost(String host) {
        this.host = host;
    }

    public int getPort() {
        return port;
    }

    public void setPort(int port) {
        this.port = port;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Service service = (Service) o;
        return port == service.port &&
                Objects.equals(key, service.key) &&
                Objects.equals(host, service.host);
    }

    @Override
    public int hashCode() {
        return Objects.hash(key, host, port);
    }
}
