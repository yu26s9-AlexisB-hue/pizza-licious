package SignaturePizzas;

import ToppingEnums.CrustType;
import ToppingEnums.PizzaSize;
import ToppingEnums.PremiumType;
import ToppingEnums.RegularType;
import com.pluralsight.Pizza;
import com.pluralsight.PremiumToppings;
import com.pluralsight.RegularToppings;

public class BBQ extends Pizza {

    public BBQ(String name,PizzaSize size, CrustType crustChoice, boolean isStuffedCrust) {
        super(name,size, crustChoice, isStuffedCrust);

        addTopping(new PremiumToppings(false, PremiumType.CHICKEN,size));
        addTopping(new PremiumToppings(false,PremiumType.MOZZARELLA,size));
        addTopping(new PremiumToppings(false,PremiumType.RICOTTA,size));
        addTopping(new RegularToppings(false, RegularType.BBQ));
        addTopping(new RegularToppings(false, RegularType.ONIONS));
    }
}
