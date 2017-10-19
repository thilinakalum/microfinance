/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.ijse.absd.micro_finance.dao.impl;

import edu.ijse.absd.micro_finance.dao.AbstractDAO;
import edu.ijse.absd.micro_finance.dao.InterestRateDao;
import edu.ijse.absd.micro_finance.model.InterestRate;
import org.springframework.stereotype.Repository;

/**
 *
 * @author Thilina Kalum
 */
@Repository
public class InterestRateDaoImpl extends AbstractDAO<Integer, InterestRate> implements InterestRateDao{

    @Override
    public void saveInterestRate(InterestRate interestRate) {
        save(interestRate);
    }
    
}
