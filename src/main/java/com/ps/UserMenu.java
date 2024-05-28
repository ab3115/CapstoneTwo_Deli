package com.ps;

import java.util.InputMismatchException;
import java.util.Scanner;

public class UserMenu {

   static Scanner scanner = new Scanner(System.in);
   static boolean quit_menu = false;

   public void menuDisplay() {

       do{
           System.out.println("Welcome to The Ocky Way!");
           System.out.println("What sized sandwich would you like?");
           System.out.println("\t(1)-4''");
           System.out.println("\t(2)-8''");
           System.out.println("\t(3)-12'' ");

           try {
               int choice = scanner.nextInt();
               switch (choice) {
                   case 1:
                       break;
                   case 2:
                       break;
                   case 3:
                       break;
                   case 4:

               }
           } catch (InputMismatchException e) {
               e.printStackTrace();
           }

       }while(!quit_menu);
   }


}
