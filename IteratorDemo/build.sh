#!/bin/sh
javac iterator_demo/*.java
jar cvfe iterator.jar iterator_demo/IteratorDemo iterator_demo/IteratorDemo.class iterator_demo/*.class
java -jar iterator.jar
