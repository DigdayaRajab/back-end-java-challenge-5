package com.binar.challenge5.controller;

import com.binar.challenge5.model.CommonResponse;
import com.binar.challenge5.model.CommonResponseGenerator;
import com.binar.challenge5.model.request.InvoiceRequest;
import com.binar.challenge5.service.Interface.InvoiceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletResponse;

@RestController
@RequestMapping("/invoice")
public class InvoiceController {
    @Autowired
    InvoiceService invoiceService;
    @Autowired
    CommonResponseGenerator commonResponseGenerator;


    @PostMapping("/getInvoice")
    public CommonResponse<ResponseEntity> getInvoice(HttpServletResponse response, @RequestBody InvoiceRequest invoiceRequest) {
        try {
            invoiceService.generateInvoice(response, invoiceRequest);
        } catch (Exception e) {
            return commonResponseGenerator.failedResponse(new ResponseEntity("", HttpStatus.NO_CONTENT), e.getMessage());
        }
        return null;
    }

}
