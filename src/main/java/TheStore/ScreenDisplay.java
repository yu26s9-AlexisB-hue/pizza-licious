package TheStore;

import SignaturePizzas.*;
import ToppingEnums.CrustType;
import ToppingEnums.PizzaSize;
import ToppingEnums.PremiumType;
import ToppingEnums.RegularType;
import com.pluralsight.*;

import java.time.LocalDateTime;
import java.util.Random;

public class ScreenDisplay {
    private Order order;

    public void display(){
        boolean running = true;

        while(running) {
            System.out.println("--- Home Screen ---");
            String prompt1 = """
                    1 - New Order
                    0 - Exit
                    """;
            //Takes and return the users input into the command.
            int command1 = Console.promptForInt(prompt1);

            switch (command1) {
                case 1:
                    init();
                    newOrderScreen();
                    break;

                case 0:
                    running = false;
                    break;

                default:
                    System.out.println("Invalid Entry.");
                    break;
            }
        }
    }

    //initiates the creation of a new order everytime a user press "New Order".
    private void init(){
        order = new Order(idGenerator(), LocalDateTime.now());
    }

    //Creating a random Order ID# everytime a user creates a new order.
    private String idGenerator(){
        Random random = new Random();

        int randomNum = random.nextInt(9000) + 1000;

        return "ORDER-" + randomNum;
    }

    //Brings the user to a new screen.
    private void newOrderScreen(){
        boolean running2 = true;

        while(running2){
            String prompt2 = """
                    1 - Add Build-your-own Pizza
                    2 - Add Signature Pizza
                    3 - Add Drink
                    4 - Add Garlic Knots
                    5 - Proceed to Checkout
                    0 - Cancel Order
                    """;

            int command2 = Console.promptForInt(prompt2);

            switch(command2){
                case 1:
                    processPizzaOrder();
                    break;

                case 2:
                    proccessOrderForSigPizza();
                    break;

                case 3:
                    processDrinkOrder();
                    break;

                case 4:
                    processGarlicKnotOrder();
                    break;

                case 5:
                    checkOut();
                    break;

                case 0:
                    running2 = false;
                    break;

                default:
                    System.out.println("Invalid Entry.");
                    break;
            }
        }
    }

    //Brings the user to the window to order a pizza.
    private void processPizzaOrder(){
        //add pizza to the order list.
        PizzaSize size = Console.promptForPizzaSize("What size of Pizza would you like(Personal/Medium/Large): ");
        CrustType crust = Console.promptForPizzaCrust("What type of crust would you like(Thin/Regular/Thick/Cauliflower): ");
        boolean stuffed = Console.promptForYesNo("Would you like to make your pizza stuffed crust? ");
        Pizza pizza = new Pizza("Custom Pizza",size,crust,stuffed);
        askForPizzaToppings(pizza, size);

        order.addItem(pizza);
        System.out.println("Pizza has been add!");
    }

    //Processing the signature order.
    private void proccessOrderForSigPizza(){

        boolean ordering = true;

        while(ordering){
            //add pizza to the order list.
            System.out.println("Press '0' when you are finished with your order.");
            PizzaSize size = Console.promptForPizzaSize("What size of Pizza would you like(Personal/Medium/Large): ");
            CrustType crust = Console.promptForPizzaCrust("What type of crust would you like(Thin/Regular/Thick/Cauliflower): ");
            boolean stuffed = Console.promptForYesNo("Would you like to make your pizza stuffed crust? ");

            sigMenuDisplay();

            String sigPizza = Console.promptForString("Which signature Pizza would you like to order: ");

            Pizza pizza = null;
            switch(sigPizza.trim().toUpperCase()){

                case "PEPPERONI":
                    pizza = new Pepperoni("Pepperoni Pizza",size,crust,stuffed);
                    break;

                case "CHEESE":
                    pizza = new Cheese("Cheese Pizza",size,crust,stuffed);
                    break;

                case "MEAT_LOVERS":
                    pizza = new MeatLovers("MeatLovers Pizza",size,crust,stuffed);
                    break;

                case "VEGGIE":
                    pizza = new Veggie("Veggie Pizza",size, crust,stuffed);
                    break;

                case "SPINACH":
                    pizza = new Spinach("Spinach Pizza",size,crust,stuffed);
                    break;

                case "BBQ":
                    pizza = new BBQ("BBQ Pizza",size,crust,stuffed);
                    break;

                case "HAWAIIAN":
                    pizza = new Hawaiian("Hawaiian Pizza",size,crust,stuffed);
                    break;

                case "0":
                    ordering = false;
                    continue;

                default:
                    System.out.println("Invalid Entry.");
                    continue;

            }

            order.addItem(pizza);
            System.out.println("Pizza added successfully!");
            ordering = Console.promptForYesNo("Would you like to order another pizza? ");
        }
    }

    //Ask the user if the want premium or regular toppings
    private void askForPizzaToppings(Pizza pizza, PizzaSize size){

        boolean running = true;

        while (running) {

            String toppingChoice = Console.promptForString("What Topping category would you like to chose from first(Premium/Regular): ");

            switch (toppingChoice) {
                case "premium":
                    promptForPremiumToppings(pizza, size);
                    break;

                case "regular":
                    promptingForRegularToppings(pizza);
                    break;

                case "0":
                    running = false;

            }
        }
    }

