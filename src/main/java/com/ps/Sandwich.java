package com.ps;

import java.util.ArrayList;
import java.util.HashMap;

public class Sandwich extends Product implements Edible {

    private HashMap<String, Double> small_prices = new HashMap<>();
    private HashMap<String, Double> medium_prices = new HashMap<>();
    private HashMap<String, Double> large_prices = new HashMap<>();
    private ArrayList<String> avaliable_toppings = new ArrayList<>();
    private ArrayList<String> avaliable_sauces = new ArrayList<>();
    private ArrayList<String> avaliable_sides = new ArrayList<>();

    private ArrayList<Topping> topping_calories = new ArrayList<>();
    private ArrayList<Bread> bread_calories = new ArrayList<>();

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
    private double total_calories;


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
        this.total_calories = 0;
        setAvaliable_toppings();
        setAvaliable_sauces();
        setAvaliable_sides();
        setSmall_prices();
        setMedium_prices();
        setLarge_prices();
        setTopping_calories();
        setBread_calories();
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

    public double getTotal_calories() {
        return total_calories;
    }

    public void setTotal_calories(double total_calories) {
        this.total_calories = total_calories;
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

    public void setTopping_calories(){
        topping_calories.add(new Meat("steak",90));
        topping_calories.add(new Meat("ham", 60));
        topping_calories.add(new Meat("salami", 110));
        topping_calories.add(new Meat("roast beef", 70));
        topping_calories.add(new Meat("chicken", 50));
        topping_calories.add(new Meat("bacon", 150));
        topping_calories.add(new Cheese("american", 105));
        topping_calories.add(new Cheese("provolone", 90));
        topping_calories.add(new Cheese("cheddar", 115));
        topping_calories.add(new Cheese("swiss", 105));
        topping_calories.add(new StandardTopping("lettuce", 5));
        topping_calories.add(new StandardTopping("peppers", 15));
        topping_calories.add(new StandardTopping("onions", 10));
        topping_calories.add(new StandardTopping("tomatoes", 20));
        topping_calories.add(new StandardTopping("jalapenos", 5));
        topping_calories.add(new StandardTopping("cucumbers", 10));
        topping_calories.add(new StandardTopping("pickles", 5));
        topping_calories.add(new StandardTopping("guacamole", 50));
        topping_calories.add(new StandardTopping("mushrooms", 5));
        topping_calories.add(new Sauce("mayo", 90));
        topping_calories.add(new Sauce("mustard", 10));
        topping_calories.add(new Sauce("ketchup", 20));
        topping_calories.add(new Sauce("ranch", 70));
        topping_calories.add(new Sauce("thousand islands", 110));
        topping_calories.add(new Sauce("vinaigrette", 60));
        topping_calories.add(new Sauce("au jus", 30));
        topping_calories.add(new Sauce("sauce", 10));
    }

    public void setBread_calories(){
        bread_calories.add(new Bread("White", 120));
        bread_calories.add(new Bread("wheat", 80));
        bread_calories.add(new Bread("rye", 50));
        bread_calories.add(new Bread("wrap", 90));
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
        sandwich_order.append("\nSandwich Details:\n");
        sandwich_order.append("Size: ").append(size).append("\n");
        sandwich_order.append("Bread: ").append(bread).append("calories: ").append(calcBreadCals()).append("\n");
        sandwich_order.append("Meat: ").append(meat).append("calories: ").append(calcMeatCals()).append("\n");
        sandwich_order.append("Cheese: ").append(cheese).append("calories: ").append(calcCheeseCals()).append("\n");
        sandwich_order.append("Toppings: ").append(toppings != null ? String.join(", ", toppings) : "None").append("calories: ").append(calcToppingCals()).append("\n");
        sandwich_order.append("Sauces: ").append(sauces != null ? String.join(", ", sauces) : "None").append("calories: ").append(calcSaucesCals()).append("\n");
        sandwich_order.append("Sides: ").append(sides != null ? String.join(", ", sides) : "None").append("calories: ").append(calcSidesCals()).append("\n");
        sandwich_order.append("Extra Meat: ").append(extra_meat ? "Yes" : "No").append("\n");
        sandwich_order.append("Extra Cheese: ").append(extra_cheese ? "Yes" : "No").append("\n");
        sandwich_order.append("Toasted: ").append(toasted ? "Yes" : "No").append("\n");
        sandwich_order.append("Price: ").append(calcPrice()).append("\n");
        sandwich_order.append("Calories: ").append(calcCalories()).append("\n");
        return sandwich_order.toString();
    }

    @Override
    public double calcCalories() {

        double bread_cals = calcBreadCals();
        double meat_cals = calcMeatCals();
        double cheese_cals = calcCheeseCals();
        double toppings_cals = calcToppingCals();
        double sauces_cals = calcSaucesCals();
        double sides_cals = calcSidesCals();
         setTotal_calories(bread_cals + meat_cals + cheese_cals + toppings_cals + sauces_cals + sides_cals);
        return  getTotal_calories();
    }


    public double calcBreadCals(){
        String bread = getBread();
        double bread_cals = 0;
        for (int i = 0;i < bread_calories.size();i++){
            if (!bread.isBlank()) {
                if(bread_calories.get(i).getName().equalsIgnoreCase(bread)){
                    bread_cals = bread_calories.get(i).getCalories();

                }

            }
        }
        if(size.equals("8")){
            bread_cals *= 1.6;
        } else if (size.equals("12")) {
            bread_cals *= 2.1;
        }
        return bread_cals;
    }

    public double calcMeatCals(){
        String meat = getMeat();
        double meat_cals = 0;
        for (int i = 0;i < topping_calories.size();i++){
            if (!meat.isBlank()) {
                if(topping_calories.get(i).getName().equalsIgnoreCase(meat)){
                    if(isExtra_meat()){
                        meat_cals = 1.8 * topping_calories.get(i).getCalories();
                    }else {
                        meat_cals = topping_calories.get(i).getCalories();
                    }
                }

                }
            }


        if(size.equals("8")){
            meat_cals *= 1.5;
        } else if (size.equals("12")) {
            meat_cals *= 2;
        }
        return meat_cals;
    }

    public double calcCheeseCals(){
        String cheese = getCheese();
        double cheese_cals =0;
        for(int i = 0;i < topping_calories.size();i++) {
            if (!cheese.isBlank()) {
                if (topping_calories.get(i).getName().equalsIgnoreCase(cheese)) {
                    if(isExtra_cheese()){
                        cheese_cals = 1.8 * topping_calories.get(i).getCalories();
                    }else {
                        cheese_cals = topping_calories.get(i).getCalories();
                    }
                }
            }
        }
        if(size.equals("8")){
            cheese_cals *= 1.5;
        } else if (size.equals("12")) {
            cheese_cals *= 2;
        }
        return cheese_cals;
    }

    public double calcToppingCals(){
        ArrayList<String> toppings = getToppings();
        double topping_cals = 0;
        for(int i = 0;i < topping_calories.size();i++) {
            if (!toppings.isEmpty()) {
                for (int j = 0; j < getToppings().size(); j++) {
                    if (topping_calories.get(i).getName().equalsIgnoreCase(getToppings().get(j))) {
                        topping_cals += topping_calories.get(i).getCalories();
                    }

                }
            }
        }
        if(size.equals("8")){
            topping_cals *= 1.25;
        } else if (size.equals("12")) {
            topping_cals *= 1.5;
        }
        return topping_cals;
    }



    public double calcSaucesCals(){
        ArrayList<String> sauces = getSauces();
        double sauces_cals = 0;
        for(int i = 0;i < topping_calories.size();i++) {
            if (!sauces.isEmpty()) {
                for (int j = 0; j < getSauces().size(); j++) {
                    if (topping_calories.get(i).getName().equalsIgnoreCase(getSauces().get(j))) {
                        sauces_cals += topping_calories.get(i).getCalories();
                    }
                }

            }
        }
        if(size.equals("8")){
            sauces_cals *= 1.5;
        } else if (size.equals("12")) {
            sauces_cals *= 2;
        }
        return sauces_cals;
    }


    public double calcSidesCals(){
        ArrayList<String> sides =getSides();
        double sides_cals = 0;
        for(int i = 0;i < topping_calories.size();i++) {
            if (!sides.isEmpty()) {
                for (int j = 0; j < getSides().size(); j++) {
                    if (topping_calories.get(i).getName().equalsIgnoreCase(getSides().get(j))) {
                        sides_cals += topping_calories.get(i).getCalories();
                    }
                }
            }
        }
        if(size.equals("8")){
            sides_cals *= 1.5;
        } else if (size.equals("12")) {
            sides_cals *= 2;
        }
        return sides_cals;
    }

}
