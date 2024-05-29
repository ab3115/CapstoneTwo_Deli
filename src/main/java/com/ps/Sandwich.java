package com.ps;

import java.util.ArrayList;

public class Sandwich extends Product{

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
                    ArrayList<String> toppings, boolean extra_meat,
                    boolean extra_cheese, boolean toasted) {
        super(price);
        this.size = size;
        this.bread = bread;
        this.meat = meat;
        this.cheese = cheese;
        this.toppings = toppings;
        this.extra_meat = extra_meat;
        this.extra_cheese = extra_cheese;
        this.toasted = toasted;
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

    @Override
    public double calcPrice() {
        return 0;
    }
}
