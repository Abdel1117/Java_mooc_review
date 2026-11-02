
import java.util.Scanner;

public class AVClub {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {

            String input = String.valueOf(scanner.nextLine());

            if (input.isEmpty()) {
                break;
            }
            String[] splitted = input.split(" ");

            for (int i = 0; i < splitted.length; i++) {
                if (splitted[i].contains("av")) {
                    System.out.println(splitted[i]);
                }
            }
        }

    }
}
