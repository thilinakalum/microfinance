/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.ijse.absd.micro_finance.dao.impl;

import edu.ijse.absd.micro_finance.dao.AbstractDAO;
import edu.ijse.absd.micro_finance.dao.ClientDao;
import edu.ijse.absd.micro_finance.model.Client;
import java.util.List;
import org.hibernate.Criteria;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

/**
 *
 * @author kalum
 */
@Repository
public class ClientDaoImpl extends AbstractDAO<Integer, Client> implements ClientDao {

    @Override
    public void saveClient(Client client) {
        save(client);
    }

    @Override
    public List<Client> findAllClient() {
        Criteria criteria = createEntityCriteria();
        return (List<Client>) criteria.list();
    }

//    @Autowired
//    private SessionFactory sessionFactory;
//    @Override
//    public void saveClient(Client client) {
//        sessionFactory.getCurrentSession().save(client);
//    }
}
