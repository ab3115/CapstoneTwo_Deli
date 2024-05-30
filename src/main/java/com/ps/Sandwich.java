package com.ps;

import java.util.ArrayList;
import java.util.HashMap;

public class Sandwich extends Product{

    private HashMap<String,Double> small_prices = new HashMap<>();
    private HashMap<String,Double> medium_prices = new HashMap<>();
    private HashMap<String,Double> large_prices = new HashMap<>();
    private ArrayList<String> avaliable_toppings = new ArrayList<>();
    private ArrayList<String> avaliable_sauces = new ArrayList<>();
    private ArrayList<String> avaliable_sides = new ArrayList<>();

    private String size;
    private String bread;
    private String meat;
    private String cheese;
    private ArrayList<String> toppings;
    private ArrayList<String> sauces;
    private ArrayList<String> sides;
    private boolean extra_meat;
    private boolean extra_cheese;
    private boolean toasted;


    public Sandwich(double price, String size, String bread,
                    String meat, String cheese,
                     boolean extra_meat,
                    boolean extra_cheese, boolean toasted) {
        super(price);
        this.size = size;
        this.bread = bread;
        this.meat = meat;
        this.cheese = cheese;
        this.extra_meat = extra_meat;
        this.extra_cheese = extra_cheese;
        this.toasted = toasted;
        setAvaliable_toppings();
        setAvaliable_sauces();
        setAvaliable_sides();
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public String getBread() {
        return bread;
    }

    public void setBread(String bread) {
        this.bread = bread;
    }

    public String getMeat() {
        return meat;
    }

    public void setMeat(String meat) {
        this.meat = meat;
    }

    public String getCheese() {
        return cheese;
    }

    public void setCheese(String cheese) {
        this.cheese = cheese;
    }

    public ArrayList<String> getToppings() {
        return toppings;
    }

    public void setToppings(ArrayList<String> toppings) {
        this.toppings = toppings;
    }

    public ArrayList<String> getSauces() {
        return sauces;
    }

    public void setSauces(ArrayList<String> sauces) {
        this.sauces = sauces;
    }

    public ArrayList<String> getSides() {
        return sides;
    }

    public void setSides(ArrayList<String> sides) {
        this.sides = sides;
    }

    public boolean isExtra_meat() {
        return extra_meat;
    }

    public void setExtra_meat(boolean extra_meat) {
        this.extra_meat = extra_meat;
    }

    public boolean isExtra_cheese() {
        return extra_cheese;
    }

    public void setExtra_cheese(boolean extra_cheese) {
        this.extra_cheese = extra_cheese;
    }

    public boolean isToasted() {
        return toasted;
    }

    public void setToasted(boolean toasted) {
        this.toasted = toasted;
    }


    private void setAvaliable_toppings(){
        avaliable_toppings.add("lettuce");
        avaliable_toppings.add("peppers");
        avaliable_toppings.add("onions");
        avaliable_toppings.add("tomatoes");
        avaliable_toppings.add("jalapenos");
        avaliable_toppings.add("cucumbers");
        avaliable_toppings.add("pickles");
        avaliable_toppings.add("guacamole");
        avaliable_toppings.add("mushrooms");
    }

    public ArrayList<String> getAvaliable_toppings(){
        return avaliable_toppings;
    }

    private void setAvaliable_sauces(){
        avaliable_sauces.add("mayo");
        avaliable_sauces.add("mustard");
        avaliable_sauces.add("ketchup");
        avaliable_sauces.add("ranch");
        avaliable_sauces.add("thousand islands");
        avaliable_sauces.add("vinaigrette");

    }

    public ArrayList<String> getAvaliable_sauces(){
        return avaliable_sauces;
    }

    private void setAvaliable_sides(){
        avaliable_sides.add("au jus");
        avaliable_sides.add("sauce");
    }

    public ArrayList<String> getAvaliable_sides(){
        return avaliable_sides;
    }

    public void setSmall_prices(){
        small_prices.put("Bread",5.50 );
        small_prices.put("Meat",1.00 );
        small_prices.put("Cheese",0.75 );
        small_prices.put("Extra-Meat",0.50);
    }

    @Override
    public double calcPrice() {
        return 0;
    }


}
