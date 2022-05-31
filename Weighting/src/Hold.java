import java.util.ArrayList;

//Hold contains suitcases, which contains Items. It also has a maximumWeight feature which will not allow something to be added if it
//will cause the hold to exceed its max weight allowance
public class Hold {
    private ArrayList<Suitcase> suitcases;
    private int maximumWeight;

    public Hold(int maximumWeight) {
        this.maximumWeight = maximumWeight;
        this.suitcases = new ArrayList<>();
    }

    public void addSuitcase(Suitcase Suitcase) {
        if (this.totalWeight() + Suitcase.totalWeight() > maximumWeight) {
            return;
        }

        this.suitcases.add(Suitcase);
    }

    public int totalWeight() {
        int total = 0;

        total = suitcases.stream()
                .map(suitcases-> suitcases.totalWeight())
                .reduce(0, (a, b) -> a + b);

        return total;
    }

//    just prints everything
    public void printItems() {

        suitcases.stream()
                .forEach(Item->  Item.printItems());

    }
    @Override
    public String toString() {
        if (this.suitcases.isEmpty()) {
            return "no suitcases (0 lbs)";
        }
        if (this.suitcases.size() == 1) {
            return "1 suitcase (" + this.totalWeight() + " lbs)";
        }
        return this.suitcases.size() + " suitcases (" + this.totalWeight() + " lbs)";
    }
}