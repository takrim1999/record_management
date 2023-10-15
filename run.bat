@echo off

javac source\StudentManagement.java

move source\*.class .

set CLASS_PATH=classes

java -cp "%CLASS_PATH%" StudentManagement
