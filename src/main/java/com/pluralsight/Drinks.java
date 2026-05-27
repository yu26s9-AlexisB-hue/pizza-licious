package com.pluralsight;

public class Drinks implements OrderedItems {
    private String name;
    private String size;

    public Drinks(String name, String size) {
        this.name = name;
        this.size = size;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    @Override
    public double getTotalValue(){
        double price = 0;
        if(size.equalsIgnoreCase("large")){
            price = 3.00;
        }else if(size.equalsIgnoreCase("medium")){
            price = 2.50;
        }else if(size.equalsIgnoreCase("small")){
            price = 2.00;
        }else{
            System.out.println("Invalid entry. ");
        }
        return price;
    }

    @Override
    public String getReceiptDescription(){
        return name + " Price: " + getTotalValue();
    }

}
