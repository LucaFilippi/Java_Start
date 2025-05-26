package accounts;
public class CreateAccount {

    public static void main(String[] args) {
        Account firstAccount = new Account();
        firstAccount.balance = 200;
        System.out.println(firstAccount.balance);
    }
}
