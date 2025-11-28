\
    @echo off
    if not exist bin mkdir bin
    echo Compilando codigo Java...
    javac -d bin src\TemperatureControl.java
    echo Criando JAR...
    jar cfm TemperatureControl.jar manifest.txt -C bin .
    echo Finalizado: TemperatureControl.jar criado.
