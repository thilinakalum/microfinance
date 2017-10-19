/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.ijse.absd.micro_finance.controller;

import edu.ijse.absd.micro_finance.model.User;
import edu.ijse.absd.micro_finance.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 *
 * @author Thilina Kalum
 */
@Controller
public class UserController {
    
    @Autowired
    private UserService userService;
    
    @RequestMapping(value = "/user" , method = RequestMethod.GET)
    public String viewUserView(ModelMap modelMap){
        modelMap.addAttribute("user" , new User());
        return "user";
    }
    @RequestMapping(value = "/user" , method = RequestMethod.POST)
    public String saveUserView(@ModelAttribute("user") User user){
        userService.saveUser(user);
        return "user";
    }
}
