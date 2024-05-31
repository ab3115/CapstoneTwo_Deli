package com.ps;


import java.util.ArrayList;

public class Order {


    private ArrayList<Product> order;
    Sandwich sandwich;
    Drink drink;
    Chip chips;
    private double total_price;

    public Order() {
        order = new ArrayList<>();
        total_price = 0.00;
    }


    public void add(Product product) {
        order.add(product);
    }

    public void startSandwich() {
       add( sandwich = new Sandwich("", "", "", "", false, false, false));
    }

    public void clearOrder(){
        order.clear();
    }

    public void setSignatureSandwich(String choice){

        switch (choice){
            case("BLT"):
                sandwich.setBLT();
                return;
            case("Philly"):
                sandwich.setPhilly();
                return;
            case("Pulled Pork"):
                sandwich.setPulled();
                return;
            case("Spring Lover"):
                sandwich.setSpringLover();
        }
    }

    public double getTotal_price() {
        return total_price;
    }

    public void setTotal_price(double total_price) {
        this.total_price = total_price;
    }


    public void addSize(String size){
        sandwich.setSize(size);
    }

    public void addBread(String bread) {
        sandwich.setBread(bread);
    }

    public void addMeat(String meat) {
        sandwich.setMeat(meat);
    }

    public void addExtraMeat(boolean extra_meat) {
        sandwich.setExtra_meat(extra_meat);
    }

    public void addCheese(String cheese) {
        sandwich.setCheese(cheese);
    }

    public void addExtraCheese(boolean extra_cheese) {
        sandwich.setExtra_cheese(extra_cheese);
    }

    public void addTopping(ArrayList<String> toppings) {
        sandwich.setToppings(toppings);
    }

    public void addSauces(ArrayList<String> sauces) {
        sandwich.setSauces(sauces);
    }

    public void addSide(ArrayList<String> sides) {
        sandwich.setSides(sides);
    }

    public void isToasted(boolean toasted) {
        sandwich.setToasted(toasted);
    }

    public void addDrink(String size,String flavor) {
        add(drink = new Drink(size,flavor));
    }

    public void addChip(String flavor) {
        add(chips = new Chip(flavor));
    }


    public void displayOrder() {

        for (int i = 0; i < order.size(); i++) {

            setTotal_price(total_price += order.get(i).calcPrice());
            System.out.println(order.get(i).toString());

        }
        System.out.printf("Total price: $%.2f\n ", getTotal_price());
    }


    public void printReceipt() {
        FileManager.buffWriter(order);
    }


}
