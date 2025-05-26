package accounts;

public class ReferenceTest {

    public static void main(String[] args) {
        Account firstAccount = new Account();
        firstAccount.deposit(300);

        System.out.println("the first account balace is " + firstAccount.getBalance());

        Account secondAccount = firstAccount;

        System.out.println("the second account balace is " + secondAccount.getBalance());

        secondAccount.balance += 100;

        System.out.println("the second account balace is " + secondAccount.getBalance());
        System.out.println("the first account balace is " + firstAccount.getBalance());

        if (firstAccount == secondAccount) {
            System.out.println("They are the same account"); // just to show that, it can have the same name, but its only one object

        } else {
            System.out.println("are not the same account");

        }

        System.out.println(firstAccount);
        System.out.println(secondAccount); //shows the same path for both variables

    }

}
// reference != variable 