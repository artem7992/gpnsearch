java -Dcom.sun.management.jmxremote=true -Dcom.sun.management.jmxremote.port=6001 \
-Dcom.sun.management.jmxremote.authenticate=false \
-Dcom.sun.management.jmxremote.ssl=false -Djava.rmi.server.hostname=localhost \
-Dcom.sun.management.jmxremote.rmi.port=6001 -jar ./target/gpnsearch-0.0.1-SNAPSHOT.jar