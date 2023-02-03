package com.example.furama.model;

import javax.persistence.*;
import java.util.Set;

@Entity(name = "rentType")
public class RentType {
    @Id
    @GeneratedValue
    @Column(name = "rent_type_id")
    private Integer rentTypeId;
    @Column(name = "rent_type_name")
    private  String rentTypeName;
    @Column(name = "rent_type_cost")
    private Double rentTypeCost;
    @OneToMany(mappedBy = "rentType")
    private Set<Service> services;


}
