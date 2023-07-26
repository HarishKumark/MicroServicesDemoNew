/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.pp.netflixdemo.paymentNetflix.services;

import com.pp.netflixdemo.paymentNetflix.entities.PaymentDetails;
import java.util.List;

/**
 *
 * @author hkorada
 */
public interface PaymentService {

    PaymentDetails doPayment(PaymentDetails paymentDetails);

    List<PaymentDetails> getPaymentHistory(String userId);

    List<PaymentDetails> getCancelledPaymentDetails(String userId);

}
