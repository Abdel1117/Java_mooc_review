
import java.util.Scanner;

public class AverageOfNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double average = 0;
        int number_of_input = 0;
        int total = 0;

        while (true) {

            System.out.println("Give a number:");
            int input = Integer.valueOf(scanner.nextLine());

            if (input != 0) {
                total = total + input;
                number_of_input++;
            } else {

                average = (double) total / number_of_input;
                break;
            }
        }
        System.out.println("Average of the numbers: " + average);
    }
}
