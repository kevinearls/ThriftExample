# A simple thrift example
From https://dzone.com/articles/apache-thrift-java-quickstart

+ Start a Jaeger instance.
+ `thrift -r --gen java add.thrift ` To generate required classes.  
+ `mvn clean install`
+ `mvn -Pserver exec:java` To run the server
+ `mvn -Pclient exec:java` To run the client

