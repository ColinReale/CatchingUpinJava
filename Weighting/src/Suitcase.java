import java.util.ArrayList;

public class Suitcase {

    private int maximumWeight;
    private ArrayList<Item> Items;

    public Suitcase(int maximumWeight) {
        this.Items = new ArrayList<>();
        this.maximumWeight = maximumWeight;
    }

    public void addItem(Item Item) {
        if (this.totalWeight() + Item.getWeight() > this.maximumWeight) {
            return;
        }

        this.Items.add(Item);
    }

    public int totalWeight() {
        int sum;

        sum = Items.stream()
                .map(Item -> Item.getWeight())
                .reduce(0, (a, b) -> a + b);





        return sum;
    }

    public void printItems() {

        Items.stream()
                .forEach(Item -> System.out.println(Item));

    }

    @Override
    public String toString() {
        if (this.Items.isEmpty()) {
            return "no items (0 lbs)";
        }

        if (this.Items.size() == 1) {
            return "1 item (" + this.totalWeight() + " lbs)";
        }

        return this.Items.size() + " items (" + this.totalWeight() + " lbs)";
    }
}