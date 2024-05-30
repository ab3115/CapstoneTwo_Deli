package com.ps;

import java.util.HashMap;

public class Drink extends Product{

    private String size;
    private String flavor;
   private HashMap<String,Double> size_pricing;

    public Drink(String size) {
        super();
        this.size = size;
    }


    public double calcPrice(){
        return 0;
    }
}
