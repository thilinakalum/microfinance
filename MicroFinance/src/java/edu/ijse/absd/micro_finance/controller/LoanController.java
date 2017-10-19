/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.ijse.absd.micro_finance.controller;

import edu.ijse.absd.micro_finance.model.Loan;
import edu.ijse.absd.micro_finance.service.LoanRequestService;
import edu.ijse.absd.micro_finance.service.LoanService;
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
public class LoanController {
    
    @Autowired
    private LoanService loanService;
    
    @Autowired
    private LoanRequestService loanRequestService;
    
    @RequestMapping(value = "/loan", method = RequestMethod.GET)
    public String viewLoan(ModelMap modelMap){
        modelMap.addAttribute("loan", new Loan());
//        modelMap.addAttribute("loanRequest", loanRequestService.findAllPendingLoan());
        return "loan";
    }
    
    @RequestMapping(value = "/loan", method = RequestMethod.POST)
    public String viewLoan(@ModelAttribute("loan") Loan loan){
        loanService.saveLoan(loan);        
        return "loan";
    }
}
