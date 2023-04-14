public class BankAccountTest {
    public static void main(String[] args) {
        BankAccount joesAccount = new BankAccount(20.00,50.00);
        System.out.println(joesAccount.checkCheckingBalance());
        joesAccount.checkSavingBalance();
        joesAccount.depositMoney(15,"checking");
        joesAccount.withdrawalFromChecking(20);
        joesAccount.combinedAccountBalance();
        System.out.println(BankAccount.numbersOfaccounts);
    }
}
