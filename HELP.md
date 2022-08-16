# Getting Started

### Reference Documentation
For further reference, please consider the following sections:

* [Official Gradle documentation](https://docs.gradle.org)
* [Spring Boot Gradle Plugin Reference Guide](https://docs.spring.io/spring-boot/docs/2.7.2/gradle-plugin/reference/html/)
* [Create an OCI image](https://docs.spring.io/spring-boot/docs/2.7.2/gradle-plugin/reference/html/#build-image)
* [Spring Boot DevTools](https://docs.spring.io/spring-boot/docs/2.7.2/reference/htmlsingle/#using.devtools)
* [Spring Web](https://docs.spring.io/spring-boot/docs/2.7.2/reference/htmlsingle/#web)
* [Spring for Apache Kafka](https://docs.spring.io/spring-boot/docs/2.7.2/reference/htmlsingle/#messaging.kafka)

### Guides
The following guides illustrate how to use some features concretely:

* [Building a RESTful Web Service](https://spring.io/guides/gs/rest-service/)
* [Serving Web Content with Spring MVC](https://spring.io/guides/gs/serving-web-content/)
* [Building REST services with Spring](https://spring.io/guides/tutorials/rest/)

### Additional Links
These additional references should also help you:

* [Gradle Build Scans – insights for your project's build](https://scans.gradle.com#gradle)
### Below commands will start Kafka server
* D:\sw\kafka_2.13-3.2.0\bin\windows>zookeeper-server-start.bat ..\..\config\zookeeper.properties
* D:\sw\kafka_2.13-3.2.0\bin\windows>kafka-server-start.bat ..\..\config\server.properties
* D:\sw\kafka_2.13-3.2.0\bin\kafka-topics.sh --create --zookeeper localhost:2181 --replication-factor 1 --partitions 1 --topic userprofile-events
* D:\sw\kafka_2.13-3.2.0\bin\windows>kafka-console-consumer.bat kafka-console-consumer.bat --topic userprofile-events --bootstrap-server localhost:9092
* 

