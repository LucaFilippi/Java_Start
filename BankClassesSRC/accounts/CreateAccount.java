package accounts;

public class CreateAccount {

    public static void main(String[] args) {
        Account firstAccount = new Account();
        firstAccount.deposit(200);
        System.out.println(" the first account balance is " + firstAccount.getBalance() + " dollars");

        firstAccount.deposit(100);
        System.out.println(" the first account balance is " + firstAccount.getBalance() + " dollars");

        Account secondAccount = new Account();
        secondAccount.deposit(50);

        System.out.println(" the first account balance is " + firstAccount.getBalance() + " dollars");
        System.out.println(" the first account balance is " + secondAccount.getBalance() + " dollars");

    }
}
