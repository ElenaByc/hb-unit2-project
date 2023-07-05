public class Main {
    public static void main(String[] args) {

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


}
