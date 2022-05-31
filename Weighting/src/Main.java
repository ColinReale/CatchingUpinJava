public class Main {
//    using the suggested information on the mooc website as far as items to add to the hold
//    creating the items and adding them to suitcases, which are in the hold
    public static void main(String[] args) {

//        instantiating new items with names and weights
        Item book = new Item("Lord of the rings", 2);
        Item phone = new Item("Nokia 3210", 1);
        Item brick = new Item("brick", 4);

        Suitcase caseOne = new Suitcase(10);
        caseOne.addItem(book);
        caseOne.addItem(phone);

        Suitcase caseTwo = new Suitcase(10);
        caseTwo.addItem(brick);

        Hold hold = new Hold(1000);
        hold.addSuitcase(caseOne);
        hold.addSuitcase(caseTwo);

        System.out.println("The suitcases in the hold contain the following items:");
        hold.printItems();
    }
}