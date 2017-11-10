/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.service.impl;

import edu.dao.PaymentDao;
import edu.model.Payment;
import edu.service.PaymentService;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import static java.time.temporal.TemporalQueries.localDate;
import java.util.Date;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author DaniBoy
 */
@Component
@Transactional
public class PaymentServiceImpl implements PaymentService {
    
    @Autowired
    PaymentDao paymentDao;

    @Override
    public int makeNewPayment(Payment payment) {
        int res=paymentDao.makeNewPayment(payment);
        return res;
    }

    @Override
    public int updateNewPayment(Payment payment) {
        int res=paymentDao.updateNewPayment(payment);
        return res;
    }

    @Override
    public int deletePayment(Payment payment) {
        int res=paymentDao.deletePayment(payment);
        return res;
    }

}
