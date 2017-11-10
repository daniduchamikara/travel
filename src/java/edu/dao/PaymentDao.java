/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.dao;

import edu.model.Payment;
import java.util.Date;

/**
 *
 * @author DaniBoy
 */
public interface PaymentDao {

    public int makeNewPayment(Payment payment);
    
    public int updateNewPayment(Payment payment);

    public int deletePayment(Payment payment);
}
