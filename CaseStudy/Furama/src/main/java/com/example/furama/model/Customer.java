package com.example.furama.model;

import javax.persistence.*;

@Entity(name="Customer")
public class Customer {
    @Id
    @GeneratedValue
    @Column(name = "customer_id")
    private Integer customerId;
    @ManyToOne
    @JoinColumn(name = "customerTypeId")
    CustomerType  customerType;
    @Column(name = "customer_name")
    private String customerName;
    @Column(name = "customer_birthday")
    private String customerBirthday;
    @Column(name = "customer_gender")
    private boolean customerGender;
    @Column(name = "customer_id_card")
    private String customerIdCart;
    @Column(name = "customer_phone")
    private String customerPhone;
    @Column(name = "customer_email")
    private String customerEmail;
    @Column(name = "customer_address")
    private String customerAddress;

}
