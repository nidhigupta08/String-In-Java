package program;
class BankAccount {
    private double balance;

    public BankAccount(double initialBalance) {
        this.balance = initialBalance;
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println(amount + " deposited. New balance: " + balance);
        } else {
            System.out.println("Invalid amount for deposit.");
        }
    }
    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println(amount + " withdrawn. New balance: " + balance);
        } else {
            System.out.println("Invalid amount for withdrawal or insufficient balance.");
        }
    }

    public double getBalance() {
        return balance;
    }
}
public class Encapsulation1 {
	  public static void main(String[] args) {
	        BankAccount account = new BankAccount(1000);

	        account.deposit(500);
	        account.withdraw(200);
	        account.withdraw(1500);
	        account.deposit(-100); // Trying to deposit a negative amount

	        System.out.println("Current Balance: " + account.getBalance());
	    }
}
