import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // implement here your program that uses the TelevisionProgram class

        ArrayList<TelevisionProgram> programs = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        int max_duration = 0;

        while (true) {
            System.out.println("Name: ");
            String input = String.valueOf(scanner.nextLine());
            if (input.isEmpty()) {
                break;
            }
            System.out.println("Duration: ");
            int input_duration = Integer.valueOf(scanner.nextLine());

            if (max_duration < input_duration) {
                max_duration = input_duration;
            }
            programs.add(new TelevisionProgram(input, input_duration));

        }

        System.out.println("Program(s maximum duration? ");
        int input_max_duration = Integer.valueOf(scanner.nextLine());
        for (TelevisionProgram program : programs) {
            if (program.getDuration() <= input_max_duration) {
                System.out.println(program);
            }
        }
    }
}
