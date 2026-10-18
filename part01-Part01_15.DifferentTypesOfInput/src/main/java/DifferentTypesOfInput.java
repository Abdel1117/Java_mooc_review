
import java.util.Scanner;

public class DifferentTypesOfInput {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        /* Get a string */
        System.out.println("Give a string:");
        String value = String.valueOf(scan.nextLine());

        /* Get a Integer */
        System.out.println("Give an integer:");
        Integer value2 = Integer.valueOf(scan.nextLine());
        /* Get a Double */

        System.out.println("Give a double:");
        double value3 = Double.valueOf(scan.nextLine());
        /* Get a boolean */
        System.out.println("Give a boolean:");
        Boolean value4 = Boolean.valueOf(scan.nextLine());

        System.out.println("You gave the string " + value);
        System.out.println("You gave the integer " + value2);
        System.out.println("You gave the double " + value3);

        System.out.println("You gave the boolean " + value4);
        // Write your program here
    }
}
