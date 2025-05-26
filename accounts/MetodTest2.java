package accounts;

public class MetodTest2 {

    public static void main(String[] args) {
        Account lucasAccount = new Account();
        lucasAccount.balance = 100;
        lucasAccount.deposit(50);

        System.out.println(lucasAccount.balance);

        lucasAccount.withdrawal(20);
        System.out.println("after withdrawal you balance account is: " + lucasAccount.balance);

        lucasAccount.withdrawal(200); //rejected withdrawal test
        System.out.println("after withdrawal you balance account is: " + lucasAccount.balance);

        Account matteosAccount = new Account();
        matteosAccount.deposit(50);

        matteosAccount.tranference(50, lucasAccount); // Matteo send 10 bucks to Luca

        System.out.println("Matteo balance after transference is " + matteosAccount.balance); // actual matteo's balance 
        System.out.println(lucasAccount.balance); // actual luca's balance

    }
}
