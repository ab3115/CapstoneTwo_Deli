package com.ps;

public class Bread implements Edible{

    String name;
    int calories;

    public Bread(String name, int calories) {
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
        return 0;
    }
}
