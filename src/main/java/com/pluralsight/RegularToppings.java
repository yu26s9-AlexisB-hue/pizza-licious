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
        //todo:Code to find the final price.
        return 0;
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
