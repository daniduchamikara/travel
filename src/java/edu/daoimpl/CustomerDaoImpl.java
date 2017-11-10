/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.daoimpl;

import edu.dao.CustomerDao;
import edu.model.Customer;
import edu.model.Hotel;
import java.util.List;
import org.hibernate.Query;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 *
 * @author DaniBoy
 */
@Component
public class CustomerDaoImpl implements CustomerDao {

    @Autowired
    private SessionFactory sessionFactory;

    @Override
    public int addNewCustomer(Customer customer) {
        System.out.println("dao");
        sessionFactory.getCurrentSession().save(customer);
        return 1;
    }

    @Override
    public int removeCustomer(int id) {
        Customer customer = (Customer) sessionFactory.getCurrentSession().load(Customer.class, new Integer(id));
        sessionFactory.getCurrentSession().delete(customer);
        sessionFactory.getCurrentSession().clear();
        return 1;
    }

    @Override
    public List<Customer> searchCustomer(String name, int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Customer> viewAllCustomer() {
        String sql = "select * from customer";
        Query query = sessionFactory.getCurrentSession().createSQLQuery(sql);
        //query.addEntity(Hotel.class);
        List<Customer> listCus = query.list();
        return listCus;
    }

    @Override
    public int updateCustomerDetail(Customer customer) {
         sessionFactory.getCurrentSession().update(customer);
         return 1;
    }

}
