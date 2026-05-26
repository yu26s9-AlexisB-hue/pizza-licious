package ToppingEnums;

public enum PizzaSize {
    PERSONAL(8),
    MEDIUM(12),
    LARGE(16);

    private final int size;

    PizzaSize(int size){
        this.size = size;
    }

    public int getSize(){
        return size;
    }
}
