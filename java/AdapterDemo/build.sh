#!/bin/sh
javac adapter_demo/*.java
jar cvfe adapter.jar adapter_demo/AdapterDemo adapter_demo/AdapterDemo.class adapter_demo/*.class
java -jar adapter.jar
