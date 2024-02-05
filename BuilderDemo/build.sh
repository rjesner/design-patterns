#!/bin/sh
javac builder_demo/*.java
jar cvfe builder.jar builder_demo/BuilderDemo builder_demo/BuilderDemo.class builder_demo/*.class
java -jar builder.jar
