# Running Spring services

1. Build project: `./gradlew bootJar`
2. Build Docker image: `docker-compose build`
3. Run Docker image: `docker-compose up` (-d to run background)

# Restarting nginx only

`docker-compose up nginx`

# Stop services and remove docker network

`docker-compose down`

# Docker clean

`docker system prune -a`

# Starting the load generator

`docker-compose --profile loadgen up load-generator`

# Troubleshoot

### Address already in use
Stop docker services and restart

