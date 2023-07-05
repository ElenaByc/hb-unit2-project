# Hackbright Academy - Java course - Unit 2 Project

## Project Overview ##
For this project, imagine you are the owner of a shop. First, you want to start selling cupcakes.  
We will walk through the steps to represent cupcakes as objects, as well as create particular types of cupcakes.

## MVP ##
**Mars.java**  
**a.** Contains public class Main with a ``main`` method that:
  - Contains an ArrayList of Cupcakes called cupcakeMenu
  - Contains a Cupcake object
  - Contains a RedVelvet object
  - Contains a Chocolate object
  - Contains a scanner object to accept user inputs
  - Accepts user input 3 times for the 3 different prices of the cupcakes
  - Adds the 3 cupcakes to the cupcakeMenu
  - Contains an Arraylist of Drinks called drinkMenu
  - Contains a Drink object
  - Contains a Soda object
  - Contains a Milk object
  - Accepts user input 3 times for the 3 different prices of the drinks
  - Adds the 3 drinks to the drinkMenu
  - Call the Order constructor with the cupcakeMenu and drinkMenu as parameters

**b.** Contains class Cupcake that:
  - Contains a public function called getPrice that returns double
  - Contains a public function called setPrice that has a parameter of double and returns void
  - Contains a public function called type that returns void

**c.** Contains class RedVelvet that extends Cupcake with the appropriate functionality

**d.** Contains class Chocolate that extends Cupcake with the appropriate functionality

**e.** Contains class Drink that:
  - Contains a public function called getPrice that returns double
  - Contains a public function called setPrice that has a parameter of double and returns void
  - Contains a public function called type that returns void

**f.** Contains class Soda that extends Drink with the appropriate functionality

**g.** Contains class Milk that extends Drink with the appropriate functionality

**Order.java**  
**a.** Contains public class Order that:
  - Contains public Order constructor with cupcakeMenu and drinkMenu as parameters
    - Contains a scanner object
    - Accepts a user input using the scanner object
    - New ArrayList called order
    - If statement used to check if the user watchs to order
      - Add date to the order
      - Add time to the order
      - Use a for loop to print the cupcake menu
      - Use a for loop to print the drink menu
      - Use a while loop to run until the user is done ordering
        - Use an If statement that takes the user input and adds the corresponding item to their order
    - Use a for loop starting at 2 to loop threw the items added to the arrayList
      - Use an If statement to check if the item in the arraylist is equal to an item on either menu, if so take the price for that item and add it to the subtotal
    - Call the CreateFile constructor
    - Call the WriteToOrder constructor with order as the parameter
      
**b.** Contains class CreateFile that:
  - Contains public CreateFile constructor with no parameters
    - Contains a try block
      - Contains a File object
      - Contains an if statement that checks if the file does not exist
        - Make the file
      - Contains an else
    - Contains a catch block
   
**c.** Contains class WriteToFile that:
  - Contains public WriteToFile constructor with order as the parameter
    - Contains a try block
      - Contains a FileWriter object
      - Contains a PrintWriter object
      - Runs println(order) with the PrintWriter object
    - Contains a catch block

