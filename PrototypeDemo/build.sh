#!/bin/sh
javac prototype_demo/*.java
jar cvfe prototype.jar prototype_demo/PrototypeDemo prototype_demo/PrototypeDemo.class prototype_demo/*.class
java -jar prototype.jar
