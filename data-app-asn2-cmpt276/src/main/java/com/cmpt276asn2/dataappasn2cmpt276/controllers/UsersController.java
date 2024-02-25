package com.cmpt276asn2.dataappasn2cmpt276.controllers;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.cmpt276asn2.dataappasn2cmpt276.models.User;

@Controller
public class UsersController {
    @GetMapping("/users/view")
    public String getAllusers(Model model){
        System.out.println("Getting all users");

        List<User> users = new ArrayList<>();
        users.add(new User("bobby", "1234", 24));
        users.add(new User("bobby", "1234", 24));
        users.add(new User("bobby", "1234", 24));
        users.add(new User("bobby", "1234", 24));


        model.addAttribute("us", users);
        return "users/showAll";
    }
}