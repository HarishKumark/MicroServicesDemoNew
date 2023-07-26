/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.pp.netflixdemo.paymentNetflix.entities;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import org.hibernate.annotations.CreationTimestamp;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

/**
 *
 * @author hkorada
 */
@Entity
@Data
@Getter
@Setter
public class PaymentDetails {

    @Id
    private String paymentId;

    @Column
    private double amount;

    @Column
    private String currency;

    @Column
    private String userId;

    @Column
    private String billingAddress;

    @Column
    private String email;

    @Column
    private String phone;

    @Column
    private String paymentMethod;

    @Column
    @CreationTimestamp
    private Date paymentDate;

}
