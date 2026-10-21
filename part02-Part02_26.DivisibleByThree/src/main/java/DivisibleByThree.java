
import java.util.Scanner;

public class DivisibleByThree {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int begining = Integer.valueOf(scanner.nextLine());
        int end = Integer.valueOf(scanner.nextLine());

        divisibleByThreeInRange(begining, end);
    }

    public static void divisibleByThreeInRange(int begining, int end) {

        while (begining <= end) {
            if (begining % 3 == 0) {
                System.out.println(begining);
            }
            begining++;
        }
    }

}
