package com.pluralsight;

import ToppingEnums.PizzaSize;
import ToppingEnums.PremiumType;

public class PremiumToppings extends Toppings{
    private PremiumType premium;
    private boolean isMeat;
    private PizzaSize size;

    public PremiumToppings(boolean isExtra, PremiumType premium, PizzaSize size) {
        super(isExtra);
        this.isMeat = premium.isMeat();
        this.premium = premium;
        this.size = size;
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

    public PizzaSize getSize() {
        return size;
    }

    public void setSize(PizzaSize size) {
        this.size = size;
    }

    public double getExtra(){

        double extra = 0;
        if(isExtra()){

            if(size == PizzaSize.LARGE){
                if(isMeat){
                    extra += 1.50;
                }else{
                    extra += .9;
                }

            }else if(size == PizzaSize.MEDIUM){
                if(isMeat){
                    extra += 1.00;
                }else{
                    extra += 60;
                }
            }else{
                if(isMeat){
                    extra += .50;
                }
                extra += .30;
            }

        }
        return extra;
    }

    @Override
    public double calculatePrice(){
        //Code to find the final price.
        double price = 0;

        if(size == PizzaSize.LARGE){
            if(isMeat){
                price += 3.00;
            }else{
                price += 2.25;
            }

        }else if(size == PizzaSize.MEDIUM){
            if(isMeat){
                price += 2.00;
            }else{
                price += 1.50;
            }
        }else{
            if(isMeat){
                price += 1.00;
            }
            price += .75;
        }
        price += getExtra();
        return price;
    }

    @Override
    public String toString(){
        if(isExtra()){
            return "Extra " + premium + " " + String.format("%.2f",getExtra());
        }
        return premium.toString();
    }
}
