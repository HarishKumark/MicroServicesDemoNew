/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.pp.netflixdemo.paymentNetflix.repository;

import com.pp.netflixdemo.paymentNetflix.entities.PaymentDetails;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author hkorada
 */
public interface PaymentRepository extends JpaRepository<PaymentDetails, String> {

    List<PaymentDetails> findByUserId(String userId);

}
