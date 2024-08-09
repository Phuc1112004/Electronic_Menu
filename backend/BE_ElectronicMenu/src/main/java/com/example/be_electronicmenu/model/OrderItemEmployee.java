package com.example.be_electronicmenu.model;

import jakarta.persistence.*;

@Entity
public class OrderItemEmployee {
    @Id
    @GeneratedValue(strategy =  GenerationType.IDENTITY)
    private Long id;
    @ManyToOne(fetch = FetchType.LAZY)
    private OrderItem orderId;
    @ManyToOne(fetch = FetchType.EAGER)
    private Employee employeeId;
    @Column(nullable = false )
    private String Status;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public OrderItem getOrderId() {
        return orderId;
    }

    public void setOrderId(OrderItem orderId) {
        this.orderId = orderId;
    }

    public Employee getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(Employee employeeId) {
        this.employeeId = employeeId;
    }

    public String getStatus() {
        return Status;
    }

    public void setStatus(String status) {
        Status = status;
    }
}
