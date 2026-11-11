
public class Program {

    public static void main(String[] args) {
        Timer timer = new Timer();
        while (true) {
            timer.advance();
            System.out.println(timer);
        }
    }
}
