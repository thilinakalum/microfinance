/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.ijse.absd.micro_finance.dao.impl;

import edu.ijse.absd.micro_finance.dao.AbstractDAO;
import edu.ijse.absd.micro_finance.dao.GroupDao;
import edu.ijse.absd.micro_finance.model.Group1;
import java.util.List;
import org.hibernate.Criteria;
import org.springframework.stereotype.Repository;

/**
 *
 * @author Thilina Kalum
 */
@Repository
public class GroupDaoImpl extends AbstractDAO<Integer, Group1> implements GroupDao {

    @Override
    public void saveGroup(Group1 group1) {
        System.out.println("-==========-=-=--=-=-=-=");
        System.out.println(group1);
        save(group1);
    }

    @Override
    public Group1 findGroup(Integer id) {
        return getByKey(id);
    }

    @Override
    public List<Group1> getAllGroup() {
        Criteria criteria = createEntityCriteria();
        return (List<Group1>) criteria.list();
    }

//    @Autowired
//    private SessionFactory sessionFactory;
//
//    @Override
//    public void saveGroup(Group1 group1) {
//        sessionFactory.getCurrentSession().save(group1);
//    }
//
//    @Override
//    public List<Group1> getAllGroup() {
//        Criteria criteria = sessionFactory.getCurrentSession().createCriteria(Group1.class).add(Restrictions.eq("id", 1));
//        return criteria.list();
//    }
//
//    @Override
//    public Group1 findGroup(Integer id) {
//        Criteria criteria = sessionFactory.getCurrentSession().createCriteria(Group1.class).add(Restrictions.eq("id", 1));
//        return (Group1) criteria.uniqueResult();
//    }
}
