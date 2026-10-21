
public class FromOneToParameter {

    public static void main(String[] args) {

        printUntilNumber(5);
    }

    public static void printUntilNumber(int number) {

        int init = 1;

        while (init <= number) {

            System.out.println(init);
            init++;
        }

    }
}
