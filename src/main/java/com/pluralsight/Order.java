package com.pluralsight;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

public class Order {
    private String orderId;
    private LocalDateTime date;
    private List<OrderedItems> orderedItems;

    public Order(String orderId, LocalDateTime date) {
        this.orderId = orderId;
        this.date = date;
        this.orderedItems = new ArrayList<>();

    }

    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    public LocalDateTime getDate() {
        return date;
    }

    public void setDate(LocalDateTime date) {
        this.date = date;
    }

    public void addItem(OrderedItems item) {
        orderedItems.add(item);
    }

    public double calculateTotal(){
        double total = 0;

        for(OrderedItems order : orderedItems){
            total += order.getTotalValue();
        }
        return total;
    }

    public void printReceipt(){
        for(OrderedItems order: orderedItems){
            System.out.println(order.getReceiptDescription());
            System.out.println(order.getTotalValue());
        }
        System.out.println("Total: " + calculateTotal());
    }

    public void confirmOrder(){
        DateTimeFormatter dateTime = DateTimeFormatter.ofPattern("yyyyMMdd-hhmmss");
        String newOrder = date.format(dateTime);

        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter("Receipts/" + newOrder + ".txt"));

            writer.write("==== RECEIPT ====");
            writer.newLine();

            writer.write("Order ID: " + orderId);
            writer.newLine();

            writer.write("Date: " + date);
            writer.newLine();
            writer.newLine();

            for(OrderedItems order : orderedItems){

                writer.write(order.getReceiptDescription());
                writer.newLine();

                writer.write("Price: $" + order.getTotalValue());
                writer.newLine();
                writer.newLine();
            }

            writer.write("Total: $" + calculateTotal());
            writer.newLine();

            writer.close();

            System.out.println("Receipt saved successfully.");

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}

