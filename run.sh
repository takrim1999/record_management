#!/usr/bin/bash
# ls
javac source/StudentManagement.java
mv source/*.class classes/
CLASS_PATH="classes"
cd "$CLASS_PATH"
java StudentManagement