# docker-spring-boot-restcall-multiple-api
Docker Multiple container Rest API calling


# Build Images
-------------------------------------------------
=>docker image build -t imranmadbar/docker-spring-boot-restcall-producer .

=>docker image build -t imranmadbar/docker-spring-boot-restcall-consumer .


#Create network
-------------------------------------------------
=>docker network create consumer-producer-net


# Run Docker images in a network for the container
-------------------------------------------------
=>docker container run --network consumer-producer-net --name docker-spring-boot-restcall-producer -p 8181:8181 -d imranmadbar/docker-spring-boot-restcall-producer

=>docker container run --network consumer-producer-net --name docker-spring-boot-restcall-consumer -p 8282:8282 -d imranmadbar/docker-spring-boot-restcall-consumer


