package Uge5.encapsulation.constructors.BankAccount;

public class BankAccount {
   private String owner;
   private double balance;
   private double withdrawnMoney;

   private double depositedMoney;

    public BankAccount (String owner, double startingBalance){
        this.owner = owner;
        this.balance = startingBalance;
    }

    public String getOwner(){
        return owner;
    }

    public double getBalance(){
        return balance -= withdrawnMoney;
    }

    public double deposit(double amount){
        if (amount > 0){
            this.balance = this.balance+amount;
            return amount;
        }
        return 0;
    }

    public double withdraw(double amount) {
        if (amount <= this.balance) {
            this.balance = this.balance - amount;
            return amount;
        }
        return 0;
    }

    public double getWithdrawnMoney(){
        return withdrawnMoney;
    }

    public double getDepositedMoney(){
        return depositedMoney;
    }
}
