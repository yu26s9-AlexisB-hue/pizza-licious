package SignaturePizzas;

import ToppingEnums.CrustType;
import ToppingEnums.PizzaSize;
import ToppingEnums.PremiumType;
import ToppingEnums.RegularType;
import com.pluralsight.Pizza;
import com.pluralsight.PremiumToppings;
import com.pluralsight.RegularToppings;

public class Pepperoni extends Pizza {

    public Pepperoni(String name,PizzaSize size, CrustType crustChoice, boolean isStuffedCrust) {
        super(name,size, crustChoice, isStuffedCrust);

        addTopping(new PremiumToppings(false, PremiumType.PEPPERONI,size));
        addTopping(new PremiumToppings(false, PremiumType.MOZZARELLA,size));
        addTopping(new RegularToppings(false, RegularType.MARINARA));
        addTopping(new RegularToppings(false, RegularType.PARMESAN));
        addTopping(new RegularToppings(false,RegularType.RED_PEPPER));

    }
}
