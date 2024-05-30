package com.ps;

import java.util.ArrayList;
import java.util.HashMap;

public class Sandwich extends Product {

    private HashMap<String, Double> small_prices = new HashMap<>();
    private HashMap<String, Double> medium_prices = new HashMap<>();
    private HashMap<String, Double> large_prices = new HashMap<>();
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


    public Sandwich( String size, String bread,
                    String meat, String cheese,
                    boolean extra_meat,
                    boolean extra_cheese, boolean toasted) {
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
        setSmall_prices();
        setMedium_prices();
        setLarge_prices();
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

    private void addToppings(String topping){
        toppings.add(topping);
    }

    public ArrayList<String> getSauces() {
        return sauces;
    }

    public void setSauces(ArrayList<String> sauces) {
        this.sauces = sauces;
    }

    private void addSauces(String sauce){
        sauces.add(sauce);
    }

    public ArrayList<String> getSides() {
        return sides;
    }

    public void setSides(ArrayList<String> sides) {
        this.sides = sides;
    }

    private void addSides(String side){
        sides.add(side);
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

    public void setBLT(){
        setSize("8");
        setBread("White");
        setMeat("Bacon");
        setCheese("Cheddar");
        addToppings("Lettuce");
        addToppings("Tomato");
        addSauces("Ranch");
        setToasted(true);
    }

    public void setPhilly(){
        setSize("8");
        setBread("White");
        setMeat("Steak");
        setCheese("American");
        addToppings("Peppers");
        addSauces("Mayo");
        setToasted(true);
    }

    public void setPulled(){
        setSize("8");
        setBread("White");
        setMeat("Ham");
        addToppings("Onions");
        addToppings("Jalapenos");
        addSauces("Mustard");
        setToasted(true);
    }

    public void setSpringLover(){
        setSize("4");
        setBread("Whole Wheat");
        setMeat("Chicken");
        addToppings("Lettuce");
        addToppings("Tomatoes");
        addToppings("Onions");
        addToppings("Cucumbers");
        addSauces("vinaigrette");
        setToasted(false);
    }


    private void setAvaliable_toppings() {
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

    public ArrayList<String> getAvaliable_toppings() {
        return avaliable_toppings;
    }

    private void setAvaliable_sauces() {
        avaliable_sauces.add("mayo");
        avaliable_sauces.add("mustard");
        avaliable_sauces.add("ketchup");
        avaliable_sauces.add("ranch");
        avaliable_sauces.add("thousand islands");
        avaliable_sauces.add("vinaigrette");

    }

    public ArrayList<String> getAvaliable_sauces() {
        return avaliable_sauces;
    }

    private void setAvaliable_sides() {
        avaliable_sides.add("au jus");
        avaliable_sides.add("sauce");
    }

    public ArrayList<String> getAvaliable_sides() {
        return avaliable_sides;
    }

    private void setSmall_prices() {
        small_prices.put("Bread", 5.50);
        small_prices.put("Meat", 1.00);
        small_prices.put("Cheese", 0.75);
        small_prices.put("Extra-Meat", 0.50);
        small_prices.put("Extra-Cheese", 0.30);
    }

    private void setMedium_prices() {
        medium_prices.put("Bread", 7.00);
        medium_prices.put("Meat", 2.00);
        medium_prices.put("Cheese", 1.50);
        medium_prices.put("Extra-Meat", 1.00);
        medium_prices.put("Extra-Cheese", 0.60);
    }

    private void setLarge_prices() {
        large_prices.put("Bread", 8.50);
        large_prices.put("Meat", 3.00);
        large_prices.put("Cheese", 2.25);
        large_prices.put("Extra-Meat", 1.50);
        large_prices.put("Extra-Cheese", 0.90);
    }

    @Override
    public double calcPrice() {
        switch (size) {
            case ("4"):
                setPrice(small_prices.get("Bread"));
                if (!meat.isBlank()) {
                    price += small_prices.get("Meat");
                    if (extra_meat) {
                        price += small_prices.get("Extra-Meat");

                    }
                }
                if (cheese.isBlank()) {
                    price += small_prices.get("Cheese");
                    if (extra_cheese) {
                        price += small_prices.get("Extra-Cheese");
                    }
                }
                break;

            case ("8"):
                setPrice(medium_prices.get("Bread"));
                if (meat.isBlank()) {
                    price += medium_prices.get("Meat");
                    if (extra_meat) {
                        price += medium_prices.get("Extra-Meat");

                    }
                }
                if (cheese.isBlank()) {
                    price += medium_prices.get("Cheese");
                    if (extra_cheese) {
                        price += medium_prices.get("Extra-Cheese");
                    }
                }
                break;

            case ("12"):
                setPrice(large_prices.get("Bread"));
                if (meat.isBlank()) {
                    price += large_prices.get("Meat");
                    if (extra_meat) {
                        price += large_prices.get("Extra-Meat");

                    }
                }
                if (cheese.isBlank()) {
                    price += large_prices.get("Cheese");
                    if (extra_cheese) {
                        price += large_prices.get("Extra-Cheese");
                    }
                }
                break;
        }
        setPrice(price);
        return price;
    }

    @Override
    public String toString() {

        StringBuilder sandwich_order = new StringBuilder();
        sandwich_order.append("Sandwich Details:\n");
        sandwich_order.append("Size: ").append(size).append("\n");
        sandwich_order.append("Bread: ").append(bread).append("\n");
        sandwich_order.append("Meat: ").append(meat).append("\n");
        sandwich_order.append("Cheese: ").append(cheese).append("\n");
        sandwich_order.append("Toppings: ").append(toppings != null ? String.join(", ", toppings) : "None").append("\n");
        sandwich_order.append("Sauces: ").append(sauces != null ? String.join(", ", sauces) : "None").append("\n");
        sandwich_order.append("Sides: ").append(sides != null ? String.join(", ", sides) : "None").append("\n");
        sandwich_order.append("Extra Meat: ").append(extra_meat ? "Yes" : "No").append("\n");
        sandwich_order.append("Extra Cheese: ").append(extra_cheese ? "Yes" : "No").append("\n");
        sandwich_order.append("Toasted: ").append(toasted ? "Yes" : "No").append("\n");
        sandwich_order.append("Price: ").append(calcPrice()).append("\n");
        return sandwich_order.toString();
    }

}
