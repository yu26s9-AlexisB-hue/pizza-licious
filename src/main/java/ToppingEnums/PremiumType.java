package ToppingEnums;

public enum PremiumType {
    PEPPERONI("Meat"),
    SAUSAGE("Meat"),
    BACON("Meat"),
    HAM("Meat"),
    MEATBALL("Meat"),
    CHICKEN("Meat"),

    MOZZARELLA("Cheese"),
    PARMESAN("Cheese"),
    RICOTTA("Cheese"),
    GOAT_CHEESE("Cheese"),
    BUFFALO("Cheese");


    private final String category;

    PremiumType(String category){
        this.category = category;
    }

    public String getCategory(){
        return category;
    }

    public boolean isMeat(){
        return this.category.equalsIgnoreCase("MEAT");
    }

}
