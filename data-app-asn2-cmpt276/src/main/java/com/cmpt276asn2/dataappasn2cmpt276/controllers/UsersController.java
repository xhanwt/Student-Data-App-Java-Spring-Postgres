package com.cmpt276asn2.dataappasn2cmpt276.controllers;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.cmpt276asn2.dataappasn2cmpt276.models.Student;
import com.cmpt276asn2.dataappasn2cmpt276.models.UserRepository;

import jakarta.servlet.http.HttpServletResponse;

@Controller
public class UsersController {

    @Autowired
    private UserRepository userRepo;
    
    
    @GetMapping("/")
    public String getAllUsers(Model model){
        System.out.println("Getting all users");
        // get all users from database
        List<Student> users = userRepo.findAllByOrderByUid();
        // end of database call
        model.addAttribute("students", users);
        return "students/showAll";
    }

    @GetMapping("/students/get/{uid}")
    public String getUser(Model model, @PathVariable int uid){
        Student student = userRepo.findById(uid).get();
        // end of database call
        model.addAttribute("data", student);
        return "students/data";
    }


    
    
    @PostMapping("/students/add")
    public String addUser(@RequestParam Map<String, String> newuser, HttpServletResponse response){
        System.out.println("ADD user");
        String newName = newuser.get("name");
        String newHair = newuser.get("haircolor");
        int newWeight = Integer.parseInt(newuser.get("weight"));
        int newHeight = Integer.parseInt(newuser.get("height"));
        double newGpa = Double.parseDouble(newuser.get("gpa"));


        userRepo.save(new Student( newName,newWeight,newHeight,newHair,newGpa));
        response.setStatus(201);

        System.out.println("New user added successfully!");

        return "students/addedUser";
    }

    @PostMapping("/students/delete/{uid}")
    public String deleteUser(@PathVariable int uid) {
        userRepo.deleteById(uid);
        return "students/removedUser";
    }

    @PostMapping("/students/edit/{uid}")
    public String editStudent(@PathVariable int uid, @RequestParam Map<String, String> newuser, HttpServletResponse response) {
        Student student = userRepo.findById(uid).get();
        
        student.setName(newuser.get("name"));
        student.setWeight(Integer.parseInt(newuser.get("weight")));
        student.setHeight(Integer.parseInt(newuser.get("height")));
        student.setHaircolor(newuser.get("haircolor"));
        student.setGpa(Double.parseDouble(newuser.get("gpa")));
        userRepo.save(student);
        return "students/editedUser";
    }

}