package com.ps;

import java.util.HashMap;

public class Drink extends Product{

    private String size;
   private HashMap<String,Double> size_pricing;

    public Drink(String size) {
        size_pricing = new HashMap<>();
        this.size = size;
        setSize_pricing();
    }

    public void setSize_pricing(){
        size_pricing.put("small", 2.00);
        size_pricing.put("medium", 2.50);
        size_pricing.put("large", 3.00);
    }


    public double calcPrice(){
        switch (size){
            case("small"):
                setPrice(size_pricing.get("small"));
                break;
            case("medium"):
                setPrice(size_pricing.get("medium"));
                break;
            case("large"):
                setPrice(size_pricing.get("large"));
                break;
        }
        return getPrice();
    }

    @Override
    public String toString() {

        return String.format("Drink: size: %s price: %.2f\n",size, calcPrice() );

    }

}
