package com.example.baithi.model;

import javax.persistence.*;
import javax.validation.constraints.Min;
import javax.validation.constraints.Size;

@Entity(name = "contract")
public class Contract {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String date;
    @ManyToOne
    @JoinColumn(name = "idCustomer")
    Customer customer;
    @ManyToOne
    @JoinColumn(name = "idService")
    Service service;
    @Min(value = 500000,message = "giá phải hơn 500000")
    private int price;
    @Min(value = 20,message = "diện tích phải hơn 20")
    private int area;

    public Contract() {
    }

    public Contract(Integer id, String date, Customer customer, Service service, int price, int area) {
        this.id = id;
        this.date = date;
        this.customer = customer;
        this.service = service;
        this.price = price;
        this.area = area;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public Service getService() {
        return service;
    }

    public void setService(Service service) {
        this.service = service;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getArea() {
        return area;
    }

    public void setArea(int area) {
        this.area = area;
    }
}
