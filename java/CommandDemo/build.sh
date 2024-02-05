#!/bin/sh
javac command_demo/*.java
jar cvfe command.jar command_demo/CommandDemo command_demo/CommandDemo.class command_demo/*.class
java -jar command.jar
