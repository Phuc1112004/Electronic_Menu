package com.example.be_electronicmenu.model;
import jakarta.annotation.Nullable;
import jakarta.persistence.*;


import java.util.Date;
import java.util.List;

@Entity
public class AppOrder {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne(fetch = FetchType.EAGER,optional = false)
    @JoinColumn(name = "customer_id")
    private Customer customer;

    @ManyToOne(fetch = FetchType.LAZY,optional = false)
    @JoinColumn(name = "restaurantTable_id")
    private RestaurantTable restaurantTable;

    @Column(nullable = false )
    private Date bookingTime;

//    @OneToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL,mappedBy = "appOrder")
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "coupon_id")
    private Coupon coupon;

    @OneToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL,mappedBy = "order")
    private List<OrderItem> orderItems;



    @Column(nullable = false )
    private Date create_at;
    @Column(nullable = false )
    private PaymentMethod payment;
    public enum PaymentMethod {
        Cash, CreditCard, MobilePayment, BankTransfer
    }
    @Column(nullable = false )
    private StatusOrder status;
    public enum StatusOrder {
        PendingPayment, Paid, Failed
    }
    @Column(nullable = false )
    private double originalPrice;
    @Column(nullable = false )
    public double totalDiscount;
    @Column(nullable = false )
    private double totalPrice;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public RestaurantTable getRestaurantTable() {
        return restaurantTable;
    }

    public void setRestaurantTable(RestaurantTable restaurantTable) {
        this.restaurantTable = restaurantTable;
    }

    public Date getBookingTime() {
        return bookingTime;
    }

    public void setBookingTime(Date bookingTime) {
        this.bookingTime = bookingTime;
    }

    public Coupon getCoupon() {
        return coupon;
    }

    public void setCoupon(Coupon coupon) {
        this.coupon = coupon;
    }

    public List<OrderItem> getOrderItems() {
        return orderItems;
    }

    public void setOrderItems(List<OrderItem> orderItems) {
        this.orderItems = orderItems;
    }

    public Date getCreate_at() {
        return create_at;
    }

    public void setCreate_at(Date create_at) {
        this.create_at = create_at;
    }

    public PaymentMethod getPayment() {
        return payment;
    }

    public void setPayment(PaymentMethod payment) {
        this.payment = payment;
    }

    public StatusOrder getStatus() {
        return status;
    }

    public void setStatus(StatusOrder status) {
        this.status = status;
    }

    public double getOriginalPrice() {
        return originalPrice;
    }

    public void setOriginalPrice(double originalPrice) {
        this.originalPrice = originalPrice;
    }

    public double getTotalDiscount() {
        return totalDiscount;
    }

    public void setTotalDiscount(double totalDiscount) {
        this.totalDiscount = totalDiscount;
    }

    public double getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(double totalPrice) {
        this.totalPrice = totalPrice;
    }
}
