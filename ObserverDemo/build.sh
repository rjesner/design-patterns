#!/bin/sh
javac observer_demo/*.java
jar cvfe observer.jar observer_demo/ObserverDemo observer_demo/ObserverDemo.class observer_demo/*.class
java -jar observer.jar
