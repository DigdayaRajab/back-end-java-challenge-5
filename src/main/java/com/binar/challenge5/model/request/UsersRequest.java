package com.binar.challenge5.model.request;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.lang.NonNull;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class UsersRequest {
    private Integer idUser;

    @NonNull
    @Schema(example = "Rajab")
    private String username;

    @NonNull
    @Schema(example = "rajab@gmail.com")
    private String email;

    @NonNull
    @Schema(example = "Indonesia")
    private String address;

    @NonNull
    @Schema(example = "rajabpass")
    private String password;
}
