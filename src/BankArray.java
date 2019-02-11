import java.util.Scanner;

public class BankArray {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        Account[] accounts = new Account[30];
        //Create account
        int count = 0;
        while(count < accounts.length) {
            System.out.print("Open account [Y/N]? ");
            char input = s.next()
                          .trim()
                          .toUpperCase()
                          .charAt(0);
            if(input == 'Y') {
                System.out.print("Enter account holder name: ");
                String accountHolder = s.nextLine();
                Account a = new Account(accountHolder, (int)(Math.random() * 99999999));
                count++;
            }
        }
    }
}
