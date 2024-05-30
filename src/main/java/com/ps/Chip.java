package com.ps;

import java.util.HashMap;

public class Chip extends Product implements Edible{

    private String flavor;

    public Chip() {
        super();
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
        return String.format("Chip: price: %.2f \n", calcPrice() );
    }

    @Override
    public double calcCalories() {
        return 0;
    }
}
