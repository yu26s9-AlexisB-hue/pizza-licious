package TheStore;

import ToppingEnums.CrustType;
import ToppingEnums.PizzaSize;
import ToppingEnums.PremiumType;
import ToppingEnums.RegularType;
import com.pluralsight.Toppings;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Console {
    private static final Scanner scanner = new Scanner(System.in);

    /**
     * Prompts the user for a double.
     * @param prompt to display the user
     * @return the double the user selected.
     */
    public static double promptForDouble(String prompt) {
//Taking note of what changed for the int
//        System.out.print(prompt);
//        double result =  scanner.nextDouble();
//        scanner.nextLine();
//        return result;
        System.out.println(prompt);
        double result;
        while(true){
            try {
                result = scanner.nextDouble();
                return result;
            } catch (InputMismatchException e) {
                System.out.println("Invalid selection, please enter a number: ");
            }
        }

    }

    /**
     * Prompts the user for a string.
     * @param prompt to display the user
     * @return the string the user selected.
     */
    public static String promptForString(String prompt) {
        System.out.print(prompt);
        return scanner.nextLine();
    }

    /**
     * Prompts the user for an integer.
     * @param prompt to display the user
     * @return the int the user selected.
     */
    public static int promptForInt(String prompt) {
// This is the older/original way to prompt for this
//        System.out.print(prompt);
//        int result =  scanner.nextInt();
//        scanner.nextLine();
//        return result;

        //This a new way to prompt the user and check for incorrect entries.
        System.out.println(prompt);
        int result;
        while(true){
            try{
                result = scanner.nextInt();
                scanner.nextLine();

                return result;
            } catch (InputMismatchException e) {
                System.out.println("Invalid selection, please enter a number: ");
            }
            scanner.nextLine();
        }

    }

    /**
     * Prompts the user for a Yes or No which is returned as a boolean.
     * @param prompt to display the user
     * @return the boolean
     */
    public static boolean promptForYesNo(String prompt) {
        System.out.print(prompt);
        String userInput = scanner.nextLine();
        return userInput.equalsIgnoreCase("YES");
        //opportunity to enhance this with some error protection.
    }

    /**
     * Prompts the user to type out what pizza size that they would like.
     * @param prompt to display to the user
     * @return the enum
     */
    public static PizzaSize promptForPizzaSize(String prompt){
        System.out.println(prompt);

        String pizzaSize = scanner.nextLine().toUpperCase();

        switch(pizzaSize){
            case "PERSONAL":
                return PizzaSize.PERSONAL;
            case "MEDIUM":
                return PizzaSize.MEDIUM;
            case "LARGE":
                return PizzaSize.LARGE;
            default:
                System.out.println("Invalid Pizza size.");
                return null;
        }
    }

    /**
     * Prompt the user to type out what crust they would like
     * @param prompt to display to the user
     * @return the enum
     */

    public static CrustType promptForPizzaCrust(String prompt){
        System.out.println(prompt);

        String pizzaCrust = scanner.nextLine().toUpperCase();

        switch(pizzaCrust){
            case "THIN":
                return CrustType.THIN;

            case "THICK":
                return CrustType.THICK;

            case "REGULAR":
                return CrustType.REGULAR;

            case "CAULIFLOWER":
                return CrustType.CAULIFLOWER;

            default:
                System.out.println("Invalid Entry.");
                return null;
        }
    }

    /**
     * Prompts the user to type out which Premium topping that the would like.
     * @param prompt display to the user
     * @return the enum
     */

    public static PremiumType promptForPremiumToppings(String prompt){
        while(true) {
            try {
                System.out.println(prompt);

                String premiumTopping = scanner.nextLine().toUpperCase();

                return PremiumType.valueOf(premiumTopping);
            } catch (IllegalArgumentException e) {
                System.out.println("Invalid topping.");
            }
        }
    }

    /**
     * prompts the user for their choice of a regular topping
     * @param prompt display to the user
     * @return the enum
     */

    public static RegularType promptForRegularToppings(String prompt){
        while(true){
            try {
                System.out.println(prompt);

                String regularTopping = scanner.nextLine().toUpperCase();

                return RegularType.valueOf(regularTopping);

            } catch (IllegalArgumentException e) {
                System.out.println("Invalid topping.");
            }
        }
    }

}
