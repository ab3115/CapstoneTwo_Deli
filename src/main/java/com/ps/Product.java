package com.ps;

public abstract class Product {
    protected double price;

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    protected abstract double calcPrice();
}
