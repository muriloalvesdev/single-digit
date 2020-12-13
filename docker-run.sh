mvn clean install -DskipTests -Pprod && docker build -t muriloalvesdev/single-digit . && docker-compose up

