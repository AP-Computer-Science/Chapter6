import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class BankArray {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        Account[] accounts = new Account[30];
        //Create account
        int count = 0;
        while(count < accounts.length) {
            System.out.print("Open account " + (count + 1) + " [Y/N]? ");
            char input = s.next()
                          .trim()
                          .toUpperCase()
                          .charAt(0);
            if(input == 'Y') {
                System.out.print("Enter account holder name: ");
                s = new Scanner(System.in);
                String accountHolder = s.nextLine();
                Account a = new Account(accountHolder, (int)(Math.random() * 99999999), (int)(Math.random() * 1000000001));
                accounts[count] = a;
                count++;
            }
            else {
               break; 
            }
        }
        while(true) {
            s = new Scanner(System.in);
            System.out.println("Accounts");
            System.out.println("========");
            for(int i = 0; i < count; i++) {
                System.out.println(i + ": " + accounts[i].getName());
            }
            System.out.print("Enter account number to manage: ");
            int num = Math.abs(s.nextInt());
            if(num >= count) {
                System.out.println("No such account exist.");
            }
            else {
                Account instance = accounts[num];
                System.out.println("Account has " + java.text.DecimalFormat.getCurrencyInstance().format(instance.getBalance()));
                System.out.print("Transfer money [Y/N]? ");
                char input = s.next()
                          .trim()
                          .toUpperCase()
                          .charAt(0);
                if(input == 'Y') {
                    System.out.print("Enter number of account to transfer money to: ");
                    int transferAccount = Math.abs(s.nextInt());
                    if(transferAccount >= count) {
                        System.out.println("No such account exist.");
                        continue;
                    }
                    System.out.print("Enter amount to transfer: ");
                    int amount = Math.abs(s.nextInt());
                    instance.move(accounts[transferAccount], amount);
                }
            }
        }
    }
}