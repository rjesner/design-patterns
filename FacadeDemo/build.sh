#!/bin/sh
javac facade_demo/*.java
jar cvfe facade.jar facade_demo/FacadeDemo facade_demo/FacadeDemo.class facade_demo/*.class
java -jar facade.jar
