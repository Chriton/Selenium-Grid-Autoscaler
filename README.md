# Selenium-Grid-Autoscaler
Selenium Grid Autoscaler Spring app


# Build the jar
mvn clean install


# Run the app 
Navigate to the app folder and run with
```
./mvnw spring-boot:run
```

# Dockerize the app

We will build and push the docker image to the docker hub so we need to have an account at https://hub.docker.com/ 
 and be logged in.
 - Make sure the jar is created (see Build the jar step above)
 - In the cli navigate to the folder with the Dockerfile file, then use eg.:
```
docker build -t dorumuntean/selenium-grid-autoscaler .
docker push dorumuntean/selenium-grid-autoscaler
```
 - The image should now be visible in your hub.docker.com page
