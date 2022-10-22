package com.example.rest.service;

import org.springframework.stereotype.Service;
import com.example.rest.domain.User;

@Service
public class LoginService {

    private static User user1 = new User("박나영", "23");

    public Boolean signUp(User user){
        if (user1.getAge()==user.getAge() && user1.getName().equals(user.getName()))
            return true;

        return false;
    }
}
