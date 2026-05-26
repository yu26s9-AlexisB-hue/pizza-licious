package com.pluralsight;

import java.time.LocalDate;

public class Order {
    private String orderId;
    private LocalDate date;
    private int pizza;
    private int drinks;
    private int garlicKnots;

    public Order(String orderId, LocalDate date, int pizza, int drinks, int garlicKnots) {
        this.orderId = orderId;
        this.date = date;
        this.pizza = pizza;
        this.drinks = drinks;
        this.garlicKnots = garlicKnots;
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

    public int getPizza() {
        return pizza;
    }

    public void setPizza(int pizza) {
        this.pizza = pizza;
    }

    public int getDrinks() {
        return drinks;
    }

    public void setDrinks(int drinks) {
        this.drinks = drinks;
    }

    public int getGarlicKnots() {
        return garlicKnots;
    }

    public void setGarlicKnots(int garlicKnots) {
        this.garlicKnots = garlicKnots;
    }
}

