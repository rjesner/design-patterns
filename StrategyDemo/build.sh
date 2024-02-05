#!/bin/sh
javac strategy_demo/*.java
jar cvfe strategy.jar strategy_demo/StrategyDemo strategy_demo/StrategyDemo.class strategy_demo/*.class
java -jar strategy.jar
