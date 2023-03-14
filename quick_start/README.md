# Java Spring-Boot Quick Start

## Controller

Use `start.spring.io` to create a web project.

https://github.com/minte9/spring-boot-pages/blob/6d82eb1f2067eb689f35e2fe7e4f66ec04c6c16e/quick_start/src/main/java/com/minte9/quick_start/DemoApplication.java#L16-L34

### Build

The application build configuration is defined in `pom.xml` 

https://github.com/minte9/spring-boot-pages/blob/c650e862222dc8cdaef86bf9bccb22d219414bcf/quick_start/pom.xml#L1-L40

### Run

Build and run the application using `Maven` and test embedded Apache Tomcat server.

~~~
mvn spring-boot:run

http://localhost:8080/hello
    # Hello World

mvn package # compile and build
~~~

### References

https://spring.io/quickstart  
https://start.spring.io  
https://www.geeksforgeeks.org/difference-between-spring-and-spring-boot  
