
import java.util.Scanner;

public class Factorial {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int value = Integer.valueOf(scanner.nextLine());
        int result = 1;
        for (int i = 1; i <= value; i++) {
            System.out.println(i);
            result = result * i;
            System.out.println(result);
        }
        System.out.println("Factorial: " + result);
    }
}
