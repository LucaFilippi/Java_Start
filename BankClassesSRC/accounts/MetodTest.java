package accounts;

public class MetodTest {

    public static void main(String[] args) {
        Account lucasaccount = new Account();
        lucasaccount.deposit(150);

        System.out.println(lucasaccount.getBalance());

    }
}
