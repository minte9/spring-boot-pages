# Java Spring-Boot Rest Service

## Dependencies

Simple RESTful `web service` with Spring on port 9090.

~~~xml
<dependency>
	<groupId>org.springframework.boot</groupId>
	<artifactId>spring-boot-starter-web</artifactId>
</dependency>
~~~

### Application

The service will handle GET requests for `/greeting` and return JSON response.

#-- java/com/minte9/rest_service/App.java --#

### Resource

In Spring RESTful web services, HTTP requests are handled by a `resource controller.`

#-- java/com/minte9/rest_service/GreetingController.java --#

### Representation

To model the greeting representation, create a `resource representation class.` 

#-- java/com/minte9/rest_service/Greeting.java --#

### Port

You might want to set a `different port` from 8080 for you application.

~~~ini
# src/main/resources/application.properties

server.port=9090
~~~

### Run

We can now `build adn run` the application and test the service.

~~~
mvn spring-boot:run

http://localhost:9090/
    # {"id":1,"content":"Hello World!"}

http://localhost:9090/?name=User
    # {"id":2,"content":"Hello User!"}
~~~