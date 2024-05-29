package com.ps;

import java.util.InputMismatchException;
import java.util.Scanner;

public class UserMenu {

   static Scanner scanner = new Scanner(System.in);
   static boolean quit_menu = false;


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
                               orderScreen();
                               break;
                           case (2):
                               adminScreen();
                               break;
                           case(3):
                               quit_menu = true;
                               System.exit(0);
                       }

           }catch(InputMismatchException e){
               System.out.println("Please select a valid option.");
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
                }
            }catch(InputMismatchException e){
                System.out.println("Please select a valid option.");
            }
        }while(!quit_menu);
   }







   public void addSandwich() {

       do {
           System.out.println("What sized sandwich would you like?");
           System.out.println("\t(1) - 4''");
           System.out.println("\t(2) - 8''");
           System.out.println("\t(3) - 12'' ");
           String size;
           try {
               int choice = scanner.nextInt();
               switch (choice) {
                   case 1:
                       size = "4";
                       break;
                   case 2:
                       size = "8";
                       break;
                   case 3:
                       size = "12";
                       break;
               }
           } catch (InputMismatchException e) {
               System.out.println("Please choose a valid size.");
           }
       }while(!quit_menu);


   }

   System.out.println("What kind of bread would you like?");
       System.out.println("\t(1)-White");
       System.out.println("\t(2)-Whole Wheat");
       System.out.println("\t(3)-Rye");
       System.out.println("\t(4)-Wrap");





   public void addDrink(){

   }
   public void addChip(){

   }

   public void checkout(){

   }

   public void adminScreen(){

   }





}
