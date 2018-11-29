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