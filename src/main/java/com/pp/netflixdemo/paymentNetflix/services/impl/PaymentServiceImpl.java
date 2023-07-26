/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.pp.netflixdemo.paymentNetflix.services.impl;

import com.pp.netflixdemo.paymentNetflix.entities.PaymentDetails;
import com.pp.netflixdemo.paymentNetflix.repository.PaymentRepository;
import com.pp.netflixdemo.paymentNetflix.services.PaymentService;
import java.util.List;
import java.util.UUID;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author hkorada
 */
@Service
public class PaymentServiceImpl implements PaymentService {

    @Autowired
    private PaymentRepository paymentRepository;

    @Override
    public PaymentDetails doPayment(PaymentDetails paymentDetails) {
        //paymentDetails.setPaymentId(UUID.randomUUID().toString().replaceAll("-", ""));
        return paymentRepository.save(paymentDetails);
    }

    @Override
    public List<PaymentDetails> getPaymentHistory(String userId) {
        return paymentRepository.findByUserId(userId);
    }

    @Override
    public List<PaymentDetails> getCancelledPaymentDetails(String userId) {
        return paymentRepository.findByUserId(userId);
    }

}
