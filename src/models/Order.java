package models;

import java.util.Date;

public class Order {
    private Long orderId;
    private Long userId;
    private Date orderDate;
    private String status;
    private double amount;

    public Order() { }

    public Order(Long orderId, Long userId, String status, double amount) {
        this.orderId = orderId;
        this.userId = userId;
        this.orderDate = new Date();
        this.status = status;
        this.amount = amount;
    }

    public Long getOrderId() { return orderId; }
    public void setOrderId(Long orderId) { this.orderId = orderId; }

    public String getStatus() { return status; }
    public void setStatus(String status) { this.status = status; }

    public double getAmount() { return amount; }
    public void setAmount(double amount) { this.amount = amount; }
}

