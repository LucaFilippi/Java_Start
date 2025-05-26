package accounts;
// balance, branch, number, holder

import costumers.*;


public class Account {

    private double balance;
    int branch, number;
    public Costumer holder; 

    public void deposit(double value) {
        balance = balance + value;
        //this.balance = this.balance + value 
        //"this" serves to show that the variable is not local for the function, but the account.
    }
    public boolean withdrawal(double value) {

        if (balance >= value) {
            balance = balance - value;
            return true;
        } else {
            System.out.println("Insufficient funds, withdrawal rejected");
            return false;
        }
    }
    public boolean tranference(double value, Account destineAccount) {
        if (balance >= value) {
            balance -= value;
            destineAccount.deposit(value);
            return true;
        } else {
            System.out.println("no founds, the transaction is impossible");
            return false;
        }
    }

    public double getBalance (){


        return balance;
    }
}
