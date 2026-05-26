package com.pluralsight;

import ToppingEnums.CrustType;
import ToppingEnums.PizzaSize;

import java.util.List;

public class Pizza {
    private PizzaSize size;
    private CrustType crustChoice;
    private boolean isStuffedCrust;
    private List<Toppings> toppings;

    public Pizza(PizzaSize size, CrustType crustChoice, boolean isStuffedCrust, List<Toppings> toppings) {
        this.size = size;
        this.crustChoice = crustChoice;
        this.isStuffedCrust = isStuffedCrust;
        this.toppings = toppings;
    }
}
