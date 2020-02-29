/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.rest.RestFullServices;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import org.springframework.stereotype.Component;

/**
 *
 * @author vijay
 */
@Component
public class UserDaoService {
    
    
    private static final List<User> users = new ArrayList<>();
    
    private static int userCount =3;
    
    static{
        users.add(new User(1,"Adam",new Date()));
        users.add(new User(2,"Eve",new Date()));
        users.add(new User(3,"Jack",new Date()));
          
    }
    
    public List<User> getAllUsers(){
        return users;
    }
    
    public User getUserById(int id) {
        User result = null; 
        for(User u:users){
           if(u.getId() == id )
               result = u;
        }
        if(result == null)
             throw new UserNotFoundException("User Not Exist "+id);
        else 
        return result;
    }
    
    
   public User addUser(User u){
       if(null == u.getId()){
           u.setId(++userCount);
       }
       users.add(u);
       return u;
   }
   
    public User deleteUserById(int id) {
        Iterator<User>  iterator = users.iterator();
        User result  = null;
        while(iterator.hasNext()){                        
           if(iterator.next().getId() == id ){
               result = iterator.next(); 
               iterator.remove();
           }           
        }
         if(result == null)
             throw new UserNotFoundException("User Not Exist "+id);
        else 
        return result;
         
    }
    
}
