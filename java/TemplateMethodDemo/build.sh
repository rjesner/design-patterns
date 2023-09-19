#!/bin/sh
javac template_demo/*.java
jar cvfe template.jar template_demo/TemplateMethodDemo template_demo/TemplateMethodDemo.class template_demo/*.class
java -jar template.jar
