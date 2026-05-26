package TheStore;

import com.pluralsight.Order;

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
                    newOrderScreen();
                    break;

                case 0:
                    running = false;
                    break;
            }
        }
    }

    private void newOrderScreen(){
        boolean running2 = true;
        while(running2){
            String prompt2 = """
                    1 - Add Pizza
                    0 - Cancle Order
                    """;
            //todo:add the options as I go
            int command2 = Console.promptForInt(prompt2);

            switch(command2){
                case 1:

                    break;
                case 0:
                    running2 = false;
            }
        }
    }


}
