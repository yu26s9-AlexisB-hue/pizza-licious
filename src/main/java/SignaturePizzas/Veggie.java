package SignaturePizzas;

import ToppingEnums.CrustType;
import ToppingEnums.PizzaSize;
import ToppingEnums.PremiumType;
import ToppingEnums.RegularType;
import com.pluralsight.Pizza;
import com.pluralsight.PremiumToppings;
import com.pluralsight.RegularToppings;

public class Veggie extends Pizza {

    public Veggie(PizzaSize size, CrustType crustChoice, boolean isStuffedCrust) {
        super(size, crustChoice, isStuffedCrust);

        addTopping(new PremiumToppings(false, PremiumType.MOZZARELLA,size));
        addTopping(new RegularToppings(false, RegularType.ONIONS));
        addTopping(new RegularToppings(false,RegularType.MUSHROOMS));
        addTopping(new RegularToppings(false,RegularType.BELL_PEPPERS));
        addTopping(new RegularToppings(false,RegularType.OLIVES));
        addTopping(new RegularToppings(false, RegularType.MARINARA));

    }
}
