package com.example.furama.model;

import javax.persistence.*;
import java.util.Set;

@Entity
public class AttachService {
    @Id
    @GeneratedValue
    @Column(name ="attach_service_id")
    private Integer attachServiceId;
    @Column(name = "attach_service_name")
    private String attachServiceName;
    @Column(name = "attach_service_cost")
    private Double attachServiceCost;
    @Column(name = "attach_service_unit")
    private int attachServiceUnit;
    @Column(name = "attach_service_status")
    private String attachServiceStatus;

//    @OneToMany(mappedBy = "attachService")
//    private Set<>
}
