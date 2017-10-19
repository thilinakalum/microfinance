/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.ijse.absd.micro_finance.service.impl;

import edu.ijse.absd.micro_finance.dao.GroupDao;
import edu.ijse.absd.micro_finance.model.Group1;
import edu.ijse.absd.micro_finance.service.GroupService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author Thilina Kalum
 */
@Service
@Transactional
public class GroupServiceImpl implements GroupService{

    @Autowired
    private GroupDao groupDao;
    
    @Override
    public void saveGroup(Group1 group1) {
        groupDao.saveGroup(group1);
    }

    @Override
    public List<Group1> findAllGroup() {
        return groupDao.getAllGroup();
    }
    
}
