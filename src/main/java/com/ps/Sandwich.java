package com.ps;

import java.util.ArrayList;
import java.util.HashMap;

public class Sandwich extends Product{

    private HashMap<String,Double> small_prices = new HashMap<>();
    private HashMap<String,Double> medium_prices = new HashMap<>();
    private HashMap<String,Double> large_prices = new HashMap<>();
    private ArrayList<String> avaliable_toppings = new ArrayList<>();

    private String size;
    private String bread;
    private String meat;
    private String cheese;
    private ArrayList<String> toppings;
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


    public void setAvaliable_toppings(){
        avaliable_toppings.add("Lettuce");
        avaliable_toppings.add("Peppers");
        avaliable_toppings.add("Onions");
        avaliable_toppings.add("Tomatoes");
        avaliable_toppings.add("Jalapenos");
        avaliable_toppings.add("Cucumbers");
        avaliable_toppings.add("Pickles");
        avaliable_toppings.add("Guacamole");
        avaliable_toppings.add("Mushrooms");
    }

    public ArrayList<String> getAvaliable_toppings(){
        return avaliable_toppings;
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
