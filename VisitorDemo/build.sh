#!/bin/sh
javac visitor_demo/*.java
jar cvfe visitor.jar visitor_demo/VisitorDemo visitor_demo/VisitorDemo.class visitor_demo/*.class
java -jar visitor.jar
