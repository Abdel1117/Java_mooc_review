
import java.util.Scanner;

public class LargerThanOrEqualTo {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Give the first number:");
        int value = Integer.valueOf(scan.nextLine());

        System.out.println("Give the second number:");
        int value2 = Integer.valueOf(scan.nextLine());

        if (value > value2) {
            System.out.println("Greater number is: " + value);
        } else if (value2 > value) {
            System.out.println("Greater number is: " + value2

            );
        } else {
            System.out.println("The number are equal!");
        }

    }
}
