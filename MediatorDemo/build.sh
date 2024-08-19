#!/bin/sh
javac mediator_demo/*.java
jar cvfe mediator.jar mediator_demo/MediatorDemo mediator_demo/MediatorDemo.class mediator_demo/*.class
java -jar mediator.jar
