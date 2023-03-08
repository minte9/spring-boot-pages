java spring-boot enable-https
https://www.tutorialspoint.com/spring_boot/spring_boot_enabling_https.htm

* Application

Spring web application on port 8443

#-- enable_https.java --#

http://127.0.0.1:8443/greeting


--- Certificate

Create self-signed certificate, using java keytool.

#--
# src/main/resources

keytool -genkey -alias tomcat -storetype PKCS12 -keyalg RSA -keysize 2048 -keystore keystore.p12 -validity 3650
--#

--- Configure

Save the certificate in certs/ folder in root application directory.

#--
# src/resources/application.properties

server.port:8443
server.ssl.key-store: certs/keystore.p12
server.ssl.key-store-password: ThePassword
server.ssl.keyStoreType: PKCS12
server.ssl.keyAlias: tomcat
--#

--- Run

Check that https is enabled on localhost.

#--
# mvn spring-boot:run

https://127.0.0.1:8443/hello
    # Hello World
--#

--- PKCS12

If you already have .crt and .key files generated, you need to convert them.

#--
openssl pkcs12 -export -in certs/myserver.crt -inkey certs/myserver.key -out certs/myserver.p12 -name myserver
--#