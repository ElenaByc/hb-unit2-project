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
}
