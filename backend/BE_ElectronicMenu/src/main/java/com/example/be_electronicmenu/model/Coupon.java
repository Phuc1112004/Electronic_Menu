package com.example.be_electronicmenu.model;

import jakarta.persistence.*;

import java.util.List;

@Entity
public class Coupon {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(nullable = false )
    private String name;

//    @ManyToOne(fetch = FetchType.EAGER,optional = false)
//    @JoinColumn(name = "order_id")
    @OneToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL, mappedBy = "coupon")
    private List<AppOrder> orders;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<AppOrder> getOrders() {
        return orders;
    }

    public void setOrders(List<AppOrder> orders) {
        this.orders = orders;
    }
}
