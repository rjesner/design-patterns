#!/bin/sh
javac flyweight_demo/*.java
jar cvfe flyweight.jar flyweight_demo/FlyweightDemo flyweight_demo/FlyweightDemo.class flyweight_demo/*.class
java -jar flyweight.jar
