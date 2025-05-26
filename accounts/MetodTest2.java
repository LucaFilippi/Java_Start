package accounts;

public class MetodTest2 {

    public static void main(String[] args) {
        Account lucasaccount = new Account();
        lucasaccount.balance = 100;
        lucasaccount.deposit(50);

        System.out.println(lucasaccount.balance);

        lucasaccount.withdrawal(20);
        System.out.println("after withdrawal you balance account is: " + lucasaccount.balance);

        lucasaccount.withdrawal(200); //rejected withdrawal test
        System.out.println("after withdrawal you balance account is: " + lucasaccount.balance);
    }
}
