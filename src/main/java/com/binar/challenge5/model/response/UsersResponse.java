package com.binar.challenge5.model.response;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class UsersResponse {
    private Integer idUser;
    private String username;
    private String email;
    private String address;
    private String password;
}
