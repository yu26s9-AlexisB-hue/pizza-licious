package TheStore;

import ToppingEnums.CrustType;
import ToppingEnums.PizzaSize;
import com.pluralsight.Order;
import com.pluralsight.Pizza;

import java.time.LocalDate;
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
    private void init(){
        order = new Order(idGenerator(), LocalDate.now());
    }
    private void newOrderScreen(){
        boolean running2 = true;
        while(running2){
            String prompt2 = """
                    1 - Add Pizza
                    2 - Add Drink
                    3 - Add Garlic Knots
                    4 - Proceed to Checkout
                    0 - Cancel Order
                    """;
            //todo:add the options as I go
            int command2 = Console.promptForInt(prompt2);

            switch(command2){
                case 1:
                    processPizzaOrder();
                    break;

                case 2:
                    processDrinkOrder();
                    break;

                case 3:
                    processGarlicKnotOrder();
                    break;

                case 4:
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
    private void processPizzaOrder(){
        //todo: acutally add pizza to the order list.
        PizzaSize size = Console.promptForPizzaSize("What size of Pizza would you like(Personal/Medium/Large): ");
        CrustType crust = Console.promptForPizzaCrust("What type of crust would you like? ");
        boolean stuffed = Console.promptForYesNo("Would you like to make your pizza stuffed crust? ");
        Pizza pizza = new Pizza(size,crust,stuffed);
        order.addPizza(pizza);
        System.out.println("Pizza has been add!");
    }
    private void processDrinkOrder(){
        //todo: actually add drinks to order list
        System.out.println("Drink has been added!");
    }
    private void processGarlicKnotOrder(){
        //todo: Actually add garlic knots to the order.
        System.out.println("Your Garlic Knots have been added!");
    }
    private void checkOut(){
        //todo: should bring the customer to new page where they decide to buy or cancel.
        //todo:must display the order details and the price (orderedItems interface will come in handy).
        System.out.println("Ready to check out?");
        boolean running3 = true;

        while(running3){
            order.printReceipt();
            String prompt3 = """
                    1 - Confirm Order
                    0 - Cancel Order
                    """;
            int command3 = Console.promptForInt(prompt3);

            switch(command3){
                case 1:
                    System.out.println("Order is complete!");
                    return;
                case 0:
                    running3 = false;
                    System.out.println("Order Canceled.");
                    break;
            }
        }
    }
    private String idGenerator(){
        Random random = new Random();

        int randomNum = random.nextInt(9000) + 1000;

        return "ORDER-" + randomNum;
    }
}
