# Java Spring-Boot Quick Start

## Controller

Use `start.spring.io` to create a web project.

https://github.com/minte9/spring-boot-pages/blob/6d82eb1f2067eb689f35e2fe7e4f66ec04c6c16e/quick_start/src/main/java/com/minte9/quick_start/DemoApplication.java#L16-L34

### Build

The application build configuration is defined in `pom.xml` 

~~~xml
<?xml version="1.0" encoding="UTF-8"?>
<project xmlns="http://maven.apache.org/POM/4.0.0" 
    xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
    xsi:schemaLocation="http://maven.apache.org/POM/4.0.0 
        https://maven.apache.org/xsd/maven-4.0.0.xsd">
    <modelVersion>4.0.0</modelVersion>
    <parent>
        <groupId>org.springframework.boot</groupId>
        <artifactId>spring-boot-starter-parent</artifactId>
        <version>2.6.4</version>
        <relativePath/>
    </parent>
    <groupId>com.minte9</groupId>
    <artifactId>appSpringBootDemmo</artifactId>
    <version>0.0.1</version>
    <name>quick_start</name>
    <description>Demo project for Spring Boot</description>
    <properties>
        <java.version>11</java.version>
    </properties>
    <dependencies>
        <dependency>
            <groupId>org.springframework.boot</groupId>
            <artifactId>spring-boot-starter-web</artifactId>
        </dependency>
        <dependency>
            <groupId>org.springframework.boot</groupId>
            <artifactId>spring-boot-starter-test</artifactId>
            <scope>test</scope>
        </dependency>
    </dependencies>
    <build>
        <plugins>
            <plugin>
                <groupId>org.springframework.boot</groupId>
                <artifactId>spring-boot-maven-plugin</artifactId>
            </plugin>
        </plugins>
    </build>
</project>
~~~

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
https://geeksforgeeks.org/difference-between-spring-and-spring-boot  
https://minte9.com/java/maven-demo-1309
https://minte9.com/java/spring-boot-quick-start-1302  