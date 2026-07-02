package Day07;

class BankAccount {

    String accountHolder;
    double balance;

    BankAccount(String name, double balance) {
        accountHolder = name;
        this.balance = balance;
    }

    void deposit(double amount) {
        balance += amount;
        System.out.println("Deposited: " + amount);
    }

    void withdraw(double amount) {

        if (amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawn: " + amount);
        } else {
            System.out.println("Insufficient Balance");
        }
    }

    void display() {
        System.out.println("Account Holder: " + accountHolder);
        System.out.println("Balance: " + balance);
    }

    public static void main(String[] args) {

        BankAccount account = new BankAccount("Ruba", 5000);

        account.deposit(1000);
        account.withdraw(2000);
        account.display();
    }
}
