package com.ps;

import java.util.HashMap;

public class Drink extends Product implements Edible{

    private String flavor;
    private String size;
   private HashMap<String,Double> size_pricing;
   private HashMap<String,Double> calories_list;
   private double calories;

    public Drink(String size,String flavor) {
        size_pricing = new HashMap<>();
        calories_list = new HashMap<>();
        this.size = size;
        this.flavor = flavor;
        setSize_pricing();
        setCalories_list();
    }

    public void setSize_pricing(){
        size_pricing.put("small", 2.00);
        size_pricing.put("medium", 2.50);
        size_pricing.put("large", 3.00);
    }

    public void setCalories_list(){
        calories_list.put("small",170.0);
        calories_list.put("medium",280.0);
        calories_list.put("large", 350.0);
    }

    public String getFlavor() {
        return flavor;
    }

    public void setFlavor(String flavor) {
        this.flavor = flavor;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public double getCalories() {
        return calories;
    }

    public void setCalories(double calories) {
        this.calories = calories;
    }

    public double calcPrice(){
        switch (size){
            case("small"):
                setPrice(size_pricing.get("small"));
                break;
            case("medium"):
                setPrice(size_pricing.get("medium"));
                break;
            case("large"):
                setPrice(size_pricing.get("large"));
                break;
        }
        return getPrice();
    }

    @Override
    public String toString() {

        return String.format("DRINK: SIZE: %s FLAVOR: %s PRICE: %.2f CALORIES: %.2f\n",size,flavor, calcPrice(), calcCalories());

    }

    @Override
    public double calcCalories() {
        switch (size) {
            case ("small"):
                setCalories(calories_list.get("small"));
                break;
            case ("medium"):
                setCalories(calories_list.get("medium"));
                break;
            case ("large"):
                setCalories(calories_list.get("large"));
                break;
        }
        return getCalories();
    }
}
