# Java Spring-Boot Scheduled Task

## Awaitility

Initialize a spring new project and add `awaitility` library as dependency in pom.xml

~~~xml
<dependency>
  <groupId>org.awaitility</groupId>
  <artifactId>awaitility</artifactId>
  <version>3.1.2</version>
  <scope>test</scope>
</dependency>
~~~

### Enable

Enable scheduling in you App with `@EnableScheduling` annotation.

#-- java/com/minte9/scheduled_task/App.java --# 

### Task

Create you `component` class to manage scheduled tasks.

#-- java/com/minte9/scheduled_task/Task.java --# 

### Run

Compile and `run` you application.

~~~sh
mvn spring-boot:run

# Time is: 17:36:24
# Time is: 17:36:25
# Time is: 17:36:26
~~~