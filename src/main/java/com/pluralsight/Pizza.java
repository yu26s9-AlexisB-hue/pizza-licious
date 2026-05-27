package com.pluralsight;

import ToppingEnums.CrustType;
import ToppingEnums.PizzaSize;

import java.util.ArrayList;
import java.util.List;

public class Pizza implements OrderedItems {
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

    public void addTopping(Toppings topping){
        toppings.add(topping);
    }

    public double getTotalValue(){
        double total = getCrustPrice();

        for(Toppings topping : toppings){
            total += topping.calculatePrice();
        }

        return total;
    }

    @Override
    public String getReceiptDescription() {
        StringBuilder pizzaInfo = new StringBuilder();
        pizzaInfo.append(size).append(" ").append(crustChoice).append("pizza");

        //checks if toppings exist.
        if(!toppings.isEmpty()){
            pizzaInfo.append(" with ");

            //Looping through toppings.
            for(int i = 0; i < toppings.size(); i++){
                pizzaInfo.append(toppings.get(i));

                //add a new line after every topping.
                if(i < toppings.size()-1){
                    pizzaInfo.append("\n");
                }
            }
        }
        return pizzaInfo.toString();
    }
}
