package com.term.demo.cotroller;

import com.term.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/springBoot")
public class UserController {

    @Autowired
    private UserService service;
    @RequestMapping("getUser/{id}")
    public String getUser(@PathVariable int id){
        return service.getUserById(id).toString();
    }

}
