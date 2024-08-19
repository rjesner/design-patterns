#!/bin/sh
javac bridge_demo/*.java
jar cvfe bridge.jar bridge_demo/BridgeDemo bridge_demo/BridgeDemo.class bridge_demo/*.class
java -jar bridge.jar
