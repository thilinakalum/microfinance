/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.ijse.absd.micro_finance.dao.impl;

import edu.ijse.absd.micro_finance.dao.AbstractDAO;
import edu.ijse.absd.micro_finance.dao.UserDao;
import edu.ijse.absd.micro_finance.model.User;
import org.springframework.stereotype.Repository;

/**
 *
 * @author Thilina Kalum
 */
@Repository
public class UserDaoImpl extends AbstractDAO<Integer, User> implements UserDao {

    @Override
    public void saveUser(User user) {
        save(user);
    }
    
}
