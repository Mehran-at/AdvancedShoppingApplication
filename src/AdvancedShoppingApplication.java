// Derek is checking his fridge thinking about what to buy at the grocery store. He decides to write down a shopping list.
// . Create the AdvancedShoppingApplication class and write the following instructions in its main method:
// . Create the Grocery class that has one name.
// . Create an empty groceries list of Grocery and display it.
// . Create three different Grocery objects.
// . Add them to the groceries list and display it. To display the Grocery class create the toString method.
// . Create a new Grocery with the same name as a previous one and use it to remove the original one from the list. To remove a Grocery automatically you need to create the equals method in the Grocery class. Specify that two Grocery are the same if their name is the same. 
// . Add one of the existing groceries twice and display the list.
// . Remove the third element of the list by providing its position and display it.
// . Display its size.
//    Hints:
//  > Use Intellij shortcuts to create the toString and equals methods.

import java.util.ArrayList;
import java.util.List;

public class AdvancedShoppingApplication {
    public static void main(String[] args) {
        makeGrocery();
        Grocery grocery1 = new Grocery("Milk");
        Grocery grocery2 = new Grocery("Milk");
        Boolean answer =grocery1.equals(grocery2);
        System.out.println(answer);
    }

    public static List<Grocery> makeGrocery() {
        List<Grocery> groceries = new ArrayList<>();
        System.out.println(groceries);
        Grocery grocery1 = new Grocery("Milk");
        Grocery grocery2 = new Grocery("Bread");
        Grocery grocery3 = new Grocery("Banana");
        Grocery grocery4 = new Grocery("Orange");
        Grocery grocery5 = new Grocery("Orange");
        groceries.add(grocery1);
        groceries.add(grocery2);
        groceries.add(grocery3);
        groceries.add(grocery4);
        groceries.add(grocery4);
        System.out.println("Groceries: " + groceries);
        System.out.println(groceries);
        groceries.remove(grocery3);
        System.out.println(groceries);
        System.out.println(groceries.size());
        return groceries;
    }
}
