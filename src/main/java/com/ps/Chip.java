package com.ps;

import java.util.HashMap;

public class Chip extends Product implements Edible{

    private String flavor;
    private double calories;

    public Chip(String flavor){
        this.flavor = flavor;
    }

    public double getCalories() {
        return calories;
    }

    public void setCalories(double calories) {
        this.calories = calories;
    }

    public String getFlavor() {
        return flavor;
    }

    public void setFlavor(String flavor) {
        this.flavor = flavor;
    }

    public double calcPrice(){
        setPrice(1.50);
        return getPrice();
    }

    @Override
    public String toString(){
        return String.format("Chip: flavor: %s price: %.2f calories: %.2f\n",getFlavor(),calcPrice(),calcCalories() );
    }

    @Override
    public double calcCalories() {
        setCalories(150);
     return getCalories();
    }
}
