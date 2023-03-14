# Java Spring-Boot Quick Start

## Controller

Use `start.spring.io` to create a web project.

#-- java/com/minte9/quick_start/DemoApplication.java --#

### Build

The application build configuration is defined in `pom.xml`

~~~
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
https://www.geeksforgeeks.org/difference-between-spring-and-spring-boot  