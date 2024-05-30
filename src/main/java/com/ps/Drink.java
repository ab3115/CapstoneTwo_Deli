package com.ps;

import java.util.HashMap;

public class Drink extends Product{

    private String size;
    private String flavor;
   private HashMap<String,Double> size_pricing;

    public Drink(String size) {
        super();
        this.size = size;
        setSize_pricing();
    }

    public void setSize_pricing(){
        size_pricing.put("small", 2.00);
        size_pricing.put("medium", 2.50);
        size_pricing.put("large", 3.00);
    }


    public double calcPrice(){
        return 0;
    }
}
