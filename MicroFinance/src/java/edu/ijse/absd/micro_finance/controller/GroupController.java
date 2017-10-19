/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.ijse.absd.micro_finance.controller;

import edu.ijse.absd.micro_finance.model.Group1;
import edu.ijse.absd.micro_finance.service.GroupService;
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
public class GroupController {

    @Autowired
    private GroupService groupService;

    @RequestMapping(value = "/group", method = RequestMethod.GET)
    public String viewGroup(ModelMap modelMap) {
        modelMap.addAttribute("group", new Group1());
        modelMap.addAttribute("group_list", groupService.findAllGroup());
        return "group";
    }

    @RequestMapping(value = "/group", method = RequestMethod.POST)
        public String saveGroup(ModelMap modelMap, @ModelAttribute("group") Group1 group1) {
        groupService.saveGroup(group1);
//        modelMap.addAttribute("group", new Group1());
        modelMap.addAttribute("success", "group added sucess !!!");
        return "redirect:/group";
    }
}
