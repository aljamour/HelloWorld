package Uge5.encapsulation.constructors.BankAccount;

public class Main {
    public static void main(String[] args) {

        BankAccount bankAccount = new BankAccount("Alan Al-Jamour", 1500);

        bankAccount.withdraw(300);
        bankAccount.deposit(1000);
        bankAccount.withdraw(750);

        System.out.println(bankAccount.getOwner());
        System.out.println(bankAccount.getBalance());

        String name = "Alan";
        name.length();
    }
}