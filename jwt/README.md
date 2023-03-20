# Java Spring-Boot Jwt

## App

Web Spring boot application with `jjwt` dependency.

~~~xml
<dependencies>
	<dependency>
		<groupId>org.springframework.boot</groupId>
		<artifactId>spring-boot-starter-web</artifactId>
	</dependency>
	<dependency>
		<groupId>org.springframework.boot</groupId>
		<artifactId>spring-boot-starter-security</artifactId>
	</dependency>
	<dependency>
		<groupId>io.jsonwebtoken</groupId>
		<artifactId>jjwt</artifactId>
		<version>0.9.1</version>
	</dependency>
	<dependency>
		<groupId>jakarta.xml.bind</groupId>
		<artifactId>jakarta.xml.bind-api</artifactId>
	</dependency>
<dependencies>
~~~
#-- java/com/minte9/jwt/App.java --#

### Token auth

The client uses token to access the `protected` resources.

#--sh ../../hello.sh --#

### Controller

REST controller that implements the auth with `username/password`.

#-- java/com/minte9/jwt/AppRestController.java --#

### Config

Calls to `/user` are allowed, but all other calls require authentication.

#-- java/com/minte9/jwt/AppSecurityConfig.java --#

### Authorization

Implement the autorization process with `JWTAuthorizationFilter` class.

#-- java/com/minte9/jwt/JWTAuthorizationFilter.java --#

### References

https://www.educative.io/answers/session-based-authentication-vs-token-based-authentication
https://blog.softtek.com/en/token-based-api-authentication-with-spring-and-jwt
https://github.com/sebascastillo89/jwtDemo/tree/master/src/main/java/es/softtek/jwtDemo
https://minte9.com/ubuntu/tools-webservices-1453