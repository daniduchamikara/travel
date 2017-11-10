/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.daoimpl;

import edu.dao.PaymentDao;
import edu.model.Cheque;
import edu.model.Payment;
import java.util.Date;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 *
 * @author DaniBoy
 */
@Component
public class PaymentDaoImpl implements PaymentDao {

    @Autowired
    private SessionFactory sessionFactory;

    @Override
    public int makeNewPayment(Payment payment) {
        sessionFactory.getCurrentSession().save(payment);
        return 1;
    }

    @Override
    public int updateNewPayment(Payment payment) {
        sessionFactory.getCurrentSession().update(payment);
        return 1;
    }

    @Override
    public int deletePayment(Payment payment) {
        sessionFactory.getCurrentSession().delete(payment);
        return 1;
    }
}
