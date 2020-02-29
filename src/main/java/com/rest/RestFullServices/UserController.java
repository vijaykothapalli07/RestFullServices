/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.rest.RestFullServices;

import java.net.URI;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

/**
 *
 * @author vijay
 */
@RestController 
public class UserController {
    
   @Autowired
   private UserDaoService service;
    
    @GetMapping("/users")
    private List<User> getAllUSers(){
        return service.getAllUsers();
    }
    
    
    @GetMapping("/users/{id}")
    private  User getUserById(@PathVariable int id){
        return service.getUserById(id);
    }
    
    @PostMapping("/users")
    private ResponseEntity putUser(@RequestBody User user){
         User  u1=   service.addUser(user); 
        URI  uri = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}").buildAndExpand(u1.getId()).toUri();
        return ResponseEntity.created(uri).build();
    }
    
    
    @DeleteMapping("/users/{id}")
    private  void deleteUserById(@PathVariable int id){
        service.deleteUserById(id);
    }
    
}
