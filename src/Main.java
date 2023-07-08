import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ArrayList<Cupcake> cupcakeMenu = new ArrayList<>();
        Cupcake cupcake = new Cupcake();
        RedVelvet redVelvet = new RedVelvet();
        Chocolate chocolate = new Chocolate();

        ArrayList<Drink> drinkMenu = new ArrayList<>();
        Drink water = new Drink();
        Soda soda = new Soda();
        Milk milk = new Milk();


        // Cupcakes
        System.out.println("We are in the middle of creating the cupcake menu");
        System.out.println("We currently have three cupcakes on the menu but we need to decide on pricing");

        Scanner input = new Scanner(System.in);

        // get price for standard cupcake
        System.out.println("We are deciding on the price for our standard cupcake.");
        System.out.print("Here is the description: ");
        cupcake.type();

        System.out.println("How much would you like to charge for the cupcake?");
        System.out.print("Input a numerical number taken to 2 decimal places: ");

        String priceText = input.nextLine();
        double price = Double.parseDouble(priceText);
        cupcake.setPrice(price);

        // get price for red velvet cupcake
        System.out.println("We are deciding on the price for our red velvet cupcake.");
        System.out.print("Here is the description: ");
        redVelvet.type();

        System.out.println("How much would you like to charge for the cupcake?");
        System.out.print("Input a numerical number taken to 2 decimal places: ");

        priceText = input.nextLine();
        price = Double.parseDouble(priceText);
        redVelvet.setPrice(price);

        // get price for chocolate cupcake
        System.out.println("We are deciding on the price for our chocolate cupcake.");
        System.out.print("Here is the description: ");
        chocolate.type();

        System.out.println("How much would you like to charge for the cupcake?");
        System.out.print("Input a numerical number taken to 2 decimal places: ");

        priceText = input.nextLine();
        price = Double.parseDouble(priceText);
        chocolate.setPrice(price);

        // add each of these Cupcake objects to the cupcakeMenu ArrayList
        cupcakeMenu.add(cupcake);
        cupcakeMenu.add(redVelvet);
        cupcakeMenu.add(chocolate);

        // print cupcakeMenu
        System.out.println();
        for (Cupcake cupcake1 : cupcakeMenu) {
            cupcake1.type();
            System.out.println("price: " + cupcake1.getPrice());
        }
        System.out.println();

        // Drinks
        System.out.println("We are in the middle of creating the drink menu.");
        System.out.println("We currently have three types of drinks on the menu but we need to decide on pricing");

        // get price for bottled water
        System.out.println("We are deciding on the price for our bottled water.");
        System.out.print("Here is the description: ");
        water.type();

        System.out.println("How much would you like to charge for the water bottle?");
        System.out.print("Input a numerical number taken to 2 decimal places: ");

        priceText = input.nextLine();
        price = Double.parseDouble(priceText);
        water.setPrice(price);

        // get price for bottle of soda
        System.out.println("We are deciding on the price for our bottle of soda.");
        System.out.print("Here is the description: ");
        soda.type();

        System.out.println("How much would you like to charge for the bottled soda?");
        System.out.print("Input a numerical number taken to 2 decimal places: ");

        priceText = input.nextLine();
        price = Double.parseDouble(priceText);
        soda.setPrice(price);

        // get price for bottle of milk
        System.out.println("We are deciding on the price for our bottle of milk.");
        System.out.print("Here is the description: ");
        milk.type();

        System.out.println("How much would you like to charge for the bottled milk?");
        System.out.print("Input a numerical number taken to 2 decimal places: ");

        priceText = input.nextLine();
        price = Double.parseDouble(priceText);
        milk.setPrice(price);

        // add water, soda and milk to drinkMenu
        drinkMenu.add(water);
        drinkMenu.add(soda);
        drinkMenu.add(milk);

        // print drinkMenu
        System.out.println();
        for (Drink drink1 : drinkMenu) {
            drink1.type();
            System.out.println("price: " + drink1.getPrice());
        }

        new Order(cupcakeMenu, drinkMenu);

    }
}


// Create a new class named Cupcake.
// This will be the class all other cupcakes inherit from
class Cupcake {
    public double price;

    public double getPrice() {
        return this.price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void type() {
        System.out.println("A basic, generic cupcake, with vanilla frosting");
    }
}

// Create a new class named RedVelvet that extends from Cupcake
class RedVelvet extends Cupcake {
    public void type() {
        System.out.println("A red velvet based cupcake, with cream cheese frosting");
    }
}

// Create a new class named Chocolate that extends from Cupcake
class Chocolate extends Cupcake {
    public void type() {
        System.out.println("A chocolate based cupcake, with chocolate frosting");
    }
}

// Create a new class named Drink. This will be the class all other drinks inherit from
class Drink {
    public double price;

    public double getPrice() {
        return this.price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void type() {
        System.out.println("A bottle of water");
    }
}

class Soda extends Drink {
    public void type() {
        System.out.println("A bottle of soda");
    }
}

//Create a new class named Milk that extends from Drink
class Milk extends Drink {
    public void type() {
        System.out.println("A bottle of milk");
    }
}
