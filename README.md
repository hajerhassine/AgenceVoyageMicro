# AgenceVoyageMicro


Description:
We have chosen as Subject "Travel agency".
The idea is to transform a database in which there is information about the travel agency to a set of microservices.
Distributed architecture or distributed computing refers to an information system or a network for which all the available resources are not located in the same place or on the same machine for this we used Docker.
The frameworks are Spring Boot for the Backend and Angular as the Frontend.
6 services are implemented: User(NodeJs), Reservation, Hotel, Guest House, and Transport.
The servers are: Eureka, API Gateway and Config.
Overview
The architecture is composed by eight services: Eureka: Service Discovery Server created with Eureka.
User: Simple REST service created with NodeJS,mongodb
Booking: Simple REST service created with Spring Boot, Spring Data JPA, H2
Hotel: Simple REST service created with Spring Boot, Spring Data JPA, H2
Guest House: Simple REST service created with Spring Boot, Spring Data JPA, MySQL
Transport : Simple REST service created with Spring Boot, Spring Data JPA, H2
Offer : Simple REST service created with Spring Boot, Spring Data JPA, MySQL
Tools :
Maven 3.0+
IDE STS-4.4.13-RELEASE
 Eclipse Visual Studio.
H2, MongoDb
JDK 1.8+
Docker Desktop
Microservice Running Process:
First we need to run Eureka
Second we need to run our MSs
Finally we need to run Api gateway-server, if we did run Api gateway-server  before running the microservices then we have to wait approximately 10 second
Eureka Service
Eureka Server is an application that holds the information about all client-service applications. Every Micro service will register into the Eureka server and Eureka server knows all the client applications running on each port and IP address.
Eureka Server is also known as Discovery Server.
Implementing a Eureka Server for service registry is as easy as we need to add @EnableEurekaServer annotation.
The @EnableEurekaServer annotation is used to make your Spring Boot application acts as a Eureka Server.
@SpringBootApplication @EnableEurekaServer public class EurekaApplication { public static void main(String[] args) {
	SpringApplication.run(EurekaApplication.class, args);
}
}
we should make sure Spring cloud Eureka server dependency is added in our build configuration file. The code for Maven user dependency is shown below −
org.springframework.cloud spring-cloud-starter-netflix-eureka-server
By default, the Eureka Server registers itself into the discovery. we added the below given configuration into our application.properties
Give a name to the eureka server
spring.application.name=eureka-service
default port for eureka server
server.port=8761 eureka.client.register-with-eureka=false eureka.client.fetch-registry=false
eureka by default will register itself as a client. So, we need to set it to false.
Client MS
eureka.client.register-with-eureka=true eureka.client.fetch-registry=false
API Gateway Service
A common problem, when building microservices, is to provide a unique gateway to the client applications of our system. The fact that our services are split into small microservices apps that shouldn’t be visible to users otherwise it may result in substantial development/maintenance efforts. Also there are scenarios when whole ecosystem network traffic may be passing through a single point which could impact the performance of the cluster.
Micro Service Spring
Micro Services User, Booking, Hotel, Guest House,Transport, Offers :
( POST )- /api/../add => Ajouter ( PUT ) - /api/../edit/{id} => Modifier ( DELETE ) - /api/../delete/{id} => Suprrimer ( GET ) - /api/../list => Afficher la liste des données ( GET ) - /api/../get/{id} => Afficher les détails d'un seul donnée
Micro Service Node
Micro Service User :
( POST )- /api/users/login  => Ajouter 
(PoST) - /api/users/register
Config Server
Config Server is used for all MS, already configured.







