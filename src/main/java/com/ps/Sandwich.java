package com.ps;

public class Sandwich extends Product{

    private String size;
    private String bread;
    private String meat;
    private String cheese;


    public Sandwich(String size) {
        this.size = size;

    }


    @Override
    public double calcPrice() {
        return 0;
    }
}
