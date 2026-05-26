package com.pluralsight;

import ToppingEnums.RegularType;

public class RegularToppings extends Toppings {
    private RegularType regular;

    public RegularToppings(boolean isExtra, RegularType regular) {
        super(isExtra);
        this.regular = regular;
    }

    public RegularType getRegular() {
        return regular;
    }

    public void setRegular(RegularType regular) {
        this.regular = regular;
    }


    @Override
    public double calculatePrice(){
        //Code to find the final price.
        double price = 1.00;

        if(isExtra()){
            price += 0.50;
        }
        return price;
    }

    @Override
    public String toString(){
        //formating how the user see the extra topping on the receipt.
        if(isExtra()){
            return "Extra" + regular;
        }

        return regular.toString();
    }

}
