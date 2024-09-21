package com.example.kafka_producer_consumer.producer;

public class OrderDetails {

    private int orderId;
    private String orderName;
    private int qty;
    private int price;

    public int getOrderId() {
        return orderId;
    }

    public String getOrderName() {
        return orderName;
    }

    public void setOrderName(String orderName) {
        this.orderName = orderName;
    }

    public int getQty() {
        return qty;
    }

    public void setQty(int qty) {
        this.qty = qty;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public void setOrderId(int orderId) {
        this.orderId = orderId;
    }

    @Override
    public String toString() {
        return "OrderDetails{" +
                "orderId=" + orderId +
                ", orderName='" + orderName + '\'' +
                ", qty=" + qty +
                ", price=" + price +
                '}';
    }
}
