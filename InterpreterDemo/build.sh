#!/bin/sh
javac interpreter_demo/*.java
jar cvfe interpreter.jar interpreter_demo/InterpreterDemo interpreter_demo/InterpreterDemo.class interpreter_demo/*.class
java -jar interpreter.jar
