package TheStore;

import ToppingEnums.CrustType;
import ToppingEnums.PizzaSize;
import com.pluralsight.Pizza;

public class PizzaLicious {
    public static void main(String[] args){
        Pizza pizza = new Pizza(PizzaSize.PERSONAL, CrustType.REGULAR,true);
        Pizza pizza2 = new Pizza(PizzaSize.PERSONAL, CrustType.THIN,false);

        pizza.getCrustPrice();
        pizza2.getCrustPrice();

        System.out.printf("Your %s crust pizza's price is %.2f\n ", pizza.getCrustChoice() ,pizza.getCrustPrice());
        System.out.printf("Your %s crust pizza's pizza price is %.2f\n ", pizza2.getCrustChoice(),pizza2.getCrustPrice());

    }
}
