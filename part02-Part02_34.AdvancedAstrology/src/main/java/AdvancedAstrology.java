
public class AdvancedAstrology {

    public static void printStars(int number) {
        // first part of the exercise
        String input = "";
        for (int i = 0; i < number; i++) {
            input = input + "*";
        }
        System.out.println(input);
    }

    public static void printSpaces(int number) {

        String space = "";

        for (int i = 0; i < number; i++) {
            space = space + " ";
        }
        System.out.print(space);
        // part 1 of the exercise
    }

    public static void printTriangle(int size) {
        // part 2 of the exercise

        for (int i = 1; i <= size; i++) {
            printSpaces(size - i);
            printStars(i);
        }
    }

    public static void christmasTree(int height) {
        // part 3 of the exercise

        for (int i = 1; i <= height; i++) {
            printSpaces(height - i);
            printStars(2 * i - 1);
        }

        for (int j = 0; j < 2; j++) {
            printSpaces(height - 2);
            printStars(3);
        }

    }

    public static void main(String[] args) {
        // The tests are not checking the main, so you can modify it freely.
        printStars(3);
        printSpaces(3);
        printTriangle(5);
        System.out.println("---");
        christmasTree(4);
        System.out.println("---");
        christmasTree(10);
    }
}
