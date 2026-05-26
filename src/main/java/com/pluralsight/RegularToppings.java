package com.pluralsight;

public class RegularToppings extends Toppings {
    private double numberOfToppings;

    public RegularToppings(boolean isExtra, double numberOfToppings) {
        super(isExtra);
        this.numberOfToppings = numberOfToppings;
    }

    public double getNumberOfToppings() {
        return numberOfToppings;
    }

    public void setNumberOfToppings(double numberOfToppings) {
        this.numberOfToppings = numberOfToppings;
    }

    public String itemsChosen(){
        //todo: figure out how I will use this.
        return "";
    }

    public double calculatePrice(){
        //todo:Code to find the final price.
        return 0;
    }
}
