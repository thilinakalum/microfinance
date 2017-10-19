/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.ijse.absd.micro_finance.controller;

import edu.ijse.absd.micro_finance.model.Client;
import edu.ijse.absd.micro_finance.service.ClientService;
import edu.ijse.absd.micro_finance.service.GroupService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 *
 * @author kalum
 */
@Controller
public class ClientController {

    @Autowired
    private ClientService clientService;

    @Autowired
    private GroupService groupService;

    @RequestMapping(value = "/client", method = RequestMethod.GET)
    public String getClient(ModelMap modelMap) {
        modelMap.addAttribute("client", new Client());
        modelMap.addAttribute("group_list", groupService.findAllGroup());
        modelMap.addAttribute("client_list", clientService.findAllClient());
        return "customer";
    }

    @RequestMapping(value = "/client", method = RequestMethod.POST)
    public String setClient(ModelMap modelMap,@ModelAttribute("client") Client client) {
        System.out.println("+++++++++++++++++++++");
        System.out.println(client);
        System.out.println("+++++++++++++++++++++");
        return "customer";
    }
}
