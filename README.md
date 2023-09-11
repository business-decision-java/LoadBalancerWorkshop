# Running Spring service

1. Build project: `./gradlew bootJar`
2. Build Docker image: `docker-compose build`
2. Run Docker image: `docker-compose up`

# Starting the load generator

`docker-compose --profile loadgen up load-generator`