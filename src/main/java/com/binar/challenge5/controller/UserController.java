package com.binar.challenge5.controller;

        import com.binar.challenge5.model.CommonResponse;
        import com.binar.challenge5.model.CommonResponseGenerator;
        import com.binar.challenge5.model.request.UsersRequest;
        import com.binar.challenge5.service.Interface.UsersService;
        import org.springframework.beans.factory.annotation.Autowired;
        import org.springframework.http.HttpStatus;
        import org.springframework.http.ResponseEntity;
        import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/users")
public class UserController {
    @Autowired
    UsersService usersService;
    @Autowired
    CommonResponseGenerator commonResponseGenerator;

    @PostMapping(value = "/add", produces = "application/json", consumes = "application/json")
    public CommonResponse<ResponseEntity> addNewUser(@RequestBody UsersRequest paramUser) {
        try {
            return commonResponseGenerator.successResponse(new ResponseEntity(usersService.newUser(paramUser), HttpStatus.OK).getBody(), "Success Add Data");
        } catch (Exception e) {
            return commonResponseGenerator.failedResponse(new ResponseEntity("", HttpStatus.NO_CONTENT), e.getMessage());

        }
    }

    @PutMapping(value = "/update", produces = "application/json", consumes = "application/json")
    public CommonResponse<ResponseEntity> updateUser(@RequestBody UsersRequest paramUser) {
        try {
            return commonResponseGenerator.successResponse(new ResponseEntity(usersService.updateUser(paramUser), HttpStatus.OK).getBody(), "success Edit Data");
        } catch (Exception e) {
            return commonResponseGenerator.failedResponse(new ResponseEntity("", HttpStatus.NO_CONTENT), e.getMessage());

        }
    }

    @DeleteMapping("/delete")
    public CommonResponse<ResponseEntity> deleteUser(@RequestParam("id") int id_user) {
        try {
            usersService.deleteUser(id_user);
            return commonResponseGenerator.successResponse(new ResponseEntity("", HttpStatus.OK).getBody(), "Success Delete Data");
        } catch (Exception e) {
            return commonResponseGenerator.failedResponse(new ResponseEntity("", HttpStatus.NO_CONTENT), e.getMessage());

        }
    }


    @GetMapping(value = "getAllUser")
    public CommonResponse<ResponseEntity> getAllUser() {
        try {
            return commonResponseGenerator.successResponse(new ResponseEntity(usersService.findAllUser(), HttpStatus.OK).getBody(), "success");
        } catch (Exception e) {
            return commonResponseGenerator.failedResponse(new ResponseEntity("", HttpStatus.NO_CONTENT), e.getMessage());

        }
    }

    @GetMapping("/search/{id_user}")
    public CommonResponse<ResponseEntity> searcById(@PathVariable("id_user") Integer idUser) {
        try {
            return commonResponseGenerator.successResponse(new ResponseEntity(usersService.searchUserById(idUser), HttpStatus.OK).getBody(), "success");
        } catch (Exception e) {
            return commonResponseGenerator.failedResponse(new ResponseEntity("", HttpStatus.NO_CONTENT), e.getMessage());

        }
    }

    @GetMapping("/search")
    public CommonResponse<ResponseEntity> searcByUserName(@RequestParam("username") String usrName) {
        try {
            return commonResponseGenerator.successResponse(new ResponseEntity(usersService.searchUserByName(usrName), HttpStatus.OK).getBody(), "success");
        } catch (Exception e) {
            return commonResponseGenerator.failedResponse(new ResponseEntity("", HttpStatus.NO_CONTENT), e.getMessage());
        }
    }
}