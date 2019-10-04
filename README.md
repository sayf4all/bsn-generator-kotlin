# bsn-generator-kotlin
Burger Service Nummer generator in Kotlin geschreven

# build
$ mvn clean install

# run 
java -jar target/bsn-generator-kotlin-0.0.1-SNAPSHOT.jar

```bash
curl http://localhost:8080/
```

```bash
curl -H "Content-Type: application/json" -X POST -d '{
    "firstName": "Bruno",
    "lastName": "Krebs"
}'  http://localhost:8080/
```


```bash
curl -X DELETE http://localhost:8080/1
```

```bash
curl -H "Content-Type: application/json" -X PUT -d '{
    "id": 6,
    "firstName": "Bruno",
    "lastName": "Simões Krebs"
}'  http://localhost:8080/6
```