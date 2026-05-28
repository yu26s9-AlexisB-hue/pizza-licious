package SignaturePizzas;

import ToppingEnums.CrustType;
import ToppingEnums.PizzaSize;
import ToppingEnums.PremiumType;
import ToppingEnums.RegularType;
import com.pluralsight.Pizza;
import com.pluralsight.PremiumToppings;
import com.pluralsight.RegularToppings;

public class Spinach extends Pizza {

    public Spinach(String name,PizzaSize size, CrustType crustChoice, boolean isStuffedCrust) {
        super(name,size, crustChoice, isStuffedCrust);

        addTopping(new PremiumToppings(false, PremiumType.RICOTTA,size));
        addTopping(new PremiumToppings(false,PremiumType.PARMESAN,size));
        addTopping(new PremiumToppings(false, PremiumType.CHICKEN,size));
        addTopping(new RegularToppings(false, RegularType.ALFREDO));
        addTopping(new RegularToppings(false, RegularType.SPINACH));
        addTopping(new RegularToppings(false, RegularType.ONIONS));
        addTopping(new RegularToppings(false, RegularType.MUSHROOMS));

    }

}
