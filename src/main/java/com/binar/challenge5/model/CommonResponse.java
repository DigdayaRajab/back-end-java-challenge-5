package com.binar.challenge5.model;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class CommonResponse<T> {
    private String status;
    private String message;
    private T data;
}
