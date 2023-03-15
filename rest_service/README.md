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

The service will handle GET `requests` and return JSON response.

https://github.com/minte9/spring-boot-pages/blob/5f15542aa09cc696e79eb62d0b88bd3031ef36da/rest_service/src/main/java/com/minte9/rest_service/App.java#L14-L21

### Resource

In Spring RESTful web services, HTTP requests are handled by a `resource controller.`

https://github.com/minte9/spring-boot-pages/blob/5f15542aa09cc696e79eb62d0b88bd3031ef36da/rest_service/src/main/java/com/minte9/rest_service/GreetingController.java#L14-L29

### Representation

To model the greeting representation, create a `resource representation class.` 

https://github.com/minte9/spring-boot-pages/blob/5f15542aa09cc696e79eb62d0b88bd3031ef36da/rest_service/src/main/java/com/minte9/rest_service/Greeting.java#L7-L25

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

http://localhost:9090/greeting/
    # {"id":1,"content":"Hello World!"}

http://localhost:9090/greeting/?name=User
    # {"id":2,"content":"Hello User!"}
~~~
