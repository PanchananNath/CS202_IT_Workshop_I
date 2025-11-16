import java.util.Scanner;

class Account {
    private int accountNumber;
    private String accountType;
    private String serviceBranchIFSC;
    private float minimumBalance;
    private float availableBalance;
    private int customerID;
    private String customerName;

    private static int totalAccountCount = 0;

    public Account() {
        totalAccountCount++;
    }

    public void setDetails(int accountNumber, String accountType, String IFSC, float minBalance,
                           float availableBalance, int customerID, String customerName) {
        this.accountNumber = accountNumber;
        this.accountType = accountType;
        this.serviceBranchIFSC = IFSC;
        this.minimumBalance = minBalance;
        this.availableBalance = availableBalance;
        this.customerID = customerID;
        this.customerName = customerName;
    }

    public void getDetails(int accountNo) {
        if (this.accountNumber == accountNo) {
            System.out.println("Account Number: " + accountNumber);
            System.out.println("Account Type: " + accountType);
            System.out.println("Branch IFSC: " + serviceBranchIFSC);
            System.out.println("Minimum Balance: " + minimumBalance);
            System.out.println("Available Balance: " + availableBalance);
            System.out.println("Customer ID: " + customerID);
            System.out.println("Customer Name: " + customerName);
        }
    }

    public float getDetailsBalance(int accountNo) {
        return (this.accountNumber == accountNo) ? availableBalance : -1;
    }

    public void deposit(int accountNo, float amount) {
        if (this.accountNumber == accountNo) {
            availableBalance += amount;
            System.out.println("Deposit successful. New balance: " + availableBalance);
        }
    }

    public void withdraw(int accountNo, float amount) {
        if (this.accountNumber == accountNo) {
            if (availableBalance - amount >= minimumBalance) {
                availableBalance -= amount;
                System.out.println("Withdrawal successful. New balance: " + availableBalance);
            } else {
                System.out.println("Insufficient balance. Minimum balance must be maintained.");
            }
        }
    }

    public static int getTotalAccountCount() {
        return totalAccountCount;
    }

    public void updateDetails(int accountNo) {
        if (this.accountNumber == accountNo) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Update Options:");
            System.out.println("1. Minimum Balance");
            System.out.println("2. Customer ID");
            System.out.println("3. Customer Name");
            System.out.print("Enter your choice: ");
            int choice = sc.nextInt();
            switch (choice) {
                case 1:
                    System.out.print("Enter new minimum balance: ");
                    minimumBalance = sc.nextFloat();
                    break;
                case 2:
                    System.out.print("Enter new customer ID: ");
                    customerID = sc.nextInt();
                    break;
                case 3:
                    System.out.print("Enter new customer name: ");
                    sc.nextLine(); // consume newline
                    customerName = sc.nextLine();
                    break;
                default:
                    System.out.println("Invalid choice.");
            }
        }
    }

    public static void compare(Account a1, Account a2) {
        System.out.println("Comparing balances...");
        if (a1.availableBalance > a2.availableBalance) {
            System.out.println("Account with higher balance:");
            a1.getDetails(a1.accountNumber);
        } else if (a2.availableBalance > a1.availableBalance) {
            System.out.println("Account with higher balance:");
            a2.getDetails(a2.accountNumber);
        } else {
            System.out.println("Both accounts have equal balance.");
        }
    }
}

public class BankingApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Account[] accounts = new Account[10];
        int accountIndex = 0;

        System.out.print("Enter number of accounts to create: ");
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            accounts[i] = new Account();
            System.out.println("Enter details for Account " + (i + 1));
            System.out.print("Account Number: ");
            int accNo = sc.nextInt();
            sc.nextLine(); // consume newline
            System.out.print("Account Type: ");
            String accType = sc.nextLine();
            System.out.print("Branch IFSC: ");
            String ifsc = sc.nextLine();
            System.out.print("Minimum Balance: ");
            float minBal = sc.nextFloat();
            System.out.print("Available Balance: ");
            float availBal = sc.nextFloat();
            System.out.print("Customer ID: ");
            int custID = sc.nextInt();
            sc.nextLine(); // consume newline
            System.out.print("Customer Name: ");
            String custName = sc.nextLine();

            accounts[i].setDetails(accNo, accType, ifsc, minBal, availBal, custID, custName);
        }

        int choice;
        do {
            System.out.println("\n--- Banking Menu ---");
            System.out.println("1. Update Details");
            System.out.println("2. Get Details");
            System.out.println("3. Deposit");
            System.out.println("4. Withdraw");
            System.out.println("5. Total Accounts");
            System.out.println("6. Compare Two Accounts");
            System.out.println("7. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter account number to update: ");
                    int accNo = sc.nextInt();
                    for (Account acc : accounts) {
                        if (acc != null) 
                        acc.updateDetails(accNo);
                    }
                    break;
                case 2:
                    System.out.print("Enter account number to view: ");
                    accNo = sc.nextInt();
                    for (Account acc : accounts) {
                        if (acc != null) acc.getDetails(accNo);
                    }
                    break;
                case 3:
                    System.out.print("Enter account number and deposit amount: ");
                    accNo = sc.nextInt();
                    float depAmt = sc.nextFloat();
                    for (Account acc : accounts) {
                        if (acc != null) acc.deposit(accNo, depAmt);
                    }
                    break;
                case 4:
                    System.out.print("Enter account number and withdrawal amount: ");
                    accNo = sc.nextInt();
                    float wdAmt = sc.nextFloat();
                    for (Account acc : accounts) {
                        if (acc != null) acc.withdraw(accNo, wdAmt);
                    }
                    break;
                case 5:
                    System.out.println("Total accounts created: " + Account.getTotalAccountCount());
                    break;
                case 6:
                    System.out.print("Enter two account indices to compare (0 to " + (n - 1) + "): ");
                    int i1 = sc.nextInt();
                    int i2 = sc.nextInt();
                    if (i1 >= 0 && i2 >= 0 && i1 < n && i2 < n) {
                        Account.compare(accounts[i1], accounts[i2]);
                    } else {
                        System.out.println("Invalid indices.");
                    }
                    break;
                case 7:
                    System.out.println("Exiting.....");
                    break;
                default:
                    System.out.println("Invalid choice. Try again.");
            }
        } while (choice != 7);
    }
}