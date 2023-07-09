import java.util.ArrayList;
import java.util.Scanner;
import java.time.LocalDate;
import java.time.LocalTime;

public class Order {
    public Order(ArrayList<Cupcake> cupcakeMenu, ArrayList<Drink> drinkMenu) {
        ArrayList<Object> order = new ArrayList<>();
        Scanner input = new Scanner(System.in);

        System.out.print("Hello customer. Would you like to place an order? (Y or N) ");
        String placeOrder = input.next();
        input.nextLine();

        if (placeOrder.equalsIgnoreCase("Y")) {

            // Add LocalDate.now() to order
            order.add(LocalDate.now());

            //Add LocalTime.now() to order
            order.add(LocalTime.now());

            System.out.println("Here is the menu");
            System.out.println("CUPCAKES:");

            int itemNumber = 0;

            // Create a for loop that iterates through each index of cupcakeMenu
            for (Cupcake cupcake : cupcakeMenu) {
                itemNumber++;
                System.out.print(itemNumber + ". ");
                cupcake.type();
                System.out.println("Price: $" + cupcake.getPrice());
            }
            System.out.println();

            System.out.println("DRINKS:");

            // Create a for loop that iterates through each index of drinkMenu
            for (Drink drink : drinkMenu) {
                itemNumber++;
                System.out.print(itemNumber + ". ");
                drink.type();
                System.out.println("Price: $" + drink.getPrice());
            }
            System.out.println();

            boolean ordering = true;
            while (ordering) {
                System.out.println("What would you like to order?");
                System.out.println("Please use the number associated with each item to order");

                int orderChoice = input.nextInt();
                input.nextLine();

                switch (orderChoice) {
                    case 1 -> {
                        order.add(cupcakeMenu.get(0));
                        System.out.println("Cupcake added to order");
                    }
                    case 2 -> {
                        order.add(cupcakeMenu.get(1));
                        System.out.println("Cupcake added to order");
                    }
                    case 3 -> {
                        order.add(cupcakeMenu.get(2));
                        System.out.println("Cupcake added to order");
                    }
                    case 4 -> {
                        order.add(drinkMenu.get(0));
                        System.out.println("Drink added to order");
                    }
                    case 5 -> {
                        order.add(drinkMenu.get(1));
                        System.out.println("Drink added to order");
                    }
                    case 6 -> {
                        order.add(drinkMenu.get(2));
                        System.out.println("Drink added to order");
                    }
                    default -> System.out.println("Sorry, we don't seem to have that on the menu");
                }

                System.out.println("Would you like to continue ordering? (Y/N)");
                String continueOrder = input.next();
                input.nextLine();

                if (!continueOrder.equalsIgnoreCase("Y")) {
                    ordering = false;
                }
            }

            System.out.println(order);
            System.out.println();
            // Print the first item in the order ArrayList - the date
            System.out.println(order.get(0));

            // Print the second item in the order ArrayList - the time
            System.out.println(order.get(1));

            // Create a double variable named subtotal and set it to 0.0;
            Double subTotal = 0.0;

            for (int i = 2; i < order.size(); i++) {
                // Check if order at i is equal to cupcakeMenu at 0
                if (order.get(i).equals(cupcakeMenu.get(0))) {
                    cupcakeMenu.get(0).type();
                    System.out.println(cupcakeMenu.get(0).getPrice());
                    subTotal = subTotal + cupcakeMenu.get(0).getPrice();
                } else if (order.get(i).equals(cupcakeMenu.get(1))) {
                    cupcakeMenu.get(1).type();
                    System.out.println(cupcakeMenu.get(1).getPrice());
                    subTotal = subTotal + cupcakeMenu.get(1).getPrice();
                }
                if (order.get(i).equals(cupcakeMenu.get(2))) {
                    cupcakeMenu.get(2).type();
                    System.out.println(cupcakeMenu.get(2).getPrice());
                    subTotal = subTotal + cupcakeMenu.get(2).getPrice();
                } else if (order.get(i).equals(drinkMenu.get(0))) {
                    drinkMenu.get(0).type();
                    System.out.println(drinkMenu.get(0).getPrice());
                    subTotal = subTotal + drinkMenu.get(0).getPrice();
                } else if (order.get(i).equals(drinkMenu.get(1))) {
                    drinkMenu.get(1).type();
                    System.out.println(drinkMenu.get(1).getPrice());
                    subTotal = subTotal + drinkMenu.get(1).getPrice();
                } else if (order.get(i).equals(drinkMenu.get(2))) {
                    drinkMenu.get(2).type();
                    System.out.println(drinkMenu.get(2).getPrice());
                    subTotal = subTotal + drinkMenu.get(2).getPrice();
                }
            }
            System.out.println("$" + subTotal + "\n");
        } else {
            System.out.println("Have a nice day then");
        }

    }
}
