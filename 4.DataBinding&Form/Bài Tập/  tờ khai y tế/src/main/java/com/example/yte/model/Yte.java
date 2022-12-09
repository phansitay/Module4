package com.example.yte.model;

import javax.persistence.*;

@Entity(name ="yte")
public class Yte {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer id;
    @Column(name = "name", columnDefinition = "VARCHAR(50)")
    private String name;
    @Column(name = "dayOfBirth", columnDefinition = "datetime")
    private String dayOfBirth;
    @Column(name = "sex")
    private String sex;
    @Column(name = "cmnd")
    private String cmnd;
    @Column(name = )
}
