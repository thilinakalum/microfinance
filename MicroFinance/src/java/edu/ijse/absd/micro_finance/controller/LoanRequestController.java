/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.ijse.absd.micro_finance.controller;

import edu.ijse.absd.micro_finance.model.LoanRequest;
import edu.ijse.absd.micro_finance.service.LoanRequestService;
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
public class LoanRequestController {

    @Autowired
    private LoanRequestService loanRequestService;
    
    @RequestMapping(value = "/loan-request", method = RequestMethod.GET)
    public String getLoanRequest(ModelMap modelMap) {
        modelMap.addAttribute("loanRequest" , new LoanRequest());
        return "loanRequest";
    }
    @RequestMapping(value = "/loan-request", method = RequestMethod.POST)
    public String getLoanRequest(@ModelAttribute ("loanRequest") LoanRequest loanRequest) {
        loanRequestService.saveLoanRequest(loanRequest);
        return "redirect:/loan-request";
    }
}
