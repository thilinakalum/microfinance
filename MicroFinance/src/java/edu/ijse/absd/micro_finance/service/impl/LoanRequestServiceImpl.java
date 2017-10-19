/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.ijse.absd.micro_finance.service.impl;

import edu.ijse.absd.micro_finance.dao.LoanRequestDao;
import edu.ijse.absd.micro_finance.model.LoanRequest;
import edu.ijse.absd.micro_finance.service.LoanRequestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author Thilina Kalum
 */
@Service
@Transactional
public class LoanRequestServiceImpl implements LoanRequestService{

    @Autowired
    private LoanRequestDao loanRequestDao;
    
    @Override
    public void saveLoanRequest(LoanRequest loanRequest) {
        loanRequestDao.saveLoanRequest(loanRequest);
    }
    
}
