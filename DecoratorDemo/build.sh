#!/bin/sh
javac decorator_demo/*.java
jar cvfe decorator.jar decorator_demo/DecoratorDemo decorator_demo/DecoratorDemo.class decorator_demo/*.class
java -jar decorator.jar
