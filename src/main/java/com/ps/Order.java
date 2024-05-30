package com.ps;

import java.util.ArrayList;

public class Order {


    private ArrayList<Product> order;
    Sandwich sandwich;

    public Order(){
        order = new ArrayList<>();
    }
   public void add(Product product){
       order.add(product);
   }

public void startSandwich(String size){
       sandwich = new Sandwich(0,size,null,null,null,false,false,false);
}

public void addBread(String bread){
       sandwich.setBread(bread);
}

public void addMeat(String meat){
       sandwich.setMeat(meat);
}

    public void addExtraMeat(boolean extra_meat){
        sandwich.setExtra_meat(extra_meat);
    }

public void addCheese(String cheese){
       sandwich.setCheese(cheese);
}

public void addExtraCheese(boolean extra_cheese){
       sandwich.setExtra_cheese(extra_cheese);
}

public void addTopping(ArrayList<String> toppings){
        sandwich.setToppings(toppings);
}


}
