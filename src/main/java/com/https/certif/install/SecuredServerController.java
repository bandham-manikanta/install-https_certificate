package com.https.certif.install;

import java.util.Date;

import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SecuredServerController {

    @RequestMapping(value = "/https/secured", method = {
            RequestMethod.GET }, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<String> sendStatusCode400() {
        String message = "{\"message\":\"It is secured HTTPS protocal API\"}";
        return new ResponseEntity<>(message, HttpStatus.BAD_REQUEST);
    }
}