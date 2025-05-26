package accounts;
// balance, branch, number, holder

public class Account {

    double balance;
    int branch, number;
    String holder;

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
}
