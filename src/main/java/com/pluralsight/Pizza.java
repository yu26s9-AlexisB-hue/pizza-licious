package com.pluralsight;

import ToppingEnums.CrustType;
import ToppingEnums.PizzaSize;

import java.util.ArrayList;
import java.util.List;

public class Pizza {
    private PizzaSize size;
    private CrustType crustChoice;
    private boolean isStuffedCrust;
    private List<Toppings> toppings;

    public Pizza(PizzaSize size, CrustType crustChoice, boolean isStuffedCrust) {
        this.size = size;
        this.crustChoice = crustChoice;
        this.isStuffedCrust = isStuffedCrust;
        this.toppings = new ArrayList<>();
    }

    public PizzaSize getSize() {
        return size;
    }

    public void setSize(PizzaSize size) {
        this.size = size;
    }

    public CrustType getCrustChoice() {
        return crustChoice;
    }

    public void setCrustChoice(CrustType crustChoice) {
        this.crustChoice = crustChoice;
    }

    public boolean isStuffedCrust() {
        return isStuffedCrust;
    }

    public void setStuffedCrust(boolean stuffedCrust) {
        isStuffedCrust = stuffedCrust;
    }

    public double getCrustPrice(){
        //todo:Figure out how much the pizza costs just using the crust and size.
        double priceOfCrust = 0;
        if (size == PizzaSize.PERSONAL){
            priceOfCrust = 8.50;
        }else if(size == PizzaSize.MEDIUM){
            priceOfCrust = 12.00;
        }else if(size == PizzaSize.LARGE){
            priceOfCrust = 16.50;
        }

        if(isStuffedCrust){
            priceOfCrust += 2.50;
        }

        return priceOfCrust;
    }
}
