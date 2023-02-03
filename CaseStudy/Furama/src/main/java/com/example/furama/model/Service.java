package com.example.furama.model;

import javax.persistence.*;

@Entity(name = "Service")
public class Service {
    @Id
    @GeneratedValue
    @Column(name = "service_id")
    private Integer serviceId;
    @Column(name = "service_name")
    private String serviceName;
    @Column(name = "service_area")
    private Integer serviceArea;
    @Column(name = "service_cost")
    private Double serviceCost;
    @Column(name = "service_max_people")
    private Integer serviceMaxPeople;
    @ManyToOne
    @JoinColumn(name = "rentTypeId")
    RentType  rentType;
    @ManyToOne
    @JoinColumn(name = "serviceTypeId")
    ServiceType serviceType;
    @Column(name = "standard_room")
    private int  standardRoom;
    @Column(name = "description_other_convenience")
    private String descriptionOtherConvenience;
    @Column(name = "pool_area")
    private Double poolArea;
    @Column(name = "number_of_floors")
    private int numberOfFloors;



}
