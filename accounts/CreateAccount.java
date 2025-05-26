package accounts;

public class CreateAccount {

    public static void main(String[] args) {
        Account firstAccount = new Account();
        firstAccount.balance = 200;
        System.out.println(" the first account balance is " + firstAccount.balance + " dollars");

        firstAccount.balance += 100;
        System.out.println(" the first account balance is " + firstAccount.balance + " dollars");

        Account secondAccount = new Account();
        secondAccount.balance = 50;

        System.out.println(" the first account balance is " + firstAccount.balance + " dollars");
        System.out.println(" the first account balance is " + secondAccount.balance + " dollars");

    }
}
