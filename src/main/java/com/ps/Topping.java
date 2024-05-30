package com.ps;

public abstract class Topping implements Edible {

    private String name;
    private int calories;

    public Topping(String name, int calories) {
        this.name = name;
        this.calories = calories;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCalories() {
        return calories;
    }

    public void setCalories(int calories) {
        this.calories = calories;
    }

    @Override
    public double calcCalories() {
        return getCalories();
    }



}
