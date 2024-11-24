curl -X POST "http://localhost:8081/Medifli/favorites/1?idContent=1&idContent=2"

curl -X 'POST' 'http://localhost:8081/Medifli/users/login' -H 'accept: application/json' -H 'Content-Type: application/json' -d '{ "username": "semartinl","password": "12345" }'