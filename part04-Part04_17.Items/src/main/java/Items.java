
import java.util.ArrayList;
import java.util.Scanner;

public class Items {

    public static void main(String[] args) {
        // implement here your program that uses the class Item

        ArrayList<Item> items = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        while (true) {

            String input = String.valueOf(scanner.nextLine());
            if (input.length() > 0) {
                items.add(new Item(input));
            } else {
                break;
            }
        }

        for (Item person : items) {
            System.out.println(person);
        }

    }
}
