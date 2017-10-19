/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.ijse.absd.micro_finance.service.impl;

import edu.ijse.absd.micro_finance.dao.LoanDao;
import edu.ijse.absd.micro_finance.model.Loan;
import edu.ijse.absd.micro_finance.service.LoanService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author Thilina Kalum
 */
@Service
public class LoanServiceImpl implements LoanService{

    @Autowired
    private LoanDao loanDao;
    
    @Override
    public void saveLoan(Loan loan) {
        loanDao.saveLoan(loan);
    }
    
}
