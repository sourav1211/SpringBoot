package com.sourav.mynewspringbootapp.controller;

import com.sourav.mynewspringbootapp.model.User;
import com.sourav.mynewspringbootapp.services.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
//@RequestMapping("/view")
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping (value = "/view/addUser", method = RequestMethod.POST)
    public String createUser(@ModelAttribute User user, Model model){


        userService.addUser(user);
        return "/login";
    }

}
