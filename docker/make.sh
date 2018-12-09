./gradlew config:clean config:build config:jar config:shadowJar
./gradlew injector:clean injector:build injector:jar injector:shadowJar
docker build -t ms.config ./config
docker build -t ms.injector ./injector

