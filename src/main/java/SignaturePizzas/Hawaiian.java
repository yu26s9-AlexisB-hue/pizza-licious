package SignaturePizzas;

import ToppingEnums.CrustType;
import ToppingEnums.PizzaSize;
import ToppingEnums.PremiumType;
import ToppingEnums.RegularType;
import com.pluralsight.Pizza;
import com.pluralsight.PremiumToppings;
import com.pluralsight.RegularToppings;

public class Hawaiian extends Pizza {

    public Hawaiian(PizzaSize size, CrustType crustChoice, boolean isStuffedCrust) {
        super(size, crustChoice, isStuffedCrust);

        addTopping(new PremiumToppings(false, PremiumType.HAM,size));
        addTopping(new PremiumToppings(false,PremiumType.MOZZARELLA,size));
        addTopping(new RegularToppings(false, RegularType.PINEAPPLE));
        addTopping(new RegularToppings(false,RegularType.MARINARA));
    }
}
