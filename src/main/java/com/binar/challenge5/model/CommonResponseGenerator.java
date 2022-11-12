package com.binar.challenge5.model;

import lombok.extern.apachecommons.CommonsLog;
import org.springframework.stereotype.Component;

@Component
public class CommonResponseGenerator<T> {

    public <T> CommonResponse<T> successResponse(T data, String message){
        CommonResponse commonResponse = new CommonResponse<>();
        commonResponse.setStatus("200");
        commonResponse.setMessage(message);
        commonResponse.setData(data);

        return commonResponse;
    }
    public <T> CommonResponse<T> failedResponse(T data, String message){
        CommonResponse commonResponse = new CommonResponse<>();
        commonResponse.setStatus("500");
        commonResponse.setMessage(message);

        return commonResponse;
    }
}
