/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.rest.RestFullServices;

import java.util.Date;

/**
 *
 * @author vijay
 */
public class ResponseException {
    
    private Date timestamp;
    private String message;
    private String details;

    public ResponseException(Date timestamp, String message, String details) {
        super();
        this.timestamp = timestamp;
        this.message = message;
        this.details = details;
    }

    public Date getTimestamp() {
        return timestamp;
    }
 
    public String getMessage() {
        return message;
    }

    public String getDetails() {
        return details;
    }
    
    
}
