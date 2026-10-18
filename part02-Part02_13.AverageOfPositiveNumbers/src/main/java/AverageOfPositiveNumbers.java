
import java.util.Scanner;

public class AverageOfPositiveNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number_of_input = 0;
        int total = 0;
        double average = 0;
        boolean onlyNegatifNumber = true;

        while (true) {
            int input = Integer.valueOf(scanner.nextLine());

            if (input != 0) {
                if (input > 0) {
                    onlyNegatifNumber = false;
                    total = total + input;
                    number_of_input++;
                    continue;
                }
            } else {
                if (onlyNegatifNumber) {
                    System.out.println("Cannot calculate the average");
                } else {
                    average = (double) total / number_of_input;
                    System.out.println(average);

                }
                break;
            }
        }
    }
}
