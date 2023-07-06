import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ArrayList<Cupcake> cupcakeMenu = new ArrayList<>();
        Cupcake cupcake = new Cupcake();
        RedVelvet redVelvet = new RedVelvet();
        Chocolate chocolate = new Chocolate();

        System.out.println("We are in the middle of creating the cupcake menu");
        System.out.println("We currently have three cupcakes on the menu but we need to decide on pricing");

        Scanner input = new Scanner(System.in);

        // get price for standard cupcake
        System.out.println("We are deciding on the price for our standard cupcake.");
        System.out.println("Here is the description:");
        cupcake.type();

        System.out.println("How much would you like to charge for the cupcake?");
        System.out.print("Input a numerical number taken to 2 decimal places: ");

        String priceText = input.nextLine();
        double price = Double.parseDouble(priceText);
        cupcake.setPrice(price);

        // get price for red velvet cupcake
        System.out.println("We are deciding on the price for our red velvet cupcake.");
        System.out.println("Here is the description:");
        redVelvet.type();

        System.out.println("How much would you like to charge for the cupcake?");
        System.out.print("Input a numerical number taken to 2 decimal places: ");

        priceText = input.nextLine();
        price = Double.parseDouble(priceText);
        redVelvet.setPrice(price);

        // get price for chocolate cupcake
        System.out.println("We are deciding on the price for our chocolate cupcake.");
        System.out.println("Here is the description:");
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