    //goes through the enums for the premium topping.
    private static RegularType processingRegToppings(String regularTopping ){
        try {

            return RegularType.valueOf(regularTopping);

        } catch (IllegalArgumentException e) {
            System.out.println("Invalid topping.");
            return null;
        }
    }

    //goes through the enums for the regular topping.
    private static PremiumType processingPremiumToppings(String premiumTopping){

        try {

            return PremiumType.valueOf(premiumTopping);

        } catch (IllegalArgumentException e) {
            System.out.println("Invalid topping.");
            return null;
        }

    }

    //Prompts the user for the premium toppings that they want on their pizza.
    private static void promptForPremiumToppings(Pizza pizza, PizzaSize size){

        boolean ordering = true;
        boolean firstTopping = true;

        while(ordering) {

            //Displays the Premium topping menu to the customer.
            premiumMenuDisplay();
            System.out.println("*More than 1 premium topping will be an extra charge*");

            String premiums = Console.promptForString("What toppings would you like to add? ").toUpperCase();
            PremiumType toppingType = processingPremiumToppings(premiums);
            boolean extra = !firstTopping;
            PremiumToppings pt = new PremiumToppings(extra,toppingType,size);
            pizza.addTopping(pt);
            firstTopping = false;
            System.out.println("type '0' when you are finished.");
            ordering = Console.promptForYesNo("Would you like to add another topping? ");
        }
    }

    //Prompts the user for the regular toppings that they want on their pizza.
    private static void promptingForRegularToppings(Pizza pizza){
        boolean ordering = true;
        while(ordering){

            rToppingMenuDisplay();
            String regular = Console.promptForString("What toppings would you like to add? ").toUpperCase();
            RegularType toppingType2 = processingRegToppings(regular);
            RegularToppings reg = new RegularToppings(false, toppingType2);
            pizza.addTopping(reg);

            System.out.println("type '0' when you are finished.");
            ordering = Console.promptForYesNo("Would you like to add another topping? ");
        }
    }

    //shows the user a menu of the available premium toppings.
    private static void premiumMenuDisplay(){
        String premiumMenu = """
                       -Premium Menu-
                    --Meat--   --Cheese--
                    Pepperoni   Mozzarella
                    Sausage      Parmesan
                    Bacon        Ricotta
                    Ham         Goat_Cheese
                    Meatball      Buffalo
                    Chicken
                    """;
        System.out.println(premiumMenu);
    }

    //shows the user a menu of the available regular toppings.
    private static void rToppingMenuDisplay(){
        String regularMenu = """
                    -Included Menu-
                --Veggie--     --Sauce--
                Onions          Alfredo
                Mushrooms        Pesto
                Bell_peppers      BBQ
                Olives          Buffalo
                Tomatoes       Olive_oil
                Spinach
                Basil          --Sides--
                Pineapple      Red_pepper
                Anchovies      Parmesan
                """;
        System.out.println(regularMenu);
    }

    //display signature pizza menu.
    private static void sigMenuDisplay(){

        String sigMenu = """
                --Signature Menu--
                Pepperoni
                Cheese
                Meat_Lovers
                Veggie
                Spinach
                BBQ
                Hawaiian
                """;
        System.out.println(sigMenu);
    }

    //Allows the user to add a drink to their order.
    private void processDrinkOrder(){
        //Add drinks to order list.
        String drinkName = Console.promptForString("What would you like to drink? ");
        String drinkSize = Console.promptForString("What size drink would you like? ");
        Drinks drinks = new Drinks(drinkName,drinkSize);

        order.addItem(drinks);
        System.out.println("Drink has been added!");
    }

    //Allows the user to add garlic knots to their order.
    private void processGarlicKnotOrder(){
        //Adds garlic knots to the order.
        int numGK = Console.promptForInt("How many Garlic Knots would you like? ");
        GarlicKnots garlicKnots = new GarlicKnots(numGK);

        order.addItem(garlicKnots);
        System.out.println("Your Garlic Knots have been added!");
    }

    //Holds the screen allowing the user to check out.
    private void checkOut(){
        //Brings the customer to new page where they decide to buy or cancel.
        boolean running3 = true;
        if(!canCheckout()){
            System.out.println("""
                    You cannot checkout yet.
                    Your order must contain:
                    - A pizza
                    OR
                    - A drink or garlic knots
                    """);
            running3 = false;
        }

        while(running3){
            //Displays the order details and the price (orderedItems interface will come in handy).
            System.out.println("Ready to check out?");

            order.printReceipt();
            String prompt3 = """
                    1 - Confirm Order
                    0 - Cancel Order
                    """;
            int command3 = Console.promptForInt(prompt3);

            switch(command3){
                case 1:
                    order.confirmOrder();
                    System.out.println("Order is complete!");
                    return;
                case 0:
                    running3 = false;
                    System.out.println("Order Canceled.");
                    break;
            }
        }
    }

    //Checks if the order has a pizza or not.
    private boolean canCheckout(){
        boolean hasPizza = false;
        boolean hasDrink = false;
        boolean hasGarlicKnots = false;

        for(OrderedItems item: order.getOrderedItems()){
            if(item instanceof Pizza){
                hasPizza = true;
            }else if(item instanceof Drinks){
                hasDrink = true;
            }else if(item instanceof GarlicKnots){
                hasGarlicKnots = true;
            }
        }
        if (hasPizza){
            return true;
        }
        return hasDrink || hasGarlicKnots;
    }

}
