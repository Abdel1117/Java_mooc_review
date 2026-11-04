
public class YourFirstBankTransfer {

    public static void main(String[] args) {
        // Do not touch the code in Account.java
        // write your program here

        Account Matthews = new Account("Matthews account", 1000);
        Account abdelAcount = new Account("My account", 0);

        Matthews.withdrawal(100.0);
        abdelAcount.deposit(100.0);

        System.out.println(Matthews);
        System.out.println(abdelAcount);

    }
}
