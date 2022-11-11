package com.binar.challenge5.controller;

import com.binar.challenge5.entities.Users;
import com.binar.challenge5.model.CommonResponse;
import com.binar.challenge5.model.CommonResponseGenerator;
import com.binar.challenge5.model.request.UsersRequest;
import com.binar.challenge5.service.Interface.UsersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/users")
public class UserController {
    @Autowired
    UsersService usersService;
    @Autowired
    CommonResponseGenerator commonResponseGenerator;

    @PostMapping(value = "/add", produces = "application/json", consumes = "application/json")
    public CommonResponse<ResponseEntity> addNewUser(@RequestBody UsersRequest paramUser) {
//        Map<String, Object> response = new HashMap<>();
//        try {
//
        return commonResponseGenerator.successResponse(new ResponseEntity(usersService.newUser(paramUser), HttpStatus.OK).getBody(), "Success Add Data");
//        } catch (Exception e) {
//
//        }
    }

    @PutMapping(value = "/update", produces = "application/json", consumes = "application/json")
    public CommonResponse<ResponseEntity> updateUser(@RequestBody UsersRequest paramUser) {
//        try {
            return commonResponseGenerator.successResponse(new ResponseEntity(usersService.updateUser(paramUser), HttpStatus.OK).getBody(), "Success Edit Data");
//        } catch (Exception e) {
//
//            return new ResponseEntity(response, HttpStatus.BAD_GATEWAY);
//        }
    }

    @DeleteMapping("/delete")
    public CommonResponse<ResponseEntity> deleteUser(@RequestParam("id") int id_user) {
//        try {
            usersService.deleteUser(id_user);

            return commonResponseGenerator.successResponse(new ResponseEntity( "", HttpStatus.OK).getBody(), "Success Delete Data");
//
//        } catch (Exception e) {
//            response.put("code", "502");
//            response.put("status", "error");
//            response.put("message", e.getMessage());
//            return new ResponseEntity(response, HttpStatus.BAD_GATEWAY);
//        }
    }


    @GetMapping(value = "getAllUser")
    public CommonResponse<ResponseEntity> getAllUser() {
//        Map<String, Object> response = new HashMap<>();
//        try {
//            List<Users> user = usersService.findAllUser();
//
//            response.put("code", "200");
//            response.put("status", "success");
//            response.put("data", user);
//            return new ResponseEntity(response, HttpStatus.OK);
            return commonResponseGenerator.successResponse(new ResponseEntity( usersService.findAllUser(), HttpStatus.OK).getBody(), "success");
//
//        } catch (Exception e) {
//            response.put("code", "502");
//            response.put("status", "error");
//            response.put("message", e.getMessage());
//            return new ResponseEntity(response, HttpStatus.BAD_GATEWAY);
//        }
    }

    @GetMapping("/search/{id_user}")
    public CommonResponse<ResponseEntity> searcById(@PathVariable("id_user") Integer idUser) {

//        Map<String, Object> response = new HashMap<>();
//        try {
//            Users user = usersService.searchUserById(idUser);
        return commonResponseGenerator.successResponse(new ResponseEntity( usersService.searchUserById(idUser), HttpStatus.OK).getBody(), "Success Delete Data");
//            response.put("code", "200");
//            response.put("status", "success");
//            response.put("data", user);
//            return new ResponseEntity(response, HttpStatus.OK);
//        } catch (IndexOutOfBoundsException | NullPointerException e) {
//            response.put("code", "204");
//            response.put("status", "error");
//            response.put("message", e.getMessage());
//            return new ResponseEntity(response, HttpStatus.NO_CONTENT);
//        }
    }

    @GetMapping("/search")
    public CommonResponse<ResponseEntity> searcByUserName(@RequestParam("username") String usrName) {
//        Map<String, Object> response = new HashMap<>();
//        try {
//            List<Users> user = usersService.searchUserByName(usrName);
        return commonResponseGenerator.successResponse(new ResponseEntity( usersService.searchUserByName(usrName), HttpStatus.OK).getBody(), "Success Delete Data");
//
//            response.put("code", "200");
//            response.put("status", "success");
//            response.put("data", user);
//            return new ResponseEntity(response, HttpStatus.OK);
//        } catch (IndexOutOfBoundsException iofb) {
//            response.put("code", "204");
//            response.put("status", "error");
//            return new ResponseEntity(response, HttpStatus.NO_CONTENT);
//        }
    }

}

//
//          1 Menambahkan film baru (POST)
//          2. Mengupdate nama film (PUT)
//        3. Menghapus film (DELETE)

//        4. Menampilkan film yang sedang tayang (GET)
//        5. Menampilkan jadwal dari film tertentu (POST)

//        6. Menambahkan User (POST)
//        7. Mengupdate user (PUT)
//        8. Menghapus User (DELETE)