# API Spec Ticket Reservation

- User
- Film
- Seat
- Schedule
- Invoice

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
  "films":{
    "filmCode": "String",
    "filmName": "String",
    "isShow": "Show",
    "schedules": [
      {
        "showDate": "2022-11-28",
        "startingHour": "12.00",
        "endingHour": "13.00",
        "ticketPrice": "50000"
      },{
        "showDate": "2022-11-28",
        "startingHour": "16.00",
        "endingHour": "17.00",
        "ticketPrice": "60000"
      },{
        "showDate": "2022-11-28",
        "startingHour": "20.00",
        "endingHour": "21.00",
        "ticketPrice": "40000"
      }
    ]
  }
}
```

- Response :

```json
{
  "status": "number",
  "message": "string",
  "data": {
    "idFilm": "Integer, unique",
    "filmCode": "String",
    "filmName": "String",
    "isShow": "String",
    "schedules": [
      {
        "idSchedule": 69,
        "showDate": "2022-11-28",
        "startingHour": "12.00",
        "endingHour": "13.00",
        "ticketPrice": "50000"
      },
      {
        "idSchedule": 70,
        "showDate": "2022-11-28",
        "startingHour": "16.00",
        "endingHour": "17.00",
        "ticketPrice": "60000"
      },
      {
        "idSchedule": 71,
        "showDate": "2022-11-28",
        "startingHour": "20.00",
        "endingHour": "21.00",
        "ticketPrice": "40000"
      }
    ]
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
  "filmCode": "String",
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
    "filmCode": "String",
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
  "status": "number",
  "message": "string",
  "data": [
    {
      "filmName": "string",
      "isShow": "string",
      "showDate": "2022-11-25",
      "startingHour": "12.00",
      "endingHour": "13.00",
      "ticketPrice": "50000"
    },
    {
      "filmName": "string",
      "isShow": "string",
      "showDate": "2022-11-25",
      "startingHour": "16.00",
      "endingHour": "17.00",
      "ticketPrice": "60000"
    }
  ]
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
  "status": "number",
  "message": "string",
  "data": [
    {
      "filmName": "string",
      "isShow": "string",
      "showDate": "2022-11-25",
      "startingHour": "12.00",
      "endingHour": "13.00",
      "ticketPrice": "50000"
    },
    {
      "filmName": "string",
      "isShow": "string",
      "showDate": "2022-11-25",
      "startingHour": "16.00",
      "endingHour": "17.00",
      "ticketPrice": "60000"
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
  "status": "number",
  "message": "string",
  "data": [
    {
      "filmName": "string",
      "isShow": "string",
      "showDate": "2022-11-25",
      "startingHour": "12.00",
      "endingHour": "13.00",
      "ticketPrice": "50000"
    },
    {
      "filmName": "string",
      "isShow": "string",
      "showDate": "2022-11-25",
      "startingHour": "16.00",
      "endingHour": "17.00",
      "ticketPrice": "60000"
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
  "code": "number",
  "status": "string",
  "data": {
    "seatId": {
      "studioName": "Character",
      "seatNo": "Integer"
    },
    "status": "String"
  }
}
```

### Update Seats

Request :

- Method : PUT
- EndPoint : `/seats/update`
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
  "code": "number",
  "status": "string",
  "data": {
    "seatId": {
      "studioName": "Character",
      "seatNo": "Integer"
    },
    "status": "String"
  }
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
{
  "code": "number",
  "status": "string",
  "data": [
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
}
```
### Delete Seats

Request :

- Method : DELETE
- EndPoint : `/seats/delete`
- Header :
  - Content-Type : application/json
  - Accept : application/json
- Body :

```json
{
  "seatId": {
    "studioName": "Character",
    "seatNo": "Integer"
  }
}
```

- Response :

```json
{
  "code": "number",
  "status": "string"
}
```









## Schedules

### Create Schedules

Request :

- Method : POST
- EndPoint : `/schedules/add`
- Header :
  - Content-Type : application/json
  - Accept : application/json
- Body :

```json
{
  "showDate": "2022-12-22",
  "startingHour": "22.00",
  "endingHour": "23.00",
  "ticketPrice": "22222",
  "codeFilm": "Integer, Unique"
}
```

- Response :

```json
{
  "status": "Integer",
  "message": "String",
  "data": {
    "idSchedule": "Integer, Unique",
    "showDate": "2022-12-22",
    "startingHour": "22.00",
    "endingHour": "23.00",
    "ticketPrice": "22222",
    "fsFk": "Integer, Unique"
  }
}
```

### Update Schedules

Request :

- Method : PUT
- EndPoint : `/schedules/update`
- Header :
  - Content-Type : application/json
  - Accept : application/json
- Body :

```json
{
  "idSchedule": "Integer, Unique",
  "showDate": "2022-12-22",
  "startingHour": "22.00",
  "endingHour": "23.00",
  "ticketPrice": "22222",
  "codeFilm": "Integer, Unique"
}
```

- Response :

```json
{
  "status": "Integer",
  "message": "String",
  "data": {
    "idSchedule": "Integer, Unique",
    "showDate": "2022-12-22",
    "startingHour": "22.00",
    "endingHour": "23.00",
    "ticketPrice": "22222",
    "fsFk": "Integer, Unique"
  }
}
```

### Delete Schedules

Request :

- Method : DELETE
- EndPoint : `/schedules/delete?{id}`
- Header :
  - Accept : application/json
- Response :
```json
{
  "code": "number",
  "status": "string"
}
```

### List Schedules

Request :

- Method : GET
- EndPoint : `/schedules/getAllSchedules`
- Header :
  - Accept : application/json
- Response :

```json
{
  "status": "Integer",
  "message": "String",
  "data": [{
    "idSchedule": "Integer, Unique",
    "showDate": "2022-12-22",
    "startingHour": "22.00",
    "endingHour": "23.00",
    "ticketPrice": "22222",
    "fsFk": "Integer, Unique"
  },{
    "idSchedule": "Integer, Unique",
    "showDate": "2022-12-22",
    "startingHour": "22.00",
    "endingHour": "23.00",
    "ticketPrice": "22222",
    "fsFk": "Integer, Unique"
  }]
}
```

### Get Schedules by FilmId

Request :

- Method : GET
- EndPoint : `/schedules/getSchedulesByFilmId?{id}`
- Header :
  - Accept : application/json
- Response :

```json
{
  "status": "Integer",
  "message": "String",
  "data": {
    "idSchedule": "Integer, Unique",
    "showDate": "2022-12-22",
    "startingHour": "22.00",
    "endingHour": "23.00",
    "ticketPrice": "22222",
    "fsFk": "Integer, Unique"
  }
}
```






## Invoice

### Get Invoice

Request :

- Method : POST
- EndPoint : `/invoice/getInvoice`
- Header :
  - Content-Type : application/json
  - Accept : application/json
- Body :

```json
{
  "idUser": "Integer, unique",
  "idFilm": "Integer, unique",
  "showDate": "2022-11-25",
  "startingHour": "12.00",
  "studioName": "Character, unique",
  "seatNo": "Integer, unique"
}
```
- Response :

```
   Invoice Pdf
   Seat Status set to "ordered"
```