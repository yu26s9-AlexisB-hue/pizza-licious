package com.pluralsight;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Order {
    private String orderId;
    private LocalDate date;
    private List<OrderedItems> orderedItem;

    public Order(String orderId, LocalDate date) {
        this.orderId = orderId;
        this.date = date;
        this.orderedItem = new ArrayList<>();

    }

    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public void addPizza(OrderedItems pizza) {
        orderedItem.add(pizza);
    }

    public double calculateTotal(){
        double total = 0;

        for(OrderedItems order : orderedItem){
            total += order.getTotalValue();
        }
        return total;
    }

    public void printReceipt(){
        for(OrderedItems order: orderedItem){
            System.out.println(order.getReceiptDescription());
            System.out.println(order.getTotalValue());
        }
        System.out.println("Total: " + calculateTotal());
    }

    public List<OrderedItems> displayOrder() {
        ArrayList<OrderedItems> currentOrder = new ArrayList<>();

        for(OrderedItems order : orderedItem){
            currentOrder.add(order);
        }
        return currentOrder;
    }
}

