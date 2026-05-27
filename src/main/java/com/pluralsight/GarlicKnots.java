package com.pluralsight;

public class GarlicKnots implements OrderedItems {
    private int quantity;


    public GarlicKnots(int quantity) {
        this.quantity = quantity;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }


    public double getTotalValue(){
        double price = 1.50;
        return quantity * price;
    }

    public String getReceiptDescription(){
        return quantity + " Garlic Knots";
    }
}
