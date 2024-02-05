#!/bin/sh
javac factory_demo/*.java
jar cvfe factory.jar factory_demo/FactoryDemo factory_demo/FactoryDemo.class factory_demo/*.class
java -jar factory.jar
