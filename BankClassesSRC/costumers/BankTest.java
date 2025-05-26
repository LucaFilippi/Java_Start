package costumers;

import accounts.Account;

public class BankTest {

    public static void main(String[] args) {
        Costumer luca = new Costumer();

        luca.name = "Luca Filippi";
        luca.CPF = "110.001.101.10";
        luca.job = "Developer";

        Account LucaAccount = new Account();
        LucaAccount.deposit(200);
        LucaAccount.holder = luca;

        System.out.println(LucaAccount.holder.name);
        System.out.println(LucaAccount.getBalance());

    }

}
