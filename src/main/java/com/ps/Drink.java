package com.ps;

import java.util.HashMap;

public class Drink extends Product{
    private String size;
    private String flavor;
   private HashMap<String,Double> size_pricing;

    public Drink(double price) {
        super(price);
    }


    public double calcPrice(){
        return 0;
    }
}
