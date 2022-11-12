# API Spec Ticket Reservation

- User
- Film
- Seat

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
  "username": "String",
  "address": "String",
  "email": "String",
  "password": "String"
}
```

- Response :

```json
{
  "code": "number",
  "status": "string",
  "data": {
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
  "id": "Integer",
  "username": "String",
  "address": "String",
  "email": "String",
  "password": "String"
}
```

- Response :

```json
{
  "code": "number",
  "status": "string",
  "data": {
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
  "code": "number",
  "status": "string",
  "data": [
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

### Get User by Id

Request :

- Method : GET
- EndPoint : `/users/search/{id_user}`
- Header :
    - Accept : application/json
- Response :

```json
{
  "code": "number",
  "status": "string",
  "data": {
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
- EndPoint : `/users/search?`
- Header :
    - Accept : application/json
- Params :

```json
{
  "username": "String"
}
```

- Response :

```json
{
  "code": "number",
  "status": "string",
  "data": [
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

## Film

### Create Film

Request :

- Method : POST
- EndPoint : `/films/add`
- Header :
    - Content-Type : application/json
    - Accept : application/json
- Body :

```json
{
  "filmCode": "Long",
  "filmName": "String",
  "isShow": "String"
}
```

- Response :

```json
{
  "code": "number",
  "status": "string",
  "data": {
    "idFilm": "Integer, unique",
    "filmCode": "Long",
    "filmName": "String",
    "isShow": "String"
  }
}
```

### Update Film

Request :

- Method : PUT
- EndPoint : `/films/update`
- Header :
    - Content-Type : application/json
    - Accept : application/json
- Body :

```json
{
  "idFilm": "Integer, unique",
  "filmCode": "Long",
  "filmName": "String",
  "isShow": "String"
}
```

- Response :

```json
{
  "code": "number",
  "status": "string",
  "data": {
    "idFilm": "Integer, unique",
    "filmCode": "Long",
    "filmName": "String",
    "isShow": "String"
  }
}
```

### Delete Film

Request :

- Method : DELETE
- EndPoint : `/films/delete?{id}`
- Header :
    - Accept : application/json
- Response :

```json
{
  "code": "number",
  "status": "string"
}
```

### List Film

Request :

- Method : GET
- EndPoint : `/films/getAllFilm`
- Header :
    - Accept : application/json
- Response :

```json
{
  "code": "number",
  "status": "string",
  "data": [
    {
      "idFilm": "Integer, unique",
      "filmCode": "Long",
      "filmName": "String",
      "isShow": "String"
    },
    {
      "idFilm": "Integer, unique",
      "filmCode": "Long",
      "filmName": "String",
      "isShow": "String"
    }
  ]
}
```

### Get Film by id

Request :

- Method : GET
- EndPoint : `/films/search/{id_film}`
- Header :
    - Accept : application/json
- Response :

```json
{
  "code": "number",
  "status": "string",
  "data": {
    "idFilm": "Integer, unique",
    "filmCode": "Long",
    "filmName": "String",
    "isShow": "String"
  }
}
```

### Get Film by name

Request :

- Method : GET
- EndPoint : `/films/search?`
- Header :
    - Accept : application/json
- Params :

```json
{
  "filmName": "String"
}
```

- Response :

```json
{
  "code": "number",
  "status": "string",
  "data": [
    {
      "idFilm": "Integer, unique",
      "filmCode": "Long",
      "filmName": "String",
      "isShow": "String"
    },
    {
      "idFilm": "Integer, unique",
      "filmCode": "Long",
      "filmName": "String",
      "isShow": "String"
    }
  ]
}
```

### Get Film by is Showing

Request :

- Method : GET
- EndPoint : `/films/show`
- Header :
    - Accept : application/json
- Response :

```json
{
  "code": "number",
  "status": "string",
  "data": [
    {
      "idFilm": "Integer, unique",
      "filmCode": "Long",
      "filmName": "String",
      "isShow": "String"
    },
    {
      "idFilm": "Integer, unique",
      "filmCode": "Long",
      "filmName": "String",
      "isShow": "String"
    }
  ]
}
```

### Get Schedule by film name

Request :

- Method : GET
- EndPoint : `/film/schedule?`
- Header :
    - Accept : application/json
- Params :

```json
{
  "filmName": "String"
}
```

- Response :

```json
{
  "code": "number",
  "status": "string",
  "data": [
    {
      "idFilm": "Integer, unique",
      "filmCode": "Long",
      "filmName": "String",
      "isShow": "String",
      "Schedules": {
        "showDate": "String",
        "startingHour": "String",
        "ticketPrice": "String",
        "ticketPrice": "String"
      }
    },
    {
      "idFilm": "Integer, unique",
      "filmCode": "Long",
      "filmName": "String",
      "isShow": "String",
      "Schedules": {
        "showDate": "String",
        "startingHour": "String",
        "ticketPrice": "String",
        "ticketPrice": "String"
      }
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