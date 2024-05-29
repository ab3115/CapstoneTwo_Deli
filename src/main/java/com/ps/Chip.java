package com.ps;

import java.util.HashMap;

public class Chip extends Product{

    private String flavor;

    public Chip(String flavor) {
        super(1.50);
        this.flavor = flavor;
    }

    public String getFlavor() {
        return flavor;
    }

    public void setFlavor(String flavor) {
        this.flavor = flavor;
    }

    public double calcPrice(){
        return this.price;
    }

}
