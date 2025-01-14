# Simple Hello World JBoss App

## Build and deploy the application

To build the app use 
```
mvn clean package
```

and then copy the 

```
 target/jboss-hello.war
```

to your JBoss deployment directory (in my case: `/opt/eap/standalone/deployments/`).

## Test with curl

```
curl http://localhost:8080/jboss-hello/rest/hello
```