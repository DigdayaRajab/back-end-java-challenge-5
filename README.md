# API Spec Ticket Reservation


## User
### Create User
Request : 
- Method : POST
- EndPoint : `/users/add`
- Header :
   - Content-Type : application/json
   - Accept : application/json
- Body :
```json
{
  "username" : "String",
  "address" : "String",
  "email" : "String",
  "password" : "String"
}
```
- Response :
```json
{
  "code" : "number",
  "status" : "string",
  "data" : {
      "id_user": "Integer, unique",
      "username": "String",
      "address": "String",
      "email": "String",
      "password": "String"
    }
}
```

### Update User
Request :
- Method : PUT
- EndPoint : `/users/update`
- Header :
  - Content-Type : application/json
  - Accept : application/json
- Body :
```json
{
  "id" : "Integer",
  "username" : "String",
  "address" : "String",
  "email" : "String",
  "password" : "String"
}
```
- Response :
```json
{
  "code" : "number",
  "status" : "string",
  "data" : {
    "id_user": "Integer, unique",
    "username": "String",
    "address": "String",
    "email": "String",
    "password": "String"
  }
}
```

### Delete User
Request :
- Method : DELETE
- EndPoint : `/users/delete?{id}`
- Header :
  - Accept : application/json
- Response :
```json
{
  "code": "number",
  "status": "string"
}
```


### List User
Request :
- Method : GET
- EndPoint : `/users/getAllUser`
- Header :
  - Accept : application/json
- Response :
```json
{
  "code" : "number",
  "status" : "string",
  "data" : [
    {
      "id_user": "Integer, unique",
      "username": "String",
      "address": "String",
      "email": "String",
      "password": "String"
    },
    {
      "id_user": "Integer, unique",
      "username": "String",
      "address": "String",
      "email": "String",
      "password": "String"
    }
  ]
}
```


### Get User
Request :
- Method : GET
- EndPoint : `/users/search/{id_user}`
- Header :
  - Accept : application/json
- Response :
```json
{
  "code" : "number",
  "status" : "string",
  "data" : {
    "id_user": "Integer, unique",
    "username": "String",
    "address": "String",
    "email": "String",
    "password": "String"
  }
}
```


### Get User by name
Request :
- Method : GET
- EndPoint : `/users/search?{username}`
- Header :
  - Accept : application/json
- Response :
```json
{
  "code" : "number",
  "status" : "string",
  "data" : [
    {
      "id_user": "Integer, unique",
      "username": "String",
      "address": "String",
      "email": "String",
      "password": "String"
    },
    {
      "id_user": "Integer, unique",
      "username": "String",
      "address": "String",
      "email": "String",
      "password": "String"
    }
  ]
}
```



## Seats
### Create Seats
Request :
- Method : POST
- EndPoint : `/seats/add`
- Header :
  - Content-Type : application/json
  - Accept : application/json
- Body :
```json
{
  "seatId": {
    "studioName": "Character",
    "seatNo": "Integer"
  },
  "status": "String"
}
```
- Response :
```json
{
  "seatId": {
    "studioName": "Character",
    "seatNo": "Integer"
  },
  "status": "String"
}
```

### List Seats
Request :
- Method : GET
- EndPoint : `/users/getAllSeats`
- Header :
  - Accept : application/json
- Response :
```json
  [
    {
      "seatId": {
        "studioName": "Character",
        "seatNo": "Integer"
      },
      "status": "String"
    },
    {
      "seatId": {
        "studioName": "Character",
        "seatNo": "Integer"
      },
      "status": "String"
    }
  ]
```