# A simple thrift example
From https://dzone.com/articles/apache-thrift-java-quickstart

+ Start a Jaeger instance.
+ `thrift -r --gen java add.thrift ` To generate required classes
+ `mvn -Pserver clean install exec:java` To run the server
+ `mvn -Pclient clean install exec:java` To run the client

