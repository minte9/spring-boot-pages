# Java Spring-Boot Security Auth

## Application

With `security` we automatically get basic authentication.

~~~xml
<dependency>
    <groupId>org.springframework.boot</groupId>
    <artifactId>spring-boot-starter-web</artifactId>
</dependency>
<dependency>
  <groupId>org.springframework.boot</groupId>
  <artifactId>spring-boot-starter-security</artifactId>
</dependency>
~~~

### Main

Spring web project with starter security and `thymeleaf` dependencies.

https://github.com/minte9/spring-boot-pages/blob/e2bcdedbe896c2d9be17ec51a0e85fa5dbb58e96/security_auth/src/main/java/com/minte9/security_auth/App.java#L9-L15

### Configure

Configure Spring MVC and set `view controllers` and templates.

https://github.com/minte9/spring-boot-pages/blob/e2bcdedbe896c2d9be17ec51a0e85fa5dbb58e96/security_auth/src/main/java/com/minte9/security_auth/MvcConfig.java#L10-L17

### Encrypt

Avoid storing raw password, `bcrypt` it with and Spring CLI.

~~~sh
spring encodepassword mypass

# {bcrypt}$2a$10$2wRXv3x28CiFAq966H93PeAvaRHKMF.ItkMC.CsPBdYTZ2xLO2sLy
~~~

### Store Password

Add `encrypted password` in application properties.

~~~sh
# src/main/resources/application.properties

spring.security.user.name=myuser
spring.security.user.password={bcrypt}$2a$10$2wRXv3x28CiFAq966H93...
~~~

### Templates

Add `login` form template.

https://github.com/minte9/spring-boot-pages/blob/e2bcdedbe896c2d9be17ec51a0e85fa5dbb58e96/security_auth/src/main/resources/templates/index.html#L1-L4

### Tests

Test `login` by accesing app entry points.

~~~sh
mvn spring-boot:run

http://localhost:8080/
http://localhost:8080/hello

# Please sign in 
# Please sign in 
~~~
