package accounts;

public class NegativeWithdrawalTest {

    public static void main(String[] args) {
        Account account = new Account();
        account.deposit(100);
        account.withdrawal(200);
        
        System.out.println(account.getBalance());


        //forbiden 
        // lines corrected, it wont work anymore
        //account.balance -= 200;
        //System.out.println(account.balance);

    }
}
