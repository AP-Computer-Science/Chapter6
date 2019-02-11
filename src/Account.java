public class Account {

    private final double RATE = 0.035; // interest rate of 3.5%
    private int acctNumber;
    private double balance;
    private String name;
    public Account(String owner, int account, double initial) {
        name = owner;
        acctNumber = account;
        balance = initial;
    }
    public Account(String owner, int account) {
        balance = 0;
        acctNumber = account;
        name = owner;
    }
    public String getName() {
        return name;
    }
    public double getBalance() {
        return balance;
    }
    public void deposit(double amount) {
        balance += amount;
    }
    public void withdraw(double amount) {
        balance -= amount;
    }
    public void move(Account destination, double amount) {
        if(amount > balance) {
            System.out.println("You cannot transfer more then you have in a overdraft protected account.");
            return;
        }
        if(amount < 0) {
            System.out.println("Good try, smarty.");
            return;
        }
        withdraw(amount);
        destination.deposit(amount);
    }
}