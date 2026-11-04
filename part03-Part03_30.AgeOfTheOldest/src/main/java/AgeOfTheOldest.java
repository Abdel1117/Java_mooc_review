
import java.util.Scanner;

public class AgeOfTheOldest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int age = 0;
        while (true) {

            String input = String.valueOf(scanner.nextLine());
            if (input.isEmpty()) {
                break;
            }
            String[] splittedStrings = input.split(",");
            if (age < Integer.valueOf(splittedStrings[1])) {
                age = Integer.valueOf(splittedStrings[1]);
            }
        }
        System.out.println("Age of the oldest: " + age);
    }
}
