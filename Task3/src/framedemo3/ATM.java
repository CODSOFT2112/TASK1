package framedemo3;


	import java.util.Scanner;

	class BankAccount {
	    private double balance;

	    public BankAccount(double balance) {
	        this.balance = balance;
	    }

	    public double getBalance() {
	        return balance;
	    }

	    public void setBalance(double balance) {
	        this.balance = balance;
	    }

	    public boolean withdraw(double amount) {
	        if (amount > balance) {
	            return false;
	        }
	        balance -= amount;
	        return true;
	    }

	    public void deposit(double amount) {
	        balance += amount;
	    }
	}

	public class ATM {
	    private BankAccount account;
	    private Scanner scanner;

	    public ATM(BankAccount account) {
	        this.account = account;
	        this.scanner = new Scanner(System.in);
	    }

	    public void userInterface() {
	        while (true) {
	            System.out.println("1. Withdraw");
	            System.out.println("2. Deposit");
	            System.out.println("3. Check Balance");
	            System.out.println("4. Exit");
	            System.out.print("Choose an option: ");
	            int choice = scanner.nextInt();

	            switch (choice) {
	                case 1:
	                    System.out.print("Enter amount to withdraw: ");
	                    double withdrawAmount = scanner.nextDouble();
	                    if (withdrawAmount > account.getBalance()) {
	                        System.out.println("Insufficient balance");
	                    } else if (account.withdraw(withdrawAmount)) {
	                        System.out.println("Withdrawal successful. New balance: " + account.getBalance());
	                    } else {
	                        System.out.println("Withdrawal failed");
	                    }
	                    break;
	                case 2:
	                    System.out.print("Enter amount to deposit: ");
	                    double depositAmount = scanner.nextDouble();
	                    account.deposit(depositAmount);
	                    System.out.println("Deposit successful. New balance: " + account.getBalance());
	                    break;
	                case 3:
	                    System.out.println("Your current balance: " + account.getBalance());
	                    break;
	                case 4:
	                    System.out.println("Exiting...");
	                    return;
	                default:
	                    System.out.println("Invalid choice. Please choose a valid option.");
	            }
	        }
	    }

	    public static void main(String[] args) {
	        BankAccount account = new BankAccount(1000);
	        ATM atm = new ATM(account);
	        atm.userInterface();
	    }
	}

