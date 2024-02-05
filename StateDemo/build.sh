#!/bin/sh
javac state_demo/*.java
jar cvfe state.jar state_demo/StateDemo state_demo/StateDemo.class state_demo/*.class
java -jar state.jar
