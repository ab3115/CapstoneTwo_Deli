package com.ps;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;

public class UserMenu {

    static Scanner scanner = new Scanner(System.in);
    static boolean quit_menu = false;
    private Order order = new Order();



    public void homeScreen() {
        do {
            StringBuilder sb = new StringBuilder();
            System.out.println("\n                        /////////////////////////////////////////");
            System.out.println("                         //                                     //");
            System.out.println("                           //   Welcome to Ocky's Sandwich shop!  //");
            System.out.println("                        //                                     //");
            System.out.println("                         //        \t(1)-New Order              // ");
            System.out.println("                     //        \t(2)-Exit App.              //");
            System.out.println("                    //                                     //");
            System.out.println("                   /////////////////////////////////////////");

            try {
                int input = scanner.nextInt();
                switch (input) {
                    case (1):
                        orderScreen();
                        break;
                    case (2):
                        System.out.println("Have a Great Day!");
                        quit_menu = true;
                        System.exit(0);
                    default:
                        System.out.println("Please enter a valid option\n");
                        break;
                }

            } catch (InputMismatchException e) {
                System.out.println("Please choose from the above.\n");
                scanner.nextLine();
            }
        } while (!quit_menu);
    }


    public void orderScreen() {
        do {
            System.out.println("\t(1)-Add Sandwich");
            System.out.println("\t(2)-Add Drink");
            System.out.println("\t(3)-Add Chips");
            System.out.println("\t(4)-Return");
            try {
                int input = scanner.nextInt();
                switch (input) {
                    case (1):
                        processStartSandwich();
                        chooseSandwich();
                        break;
                    case (2):
                        addDrink();
                        break;
                    case (3):
                        addChip();
                        break;
                    case (4):
                        homeScreen();
                        break;
                    default:
                        System.out.println("Please select a valid option.\n");
                        break;
                }
            } catch (InputMismatchException e) {
                System.out.println("Please choose from the above.\n");
                scanner.nextLine();
            }
        } while (!quit_menu);
    }



    public void chooseSandwich() {
        do {
            System.out.println("Would you like to try any of our signature sandwiches?!");
            System.out.println("Or create your own custom sandwich from scratch?");
            System.out.println("\t(1)-Make my own sandwich.");
            System.out.println("\t(2)-Make a BLT");
            System.out.println("\t(3)-Make a Philly Cheese Steak");
            System.out.println("\t(4)-Make a Pulled Pork Sub");
            System.out.println("\t(5)-Make a Spring Lovers.");
            try {
                int option = scanner.nextInt();
                switch (option) {
                    case 1:
                        addCustomSandwich();
                        break;
                    case 2:
                        processMakeSignature("BLT");
                        System.out.println("\nYou added a BLT to your order!\n");
                        addDrink();
                        break;
                    case 3:
                        processMakeSignature("Philly");
                        System.out.println("\nYou added a Philly Cheese Steak to your order!\n");
                        addDrink();
                        break;
                    case 4:
                        processMakeSignature("Pulled Pork");
                        System.out.println("\nYou added a Pulled Pork Sub to your order!\n");
                        addDrink();
                        break;
                    case 5:
                        processMakeSignature("Spring Lover");
                        System.out.println("\nYou added a Spring Lover's Sandwich to your order!\n");
                        addDrink();
                        break;
                    default:
                        System.out.println("Please choose from the above options.\n");
                        break;
                }
            } catch (InputMismatchException e) {
                System.out.println("Please enter a valid input.\n");
                scanner.nextLine();
            }
        } while (!quit_menu);
    }


