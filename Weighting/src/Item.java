//class called Item. This allows me to add Items to suitcases with associated characteristics like weight, name, etc.

public class Item {

    private int weight;
    private String name;

    public Item(String name, int weight) {
        this.name = name;
        this.weight = weight;
    }

    public int getWeight() {
        return this.weight;
    }

    @Override
    public String toString() {
        return this.name + ": (" + this.weight + " lbs)";
    }
}