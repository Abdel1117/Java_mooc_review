import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        // implement here the program that allows the user to enter
        // book information and to examine them
        Scanner scanner = new Scanner(System.in);
        ArrayList<Book> Booklist = new ArrayList();
        while (true) {
            System.out.print("Title: ");
            String titleBook = String.valueOf(scanner.nextLine());

            if (titleBook.isEmpty()) {
                break;
            }
            System.out.print("Pages: ");
            int pageBook = Integer.valueOf(scanner.nextLine());
            System.out.print("Publication year: ");
            int yearBook = Integer.valueOf(scanner.nextLine());
            Book bookObject = new Book(titleBook, pageBook, yearBook);
            Booklist.add(bookObject);
        }

        System.out.println("What information will be printed?");
        String informationToDisplay = scanner.nextLine();

        if (informationToDisplay.equals("everything")) {
            for (Book book : Booklist) {
                System.out.println(book);
            }
        } else if (informationToDisplay.equals("name")) {
            for (Book book : Booklist) {
                System.out.println(book.title);
            }
        } else if (informationToDisplay.equals("pages")) {
            for (Book book : Booklist) {
                System.out.println(book.pages);
            }
        }
    }
}
