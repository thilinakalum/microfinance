/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.ijse.absd.micro_finance.service;

import edu.ijse.absd.micro_finance.model.Group1;
import java.util.List;

/**
 *
 * @author Thilina Kalum
 */
public interface GroupService {

    public void saveGroup(Group1 group1);

    public List<Group1> findAllGroup();
}
