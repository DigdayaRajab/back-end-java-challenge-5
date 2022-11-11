# API Spec

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
      "password": "String",
      "createdAt": "date",
      "updateAt": "date"
    }
}
```

### Update User
Request :
- Method : PUT
- EndPoint : `/api/users/{id_product}`
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
    "password": "String",
    "createdAt": "date",
    "updateAt": "date"
  }
}
```

### Delete User
Request :
- Method : DELETE
- EndPoint : `/users/delete/{id_user}`
- Header :
  - Accept : application/json
- Response :
```json
{
  "code": "number",
  "status": "string"
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
    "password": "String",
    "createdAt": "date",
    "updateAt": "date"
  }
}
```

### List User
Request :
- Method : GET
- EndPoint : `/users/getAllUser`
- Header :
  - Accept : application/json
- Query Param :
  - size : number,
  - page : number
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
      "password": "String",
      "createdAt": "date",
      "updateAt": "date"
    },
    {
      "id_user": "Integer, unique",
      "username": "String",
      "address": "String",
      "email": "String",
      "password": "String",
      "createdAt": "date",
      "updateAt": "date"
    }
  ]
}
```

