package accounts;

public class MetodTest {

    public static void main(String[] args) {
        Account lucasaccount = new Account();
        lucasaccount.balance = 100;
        lucasaccount.deposit(50);

        System.out.println(lucasaccount.balance);

    }
}
