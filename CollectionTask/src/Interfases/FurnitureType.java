package Interfases;

public class FurnitureType {
    private String name;
    private int qty;

    public FurnitureType(String name, int qty) {
        this.name = name;
        this.qty = qty;
    }

    @Override
    public String toString() {
        return name;
    }
}