    public void addCustomSandwich() {
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
                        System.out.println("You selected 4\"!\n");
                        addBread();
                        break;
                    case 2:
                        processAddSize("8");
                        System.out.println("You selected 8\"!\n");
                        addBread();
                        break;
                    case 3:
                        processAddSize("12");
                        System.out.println("You selected 12\"!\n");
                        addBread();
                        break;
                    default:
                        System.out.println("Please enter a valid size.\n");
                        break;
                }
            } catch (InputMismatchException e) {
                System.out.println("Please choose from the avaliable.\n");
                scanner.nextLine();
            }
        } while (!quit_menu);
    }

    public void addBread() {

        do {
            System.out.println("What kind of bread would you like?");
            System.out.println("\t(1)-White");
            System.out.println("\t(2)-Whole Wheat");
            System.out.println("\t(3)-Rye");
            System.out.println("\t(4)-Wrap");

            try {
                int option = scanner.nextInt();

                switch (option) {
                    case 1:
                        processAddBread("White");
                        System.out.println("You selected White bread!\n");
                        addMeat();
                        break;
                    case 2:
                        processAddBread("Whole Wheat");
                        System.out.println("You selected Whole Wheat bread!\n");
                        addMeat();
                        break;
                    case 3:
                        processAddBread("Rye");
                        System.out.println("You selected Rye bread!\n");
                        addMeat();
                        break;
                    case 4:
                        processAddBread("Wrap");
                        System.out.println("You selected Wrap bread!\n");
                        addMeat();
                        break;
                    default:
                        System.out.println("Please enter a valid choice.\n");
                        break;
                }
            } catch (InputMismatchException e) {
                System.out.println("Please select a bread option\n");
                scanner.nextLine();
            }
        } while (!quit_menu);
    }


    public void addMeat() {
        do {
            System.out.println("What kind of meat would you like?");
            System.out.println("\t(1)-Steak");
            System.out.println("\t(2)-Ham");
            System.out.println("\t(3)-Salami");
            System.out.println("\t(4)-Roast Beef");
            System.out.println("\t(5)-Chicken");
            System.out.println("\t(6)-Bacon");
            try {
                int input = scanner.nextInt();
                switch (input) {
                    case 1:
                        processAddMeat("Steak");
                        System.out.println("You selected Steak!\n");
                        extraMeat();
                        break;
                    case 2:
                        processAddMeat("Ham");
                        System.out.println("You selected Ham!\n");
                        extraMeat();
                        break;
                    case 3:
                        processAddMeat("Salami");
                        System.out.println("You selected Salami!\n");
                        extraMeat();
                        break;
                    case 4:
                        processAddMeat("Roast Beef");
                        System.out.println("You selected Roast Beef!\n");
                        extraMeat();
                        break;
                    case 5:
                        processAddMeat("Chicken");
                        System.out.println("You selected Chicken!\n");
                        extraMeat();
                        break;
                    case 6:
                        processAddMeat("Bacon");
                        System.out.println("You selected Bacon!\n");
                        extraMeat();
                        break;
                    default:
                        System.out.println("Please choose a valid option.\n");
                        break;
                }

            } catch (InputMismatchException e) {
                System.out.println("Please select from the above.\n");
                scanner.nextLine();
            }

        } while (!quit_menu);
    }


    public void extraMeat() {
        do {
            System.out.println("Would you like extra meat?");
            System.out.println("\t(1)-Yes");
            System.out.println("\t(2)-No");

            try {
                int choice = scanner.nextInt();
                boolean extra_meat;

                switch (choice) {
                    case 1:
                        extra_meat = true;
                        System.out.println("Added Extra Meat.\n");
                        processExtraMeat(true);
                        addCheese();
                        break;
                    case 2:
                        extra_meat = false;
                        System.out.println("No Extra Meat selected.\n");
                        processExtraMeat(false);
                        addCheese();
                        break;
                    default:
                        System.out.println("Please choose yes or no.\n");
                        break;
                }
            } catch (InputMismatchException e) {
                System.out.println("Please enter a valid option.\n");
                scanner.nextLine();
            }
        } while (!quit_menu);
    }




    public void addCheese() {
        do {
            System.out.println("What kind of cheese would you like?");
            System.out.println("\t(1)-American");
            System.out.println("\t(2)-Provolone");
            System.out.println("\t(3)-Cheddar");
            System.out.println("\t(4)-Swiss");

            try {
                int input = scanner.nextInt();
                switch (input) {
                    case 1:
                        processAddCheese("American");
                        System.out.println("You selected American Cheese!\n");
                        extraCheese();
                        break;
                    case 2:
                        processAddCheese("Provolone");
                        System.out.println("You selected Provolone Cheese!\n");
                        extraCheese();
                        break;
                    case 3:
                        processAddCheese("Cheddar");
                        System.out.println("You selected Cheddar Cheese!\n");
                        extraCheese();
                        break;
                    case 4:
                        processAddCheese("Swiss");
                        System.out.println("You selected Swiss Cheese!\n");
                        extraCheese();
                        break;
                    default:
                        System.out.println("Please choose a valid option\n");
                        break;
                }

            } catch (InputMismatchException e) {
                System.out.println("Please select from the above.\n");
                scanner.nextLine();
            }
        } while (!quit_menu);
    }



    public void extraCheese() {
        do {
            System.out.println("Would you like extra cheese?");
            System.out.println("\t(1)-Yes");
            System.out.println("\t(2)-No");
            try {
                int choice = scanner.nextInt();
                scanner.nextLine();
                boolean extra_cheese;
                switch (choice) {
                    case 1:
                        extra_cheese = true;
                        processExtraCheese(true);
                        System.out.println("Added Extra Cheese!\n");
                        addToppings();
                        break;
                    case 2:
                        extra_cheese = false;
                        processExtraCheese(false);
                        System.out.println("No Extra Cheese selected.\n");
                        addToppings();
                        break;
                    default:
                        System.out.println("Please choose yes or no.\n");
                        break;
                }
            } catch (InputMismatchException e) {
                System.out.println("Please enter a valid option.\n");
                scanner.nextLine();
            }

        } while (!quit_menu);
    }


    public void addToppings() {

        ArrayList<String> user_selection = new ArrayList<>();
        ArrayList<String> topping_menu = new ArrayList<>();
        topping_menu = order.sandwich.getAvaliable_toppings();
        boolean continue_choosing = true;

        while (continue_choosing) {
            for (int i = 0; i < topping_menu.size(); i++) {

                System.out.println(topping_menu.get(i));
            }
            System.out.println("Choose the toppings you would like on your sandwich");
            System.out.println("Enter topping name or write \"None\" to proceed ");
            String input;
            try {
                input = scanner.nextLine().toLowerCase();

                    if (input.equalsIgnoreCase("none") || topping_menu.isEmpty()) {
                        continue_choosing = false;
                    } else if (topping_menu.contains(input)) {
                        user_selection.add(input);
                        topping_menu.remove(input);
                    } else {
                        System.out.println("\nPlease select a choice from the menu.");
                    }


            } catch (InputMismatchException e) {
                System.out.println("Not a valid option.\n");
                scanner.nextLine();
            }
        }
        processAddToppings(user_selection);
        addSauces();
    }



    public void addSauces() {
        ArrayList<String> user_choices = new ArrayList<>();
        ArrayList<String> sauce_menu = new ArrayList<>();
        sauce_menu = order.sandwich.getAvaliable_sauces();
        boolean continue_choosing = true;
        while (continue_choosing) {
            for (int i = 0; i < sauce_menu.size(); i++) {
                System.out.println(sauce_menu.get(i));
            }
            System.out.println("Choose the sauces you like on your sandwich");
            System.out.println("Enter sauce name or write \"None\" to proceed ");
            String input;
            try {
                input = scanner.nextLine().toLowerCase();
                    if (input.equalsIgnoreCase("none") || sauce_menu.isEmpty()) {
                        continue_choosing = false;
                    } else if (sauce_menu.contains(input)) {
                        user_choices.add(input);
                        sauce_menu.remove(input);
                    } else {
                        System.out.println("Please select a choice from the menu.\n");
                    }
            } catch (InputMismatchException e) {
                System.out.println("Not a valid option.\n");
                scanner.nextLine();
            }
        }

        processAddSauces(user_choices);
        addSide();
    }

    public void addSide() {

        ArrayList<String> user_choice = new ArrayList<>();
        ArrayList<String> side_menu = new ArrayList<>();
        side_menu = order.sandwich.getAvaliable_sides();
        boolean continue_choosing = true;
        while (continue_choosing) {
            for (int i = 0; i < side_menu.size(); i++) {
                System.out.println(side_menu.get(i));
            }
            System.out.println("Choose the sides you like with your sandwich.");
            System.out.println("Enter side name or write \"None\" to proceed ");
            String input;
            try {
                input = scanner.nextLine().toLowerCase();
                    if (input.equalsIgnoreCase("none") || side_menu.isEmpty()) {
                        continue_choosing = false;
                    } else if (side_menu.contains(input)) {
                        user_choice.add(input);
                        side_menu.remove(input);
                    } else {
                        System.out.println("Please select a choice from the menu.\n");
                    }

            } catch (InputMismatchException e) {
                System.out.println("Please select a valid choice.\n");
                scanner.nextLine();
            }

        }
        processAddSide(user_choice);
        toasted();
    }

    public void toasted() {

        do {
            System.out.println("Would you like your sandwich toasted?");
            System.out.println("\t(1)-Yes");
            System.out.println("\t(2)-No");
            try {
                int input = scanner.nextInt();
                switch (input) {
                    case 1:
                        processToasted(true);
                        System.out.println("Toasted Sandwich!\n");
                        addDrink();
                        break;
                    case 2:
                        processToasted(false);
                        System.out.println("Chose not to toast.\n");
                        addDrink();
                        break;
                    case 3:
                        System.out.println("Please choose a valid choice.\n");
                        break;
                }
            } catch (InputMismatchException e) {
                System.out.println("Please enter valid input.\n");
                scanner.nextLine();
            }

        } while (!quit_menu);
    }


    public void addDrink() {
        do {
            System.out.println("What size drink would you like?");
            System.out.println("\t(1)-Small");
            System.out.println("\t(2)-Medium");
            System.out.println("\t(3)-Large");
            System.out.println("\t(4)-None");
            try {
                int input = scanner.nextInt();
                switch (input) {
                    case 1:
                        processAddDrink("small", "coke");
                        addChip();
                        break;
                    case 2:
                        processAddDrink("medium", "fanta");
                        addChip();
                        break;
                    case 3:
                        processAddDrink("large", "sprite");
                        addChip();
                        break;
                    case 4:
                        System.out.println("No drink was added.\n");
                        addChip();
                        break;
                    default:
                        System.out.println("Please choose an option on the list.\n");
                        break;
                }
            } catch (InputMismatchException e) {
                System.out.println("Please enter a valid choice.\n");
                scanner.nextLine();
            }
        } while (!quit_menu);
    }


    public void addChip() {
        do {
            System.out.println("Would you like to add a side of chips to your order?");
            System.out.println("\t(1)-Yes");
            System.out.println("\t(2)-No");
            try {
                int input = scanner.nextInt();
                switch (input) {
                    case 1:
                        processAddChip("Doritos");
                        checkout();
                        break;
                    case 2:
                        System.out.println("No chips were added.\n");
                        checkout();
                        break;
                }
            } catch (InputMismatchException e) {
                System.out.println("Please choose valid option.\n");
            }
        } while (!quit_menu);
    }

    public void checkout() {
        do {
            System.out.println("YOUR ORDER IS:");
            processCheckout();
            System.out.println("\nIs there anything else you'd like to add to your order?");
            System.out.println("\t(1)-Confirm and Pay");
            System.out.println("\t(2)-Add a Sandwich!");
            System.out.println("\t(3)-Cancel Order");
            try {
                int input = scanner.nextInt();
                switch (input) {
                    case 1:
                        processConfirm();
                        System.out.println("Thank You for your business!");
                        homeScreen();
                        quit_menu = true;
                        break;
                    case 2:
                        processStartSandwich();
                        chooseSandwich();
                        quit_menu = true;
                        break;
                    case 3:
                        processCancelOrder();
                        System.out.println("Returning to main menu....");
                        homeScreen();
                        break;
                    default:
                        System.out.println("Please select a valid choice.");
                        break;
                }

            } catch (InputMismatchException e) {
                System.out.println("Please enter a valid number.");
                scanner.nextLine();
            }
        } while (!quit_menu);
    }


    public void processStartSandwich() {
        order.startSandwich();
    }

    public void processAddSize(String size) {
        order.addSize(size);
    }

    public void processAddBread(String bread) {
        order.addBread(bread);
    }

    public void processAddMeat(String meat) {
        order.addMeat(meat);
    }

    public void processAddCheese(String cheese) {
        order.addCheese(cheese);
    }

    public void processExtraMeat(boolean extra_meat) {
        order.addExtraMeat(extra_meat);
    }

    public void processExtraCheese(boolean extra_cheese) {
        order.addExtraCheese(extra_cheese);
    }

    public void processAddToppings(ArrayList<String> toppings) {
        order.addTopping(toppings);
    }

    public void processAddSauces(ArrayList<String> sauces) {
        order.addSauces(sauces);
    }

    public void processAddSide(ArrayList<String> sides) {
        order.addSide(sides);
    }

    public void processToasted(boolean toasted) {
        order.isToasted(toasted);
    }

    public void processAddDrink(String size, String flavor) {
        order.addDrink(size, flavor);
    }

    public void processAddChip(String flavor) {
        order.addChip(flavor);
    }

    public void processCheckout() {

        order.displayOrder();
    }

    public void processConfirm() {
        order.printReceipt();
    }


    public void processMakeSignature(String choice) {
        order.setSignatureSandwich(choice);
    }

    public void processCancelOrder() {
        order.clearOrder();
    }


}
