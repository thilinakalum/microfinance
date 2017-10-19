/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.ijse.absd.micro_finance.controller;

import edu.ijse.absd.micro_finance.model.InterestRate;
import edu.ijse.absd.micro_finance.service.InterestRateService;
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
public class InterestRateController {
    
    @Autowired
    private InterestRateService interestRateService;
    
    @RequestMapping(value = "/interest-rate" , method = RequestMethod.GET)
    public String viewInterestRate(ModelMap modelMap){
        modelMap.addAttribute("interest" , new InterestRate());
        return "interest";
    }
    
    @RequestMapping(value = "/interest-rate" , method = RequestMethod.POST)
    public String saveInterestRate(@ModelAttribute("interest") InterestRate interestRate){
        interestRateService.saveInterestRate(interestRate);
        return "interest";
    }
}
