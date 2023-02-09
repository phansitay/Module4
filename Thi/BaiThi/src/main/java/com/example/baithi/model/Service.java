package com.example.baithi.model;

import javax.persistence.*;
import java.util.Set;

@Entity(name = "service")
public class Service {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @OneToMany(mappedBy = "customer")
    private Set<Contract> contracts;
    private String name;
    public Service() {
    }

    public Service(Integer id, Set<Contract> contracts,String name) {
        this.id = id;
        this.contracts = contracts;
        this.name=name;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Set<Contract> getContracts() {
        return contracts;
    }

    public void setContracts(Set<Contract> contracts) {
        this.contracts = contracts;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
