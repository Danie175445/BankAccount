public class BankAccount {
    private double checkingBalance;
    private double savingBalanace;
    public static int numbersOfaccounts = 0;
    public static double totalMoneyStored = 0;

    public BankAccount(double checkingBalance,double savingBalanace){
        this.checkingBalance = checkingBalance;
        this.savingBalanace = savingBalanace;
        numbersOfaccounts++;
        totalMoneyStored = totalMoneyStored + savingBalanace + checkingBalance;
    }

    public double checkCheckingBalance() {
        return checkingBalance ;

    }
    public void checkSavingBalance(){
        System.out.println(savingBalanace);
    }
    public void depositMoney(double deposit,String account){
        if(account == "cheking"){
            this.checkingBalance += deposit;
            System.out.println("Deposited now your account balance is now:" + checkingBalance);
        }
        else{
            savingBalanace = savingBalanace + deposit;
        }
        totalMoneyStored += deposit;
    }
    public void withdrawalFromChecking(double withdrawalAmaount){
        if(checkingBalance>withdrawalAmaount){
            checkingBalance = checkingBalance - withdrawalAmaount;
            totalMoneyStored = totalMoneyStored - withdrawalAmaount;
            System.out.println("Withdrawaled now Checking balance now:" + checkingBalance);
        }
        else{
            System.out.println("Insufficient amount");
        }
    }
    public void combinedAccountBalance(){
        System.out.println("Total in your acounts:" + totalMoneyStored);
    }
    
}