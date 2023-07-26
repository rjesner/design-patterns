#!/bin/sh
javac proxy_demo/*.java
jar cvfe proxy.jar proxy_demo/ProxyDemo proxy_demo/ProxyDemo.class proxy_demo/*.class
java -jar proxy.jar
