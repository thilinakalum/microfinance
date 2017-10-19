/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.ijse.absd.micro_finance.service;

import edu.ijse.absd.micro_finance.dto.ClientGroup;
import edu.ijse.absd.micro_finance.model.Client;
import java.util.List;

/**
 *
 * @author kalum
 */
public interface ClientService {

    public void saveClient(ClientGroup clientGroup);
    public List<Client> findAllClient();
    public ClientGroup setClientPage();
}
