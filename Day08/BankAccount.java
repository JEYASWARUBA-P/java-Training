package Day08;

class BankAccount {

    String name;
    double balance;

    BankAccount() {

        this("Unknown", 0);
    }

    BankAccount(String name, double balance) {

        this.name = name;
        this.balance = balance;
    }

    void display() {

        System.out.println(name + " : ₹" + balance);
    }

    public static void main(String[] args) {

        BankAccount b1 = new BankAccount();
        BankAccount b2 = new BankAccount("Ruba", 5000);

        b1.display();
        b2.display();
    }
}
