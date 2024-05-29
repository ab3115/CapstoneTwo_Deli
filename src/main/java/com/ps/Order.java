package com.ps;

import java.util.ArrayList;

public class Order {

    private ArrayList<Product> order = new ArrayList<>();
    Sandwich sandwich;

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

public void addCheese(String cheese){
       sandwich.setCheese(cheese);
}

public void addTopping(){

}


}
