
import java.util.Scanner;

public class Login {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] arrayOfUsername = { "alex", "emma" };
        String[] arrayOfPassword = { "sunshine", "haskell" };

        String userName = String.valueOf(scanner.nextLine());
        String passWord = String.valueOf(scanner.nextLine());
        int node = 0;
        for (int i = 0; i < arrayOfUsername.length; i++) {
            if (arrayOfUsername[i].equals(userName)) {
                System.out.println("Trouver " + arrayOfUsername[i]);
                node = i;
            }
        }

        if (arrayOfUsername[node].equals(userName)) {

            if (arrayOfPassword[node].equals(passWord)) {
                System.out.println(arrayOfUsername[node]);
                System.out.println(arrayOfPassword[node]);
                System.out.println("You have successfully logged in!");
            } else {
                System.out.println("Incorrect username or password");
            }

        } else {
            System.out.println("Incorrect username");
        }

    }
}
