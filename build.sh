#!/bin/bash
set -e
echo "Compilando código Java..."
mkdir -p bin
javac -d bin src/TemperatureControl.java
echo "Criando JAR..."
jar cfm TemperatureControl.jar manifest.txt -C bin .
echo "Finalizado: TemperatureControl.jar criado."
