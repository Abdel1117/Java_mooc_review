
import java.util.Scanner;

public class RepeatingBreakingAndRemembering {

    public static void main(String[] args) {

        // This exercise is worth five exercise points, and it is
        // gradually extended part by part.

        // If you want, you can send this exercise to the server
        // when it's just partially done. In that case the server will complain about
        // the parts you haven't done, but you'll get points for the finished parts.

        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        int numberOfNumber = 0;
        int number_of_odd = 0;
        int number_of_even = 0;
        double average = 0;
        while (true) {

            System.out.println("Give numbers:");
            int value = Integer.valueOf(scanner.nextLine());

            if (value == -1) {
                System.out.println("Thx! Bye!");
                break;
            }
            if (value % 2 == 0) {
                number_of_even++;
            } else {
                number_of_odd++;
            }
            numberOfNumber++;
            sum = sum + value;
            average = (double) sum / numberOfNumber;
            continue;
        }
        System.out.println("Sum: " + sum);
        System.out.println("Numbers: " + numberOfNumber);
        System.out.println("Average: " + average);
        System.out.println("Even: " + number_of_even);
        System.out.println("Odd: " + number_of_odd);
    }
}
