package com.ps;

public abstract class Product implements Priced {

    protected double price;

    public Product(){
        this.price = 0;
    }

    public Product(double price) {
        this.price = price;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

}
