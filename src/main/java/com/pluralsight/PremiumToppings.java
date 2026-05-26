package com.pluralsight;

public class PremiumToppings extends Toppings{
    private Meats premiumMeat;
    private Cheese premiumCheese;
    private boolean isMeat;

    public PremiumToppings(boolean isExtra, Meats premiumMeat, Cheese premiumCheese, boolean isMeat) {
        super(isExtra);
        this.premiumMeat = premiumMeat;
        this.premiumCheese = premiumCheese;
        this.isMeat = isMeat;
    }


    public Meats getPremiumMeat() {
        return premiumMeat;
    }

    public void setPremiumMeat(Meats premiumMeat) {
        this.premiumMeat = premiumMeat;
    }

    public Cheese getPremiumCheese() {
        return premiumCheese;
    }

    public void setPremiumCheese(Cheese premiumCheese) {
        this.premiumCheese = premiumCheese;
    }

    public boolean isMeat() {
        return isMeat;
    }

    public void setMeat(boolean meat) {
        isMeat = meat;
    }




    @Override
    public double calculatePrice(){
        //todo:Code to find the final price.
        double price = 2.00;
        if(isExtra()){
            price += 1.00;
        }

        return price;
    }

    @Override
    public String toString(){
        if(isExtra()) && isMeat {
            return "Extra" + premiumMeat;
        }else if(!isMeat && isExtra()){
            return "Extra" + premiumCheese;
        }
        return toppingType.toString();
    }
}
