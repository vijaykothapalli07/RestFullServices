/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.rest.RestFullServices;

/**
 *
 * @author vijay
 */
public class UserNotFoundException  extends RuntimeException{
    
    public UserNotFoundException(String msg)
    {
        super(msg+" please try with different use id");
    }
    
}
