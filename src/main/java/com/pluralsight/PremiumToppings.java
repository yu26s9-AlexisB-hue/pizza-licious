package com.pluralsight;

public class PremiumToppings extends Toppings{
    private String premiumType;

    public PremiumToppings(String name, boolean isPremium, boolean isExtra, String premiumType) {
        super(name, isPremium, isExtra);
        this.premiumType = premiumType;
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
