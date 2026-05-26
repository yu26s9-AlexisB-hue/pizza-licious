package com.pluralsight;

import ToppingEnums.PremiumType;

public class PremiumToppings extends Toppings{
    private PremiumType premium;
    private boolean isMeat;

    public PremiumToppings(boolean isExtra, boolean isMeat, PremiumType premium) {
        super(isExtra);
        this.isMeat = isMeat;
        this.premium = premium;
    }

    public boolean isMeat() {
        return isMeat;
    }

    public void setMeat(boolean meat) {
        isMeat = meat;
    }

    public PremiumType getPremium() {
        return premium;
    }

    public void setPremium(PremiumType premium) {
        this.premium = premium;
    }

    @Override
    public double calculatePrice(){
        //Code to find the final price.
        double price = 2.00;
        if(isExtra()){
            price += 1.00;
        }

        return price;
    }

    @Override
    public String toString(){
        if(isExtra()){
            return "Extra" + premium;
        }
        return premium.toString();
    }
}
