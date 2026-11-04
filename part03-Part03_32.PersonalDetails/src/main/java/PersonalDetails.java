
import java.util.ArrayList;
import java.util.Scanner;

public class PersonalDetails {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int count = 0;
        int sumYear = 0;
        String longestName = "";
        while (true) {

            String input = String.valueOf(scanner.nextLine());
            if (input.isEmpty()) {
                break;
            }
            count++;
            String[] splittedStrings = input.split(",");
            if (longestName.length() < splittedStrings[0].length()) {
                longestName = splittedStrings[0];
            }
            sumYear = sumYear + Integer.valueOf(splittedStrings[1]);
        }

        double averageBirthYear = (1.00 * sumYear / count);

        System.out.println("Longest name: " + longestName);
        System.out.println("Average of the birth years: " + averageBirthYear);
    }
}
