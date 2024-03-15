package com.example.demo.Service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Dao.UserDao;
import com.example.demo.Model.User;

@Service
public class UserService {

    @Autowired
    private UserDao userDao;

    public void register(User user) {
        if(userDao.findByEmail(user.getEmail())!=null){
                   
            return ;
        }
       if(user!=null){
        System.out.println("D");
        System.out.println(user.getPassword());
        System.out.println(user.getEmail());
        System.out.println(user.getUsername());
        userDao.save(user);
       }
        
        System.out.println("E");
    }
    
    public String login(String username, String password) {
        System.out.println("A");
        User user = userDao.findByUsername(username);
        if(user==null)
        System.out.println("b");
        else
        System.out.println(user.getPassword());
        if (user != null && user.getPassword().equals(password)) {
            return user.getUsername();
        } else {
            return null;
        }
    }
}