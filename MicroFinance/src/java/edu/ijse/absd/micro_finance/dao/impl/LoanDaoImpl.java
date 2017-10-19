/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.ijse.absd.micro_finance.dao.impl;

import edu.ijse.absd.micro_finance.dao.AbstractDAO;
import edu.ijse.absd.micro_finance.dao.LoanDao;
import edu.ijse.absd.micro_finance.model.Loan;
import java.io.Serializable;
import org.springframework.stereotype.Repository;

/**
 *
 * @author Thilina Kalum
 */
@Repository
public class LoanDaoImpl extends AbstractDAO<Integer, Loan> implements LoanDao{

    @Override
    public void saveLoan(Loan loan) {
        save(loan);
    }
    
}
