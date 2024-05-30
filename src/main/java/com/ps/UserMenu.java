package com.ps;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class UserMenu {

   static Scanner scanner = new Scanner(System.in);
   static boolean quit_menu = false;
   private Order order;


   public void homeScreen(){
       do {
           System.out.println("Welcome to Ocky's Sandwich shop!");
           System.out.println("\t(1)-New Order");
           System.out.println("\t(2)-Admin. Mode");
           System.out.println("\t(3)-Exit App.");
           try{
               int input = scanner.nextInt();

                       switch (input){
                           case(1):
                               order = new Order();
                               orderScreen();
                               break;
                           case (2):
                               adminScreen();
                               break;
                           case(3):
                               System.out.println("Have a Great Day!");
                               quit_menu = true;
                               System.exit(0);
                           default:
                               System.out.println("Please enter a valid option");
                               break;
                       }

           }catch(InputMismatchException e){
               System.out.println("Please choose from the above.");
               scanner.nextLine();
           }
       }while(!quit_menu);
   }





   public void orderScreen(){
        do{
            System.out.println("\t(1)-Add Sandwich");
            System.out.println("\t(2)-Add Drink");
            System.out.println("\t(3)-Add Chips");
            System.out.println("\t(4)-Checkout");
            try{
                int input = scanner.nextInt();

                switch (input){
                    case(1):
                        addSandwich();
                        break;
                    case(2):
                        addDrink();
                        break;
                    case(3):
                        addChip();
                        break;
                    case(4):
                        break;
                    default:
                        System.out.println("Please select a valid option.");
                        break;
                }
            }catch(InputMismatchException e){
                System.out.println("Please choose from the above.");
                scanner.nextLine();
            }
        }while(!quit_menu);
   }







   public void addSandwich() {

       do {
           System.out.println("What sized sandwich would you like?");
           System.out.println("\t(1) - 4\"");
           System.out.println("\t(2) - 8\"");
           System.out.println("\t(3) - 12\"");
           try {
               int choice = scanner.nextInt();
               switch (choice) {
                   case 1:
                       processAddSize("4");
                        addBread();
                       break;
                   case 2:
                       processAddSize("8");
                       addBread();
                       break;
                   case 3:
                       processAddSize("12");
                       addBread();
                       break;
                   default:
                       System.out.println("Please enter a valid size.");
                       break;
               }
           } catch (InputMismatchException e) {
               System.out.println("Please choose from the avaliable.");
               scanner.nextLine();
           }
       }while(!quit_menu);
   }


   public void addBread(){

     do {
         System.out.println("What kind of bread would you like?");
         System.out.println("\t(1)-White");
         System.out.println("\t(2)-Whole Wheat");
         System.out.println("\t(3)-Rye");
         System.out.println("\t(4)-Wrap");
         try{
             int option = scanner.nextInt();
             switch(option){
                 case 1:
                     processAddBread("White");
                     addMeat();
                     break;
                 case 2:
                     processAddBread("Whole Wheat");
                     addMeat();
                     break;
                 case 3:
                     processAddBread("Rye");
                     addMeat();
                     break;
                 case 4:
                     processAddBread("Wrap");
                     addMeat();
                     break;

             }
         }catch (InputMismatchException e){
             System.out.println("Please select a bread option");
             scanner.nextLine();
         }
     }while(!quit_menu);
   }



public void addMeat(){
       do{
           System.out.println("What kind of meat would you like?");
           System.out.println("\t(1)-Steak");
           System.out.println("\t(2)-Ham");
           System.out.println("\t(3)-Salami");
           System.out.println("\t(4)-Roast Beef");
           System.out.println("\t(5)-Chicken");
           System.out.println("\t(6)-Bacon");
           try{
               int input = scanner.nextInt();
               switch(input){
                   case 1:
                       processAddMeat("Steak");
                       extraMeat();
                       break;
                   case 2:
                       processAddMeat("Ham");
                       extraMeat();
                       break;
                   case 3:
                       processAddMeat("Salami");
                       extraMeat();
                       break;
                   case 4:
                       processAddMeat("Roast Beef");
                       extraMeat();
                       break;
                   case 5:
                       processAddMeat("Chicken");
                       extraMeat();
                       break;
                   case 6:
                       processAddMeat("Bacon");
                       extraMeat();
                       break;
                   default:
                       System.out.println("Please choose a valid option.");
                       break;
               }

           }catch(InputMismatchException e){
               System.out.println("Please select from the above.");
               scanner.nextLine();
           }

       }while(!quit_menu);
}



public void extraMeat(){
       do{
           System.out.println("Would you like extra meat?");
           System.out.println("\t(1)-Yes");
           System.out.println("\t(2)-No");
           try{
               int choice = scanner.nextInt();
               boolean extra_meat;

               switch (choice){
                   case 1:
                       extra_meat = true;
                       processExtraMeat(true);
                       addCheese();
                       break;
                   case 2:
                       extra_meat = false;
                       processExtraMeat(false);
                       addCheese();
                       break;
                   default:
                       System.out.println("Please choose yes or no.");
                       break;
               }
           }catch (InputMismatchException e) {
               System.out.println("Please enter a valid option.");
               scanner.nextLine();
           }
       }while(!quit_menu);
}



public void addCheese(){
       do{
           System.out.println("What kind of cheese would you like?");
           System.out.println("\t(1)-American");
           System.out.println("\t(2)-Provolone");
           System.out.println("\t(3)-Cheddar");
           System.out.println("\t(4)-Swiss");
           try{
               int input = scanner.nextInt();
               switch (input){
                   case 1:
                       processAddCheese("American");
                       extraCheese();
                       break;
                   case 2:
                       processAddCheese("Provolone");
                       extraCheese();
                       break;
                   case 3:
                       processAddCheese("Cheddar");
                       extraCheese();
                       break;
                   case 4:
                       processAddCheese("Swiss");
                       extraCheese();
                       break;
                   default:
                       System.out.println("Please choose a valid option");
                       break;
               }

           }catch (InputMismatchException e){
               System.out.println("Please select from the above.");
               scanner.nextLine();
           }
       }while(!quit_menu);
}




public void extraCheese(){
       do{  System.out.println("Would you like extra cheese?");
           System.out.println("\t(1)-Yes");
           System.out.println("\t(2)-No");
           try{
               int choice = scanner.nextInt();
               boolean extra_cheese;

               switch (choice){
                   case 1:
                       extra_cheese = true;
                       processExtraCheese(true);
                       addToppingsMenu();
                       break;
                   case 2:
                       extra_cheese= false;
                       processExtraCheese(false);
                       addToppingsMenu();
                       break;
                   default:
                       System.out.println("Please choose yes or no.");
                       break;
               }
           }catch (InputMismatchException e) {
               System.out.println("Please enter a valid option.");
               scanner.nextLine();
           }

       }while(!quit_menu);
}



public void addToppingsMenu(){
       ArrayList<String> user_selection = new ArrayList<>();
    ArrayList<String> topping_menu = order.sandwich.getAvaliable_toppings();
    boolean continue_choosing = true;
       while(continue_choosing) {
           for (int i = 0; i < topping_menu.size(); i++) {
               System.out.println(topping_menu.get(i));
           }
           System.out.println("Choose the toppings would you like on your sandwich");
           System.out.println("Enter topping name or write \"None\" to proceed ");

           try {
               for (int i = 0; i < topping_menu.size(); i++) {
                   String input = scanner.next();
                   if (input.equalsIgnoreCase("none")) {
                       continue_choosing = false;
                   } else if (input.equalsIgnoreCase(topping_menu.get(i))) {
                       user_selection.add(input);
                       topping_menu.remove(i);

                   }else {
                       System.out.println("Please select a choice from the menu.");
                   }
               }
           }catch (InputMismatchException e){
               System.out.println("Not a valid option.");
           }
       }
       processAddToppings(user_selection);

}

public void addSauces(){

}


   public void addDrink(){

   }
   public void addChip(){

   }

   public void checkout(){

   }

   public void adminScreen(){

   }

   public void processAddSize(String size){
       order.startSandwich(size);
   }

   public void processAddBread(String bread){
        order.addBread(bread);
   }

public void processAddMeat(String meat){
       order.addMeat(meat);
}

public void processAddCheese(String cheese){
       order.addCheese(cheese);
}

public void processExtraMeat(boolean extra_meat){
        order.addExtraMeat(extra_meat);
}

public void processExtraCheese(boolean extra_cheese){
       order.addExtraCheese(extra_cheese);
}

public void processAddToppings(ArrayList<String> toppings){
       order.addTopping(toppings);
}

}
