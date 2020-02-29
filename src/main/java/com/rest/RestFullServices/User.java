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

public class User {
    
    
    private Integer id;
    private String name ;
    private Date DOB;

    protected User() {
    }

    public User(int id, String name, Date DOB) {
        
        super();
        this.id = id;
        this.name = name;
        this.DOB = DOB;
    }

    
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getDOB() {
        return DOB;
    }

    public void setDOB(Date DOB) {
        this.DOB = DOB;
    }
    
    
    
    
    
}
