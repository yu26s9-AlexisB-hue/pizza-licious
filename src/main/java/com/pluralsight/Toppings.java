package com.pluralsight;

public abstract class Toppings {
    private boolean isExtra;

    public Toppings(boolean isExtra) {
        this.isExtra = isExtra;
    }

    public boolean isExtra() {
        return isExtra;
    }

    public void setExtra(boolean extra) {
        isExtra = extra;
    }

    public abstract double calculatePrice();

    @Override
    public abstract String toString();


}
