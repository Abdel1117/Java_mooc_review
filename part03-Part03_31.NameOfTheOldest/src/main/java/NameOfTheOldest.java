
import java.util.Scanner;

public class NameOfTheOldest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int age = 0;
        String name = "";
        while (true) {

            String input = String.valueOf(scanner.nextLine());
            if (input.isEmpty()) {
                break;
            }
            String[] splittedStrings = input.split(",");
            if (age < Integer.valueOf(splittedStrings[1])) {
                age = Integer.valueOf(splittedStrings[1]);
                name = splittedStrings[0];
            }
        }
        System.out.println("Name of the oldest: " + name);
    }
}
