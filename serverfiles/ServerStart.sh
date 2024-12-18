#!/bin/sh

# Read the settings.
. ./settings.sh

# Start the server.
start_server() {
    java -server -Xms${MIN_RAM} -Xmx${MAX_RAM} -XX:MaxMetaspaceSize=${Max_MetaspaceSize} ${JAVA_PARAMETERS} -jar ${SERVER_JAR} nogui
}

echo "Starting Starting Server..."
start_server
