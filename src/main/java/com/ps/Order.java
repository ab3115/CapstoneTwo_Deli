package com.ps;

import java.util.ArrayList;

public class Order {


    private ArrayList<Product> order;
    Sandwich sandwich;
    Drink drink;
    Chip chips;

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

public void addSauces(ArrayList<String> sauces){
        sandwich.setSauces(sauces);
}

public void addSide(ArrayList<String> sides){
        sandwich.setSides(sides);
}

public void isToasted(boolean toasted){
        sandwich.setToasted(toasted);
}

public void addDrink(String size){
        drink = new Drink(size);
}

public void addChip(){
        chips = new Chip();
}

public String displayOrder(){
        return sandwich.toString();
}
public void checkOut(){
        add(sandwich);
}


}
