/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.ijse.absd.micro_finance.dao.impl;

import edu.ijse.absd.micro_finance.dao.AbstractDAO;
import edu.ijse.absd.micro_finance.dao.LoanRequestDao;
import edu.ijse.absd.micro_finance.model.LoanRequest;
import org.springframework.stereotype.Repository;

/**
 *
 * @author Thilina Kalum
 */
@Repository
public class LoanRequestDaoImpl extends AbstractDAO<Integer, LoanRequest> implements LoanRequestDao{

    @Override
    public void saveLoanRequest(LoanRequest loanRequest) {
        System.out.println(loanRequest);
        save(loanRequest);
    }
    
}
