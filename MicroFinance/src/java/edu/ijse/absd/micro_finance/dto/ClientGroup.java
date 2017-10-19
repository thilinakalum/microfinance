/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.ijse.absd.micro_finance.dto;

import edu.ijse.absd.micro_finance.model.Client;
import edu.ijse.absd.micro_finance.model.Group1;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Thilina Kalum
 */
public class ClientGroup {

    private String groupName;
    private Client client = new Client();
    private List<Group1> groupList = new ArrayList<>();
    private List<Client> clientList = new ArrayList<>();

    public ClientGroup() {
    }

    public String getGroupName() {
        return groupName;
    }

    public void setGroupName(String groupName) {
        this.groupName = groupName;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public List<Client> getClientList() {
        return clientList;
    }

    public void setClientList(List<Client> clientList) {
        this.clientList = clientList;
    }

    public List<Group1> getGroupList() {
        return groupList;
    }

    public void setGroupList(List<Group1> groupList) {
        this.groupList = groupList;
    }

    @Override
    public String toString() {
        return "Client list" + clientList.size() + "Group1 list" + groupList.size();
    }

}
