
import java.util.Scanner;

public class FirstWords {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {

            String input = String.valueOf(scanner.nextLine());
            if (input.isEmpty()) {
                break;
            }
            String[] splittedStrings = input.split(" ");

            System.out.println(splittedStrings[0]);
        }
    }
}
