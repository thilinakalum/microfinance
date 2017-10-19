/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.ijse.absd.micro_finance.service.impl;

import edu.ijse.absd.micro_finance.dao.InterestRateDao;
import edu.ijse.absd.micro_finance.model.InterestRate;
import edu.ijse.absd.micro_finance.service.InterestRateService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author Thilina Kalum
 */
@Service
public class InterestRateServiceImpl implements InterestRateService{

    @Autowired
    private InterestRateDao interestRateDao;
    
    @Override
    public void saveInterestRate(InterestRate interestRate) {
        interestRateDao.saveInterestRate(interestRate);
    }
    
}
