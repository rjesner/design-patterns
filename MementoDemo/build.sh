#!/bin/sh
javac memento_demo/*.java
jar cvfe memento.jar memento_demo/MementoDemo memento_demo/MementoDemo.class memento_demo/*.class
java -jar memento.jar
