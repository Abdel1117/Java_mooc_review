
import java.util.Scanner;

public class LastWords {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {

            String input = String.valueOf(scanner.nextLine());
            if (input.isEmpty()) {
                break;
            }
            String[] splittedStrings = input.split(" ");
            int lastIndex = splittedStrings.length - 1;
            System.out.println(splittedStrings[lastIndex]);
        }
    }
}
