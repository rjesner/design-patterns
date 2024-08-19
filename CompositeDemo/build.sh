#!/bin/sh
javac composite_demo/*.java
jar cvfe composite.jar composite_demo/CompositeDemo composite_demo/CompositeDemo.class composite_demo/*.class
java -jar composite.jar
