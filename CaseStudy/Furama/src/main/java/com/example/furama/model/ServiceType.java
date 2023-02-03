package com.example.furama.model;

import javax.persistence.*;
import java.util.Set;

@Entity(name = "ServiceType")
public class ServiceType {
    @Id
    @GeneratedValue
    @Column(name = "service_type_id")
    private Integer serviceTypeId;
    @Column(name = "service_type_name")
    private String serviceTypeName;

    @OneToMany(mappedBy = "ServiceType")
    private Set<Service> services;
}
