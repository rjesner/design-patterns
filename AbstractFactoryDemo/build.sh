#!/bin/sh
javac abstract_factory_demo/*.java
jar cvfe abstract_factory.jar abstract_factory_demo/AbstractFactoryDemo abstract_factory_demo/AbstractFactoryDemo.class abstract_factory_demo/*.class
java -jar abstract_factory.jar
