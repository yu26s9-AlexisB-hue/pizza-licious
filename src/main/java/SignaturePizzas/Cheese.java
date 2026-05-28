package SignaturePizzas;

import ToppingEnums.CrustType;
import ToppingEnums.PizzaSize;
import ToppingEnums.PremiumType;
import com.pluralsight.Pizza;
import com.pluralsight.PremiumToppings;

public class Cheese extends Pizza {

    public Cheese(PizzaSize size, CrustType crustChoice, boolean isStuffedCrust) {
        super(size, crustChoice, isStuffedCrust);

        addTopping(new PremiumToppings(false, PremiumType.MOZZARELLA,size));
        addTopping(new PremiumToppings(false,PremiumType.PARMESAN,size));
        addTopping(new PremiumToppings(false,PremiumType.RICOTTA,size));
        addTopping(new PremiumToppings(false,PremiumType.GOAT_CHEESE,size));
    }
}
