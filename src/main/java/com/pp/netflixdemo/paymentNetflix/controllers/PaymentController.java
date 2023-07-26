/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.pp.netflixdemo.paymentNetflix.controllers;

import com.pp.netflixdemo.paymentNetflix.entities.PaymentDetails;
import com.pp.netflixdemo.paymentNetflix.services.PaymentService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author hkorada
 */
@RestController
@RequestMapping("/payments")
public class PaymentController {

    @Autowired
    private PaymentService paymentService;

    @GetMapping("/{userId}")
    public ResponseEntity<List<PaymentDetails>> getPaymentDetails(@PathVariable String userId) {
        return new ResponseEntity<>(paymentService.getPaymentHistory(userId), HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity<PaymentDetails> dopayment(@RequestBody PaymentDetails paymentDetails) {
        return ResponseEntity.ok(paymentService.doPayment(paymentDetails));
    }

    @GetMapping("/cancelled/{userId}")
    public ResponseEntity<List<PaymentDetails>> getCancelledPaymentDetails(@PathVariable String userId) {
        return new ResponseEntity<>(paymentService.getPaymentHistory(userId), HttpStatus.OK);
    }
}
