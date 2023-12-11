public class BankAccount {
    String name;
    int accountNumber;
    double balance;

    BankAccount(String name, int accountNumber, int balance) {
        this.name = name;
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public double depositAmount(double amount) {
        balance += amount;
        return balance;
    }

    public double withdrawAmount(double amount) {
        balance -= amount;
        return balance;
    }

    public void checkBalance() {
        System.out.println("Account balance for " + name + " amount is " + balance);
    }

    public static void main(String[] args) {
        BankAccount ba = new BankAccount("Shakti", 1234, 4000);
        ba.checkBalance();
        ba.depositAmount(5000);
        ba.checkBalance();
        ba.withdrawAmount(1000);
        ba.checkBalance();

    }
}
