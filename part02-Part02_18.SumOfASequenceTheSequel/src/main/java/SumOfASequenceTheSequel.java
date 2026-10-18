
import java.util.Scanner;

public class SumOfASequenceTheSequel {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int first_number = Integer.valueOf(scanner.nextLine());
        System.out.println("First number?");
        int second_number = Integer.valueOf(scanner.nextLine());
        System.out.println("Last number?");
        int result = 0;
        for (int i = first_number; i <= second_number; i++) {
            result = result + i;
        }
        System.out.println("The sum is: " + result);
    }
}
