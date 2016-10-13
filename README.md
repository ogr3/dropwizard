Hello World using Dropwizard fat JAR
====================================
The sample program from [Dropwizard](http://dropwizard.io), extended with [Project Lombok](https://projectlombok.org/) support.

Build
=====
    mvn install

Run
===
    java -jar target/dropwizard-1.0-SNAPSHOT.jar server src/main/resources/hello-world.yml
