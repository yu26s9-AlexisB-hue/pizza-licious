package ToppingEnums;

public enum RegularType {

    ONIONS("Veggie"),
    MUSHROOMS("Veggie"),
    BELL_PEPPERS("Veggie"),
    OLIVES("Veggie"),
    TOMATOES("Veggie"),
    SPINACH("Veggie"),
    BASIL("Veggie"),
    PINEAPPLE("Veggie"),
    ANCHOVIES("Veggie"),

    MARINARA("Sauce"),
    ALFREDO("Sauce"),
    PESTO("Sauce"),
    BBQ("Sauce"),
    BUFFALO("Sauce"),
    OLIVE_OIL("Sauce"),

    RED_PEPPER("Sides"),
    PARMESAN("Sides");


    private final String category;

    RegularType(String category){
        this.category = category;
    }

    public String getCategory(){
        return category;
    }
}
