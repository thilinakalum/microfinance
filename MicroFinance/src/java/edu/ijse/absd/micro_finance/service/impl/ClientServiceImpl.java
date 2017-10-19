/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.ijse.absd.micro_finance.service.impl;

import edu.ijse.absd.micro_finance.dao.ClientDao;
import edu.ijse.absd.micro_finance.dao.GroupDao;
import edu.ijse.absd.micro_finance.dto.ClientGroup;
import edu.ijse.absd.micro_finance.model.Client;
import edu.ijse.absd.micro_finance.model.Group1;
import edu.ijse.absd.micro_finance.service.ClientService;
import java.util.Date;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author kalum
 */
@Service
@Transactional
public class ClientServiceImpl implements ClientService {

    @Autowired
    private ClientDao clientDao;

    @Autowired
    private GroupDao groupDao;

    @Override
    public void saveClient(ClientGroup clientGroup) {
        List<Group1> findAllGroup = groupDao.getAllGroup();
        Client client = new Client();
        for (Group1 group1 : findAllGroup) {
            if (clientGroup.getGroupName().equals(group1.getName())) {
                client.setGroup1(group1);
            }
        }
        
//        client.setName(clientGroup.getName());
//        client.setAddress(clientGroup.getAddress());
//        client.setDate(new Date());
//        client.setEmail(clientGroup.getEmail());
//        client.setJob(clientGroup.getJob());
//        client.setMobile(clientGroup.getMobile());
//        client.setNic(clientGroup.getNic());
//        client.setTitle(clientGroup.getTitle());
        
        clientDao.saveClient(client);

    }

    @Override
    public List<Client> findAllClient() {
        return clientDao.findAllClient();
    }

    @Override
    public ClientGroup setClientPage() {
        ClientGroup clientGroup = new ClientGroup();
        clientGroup.setClientList(clientDao.findAllClient());
        clientGroup.setGroupList(groupDao.getAllGroup());
        clientGroup.setClient(new Client());
        return clientGroup;
    }

}
