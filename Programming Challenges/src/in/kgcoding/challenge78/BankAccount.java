package in.kgcoding.challenge78;

class BankAccount {
    private long accountNumber;
    private String accountHolderName;
    private double balance;

    public BankAccount(long accountNumber, String accountHolderName, double balance){
        this.accountNumber = accountNumber;
        this.accountHolderName = accountHolderName;
        this.balance = balance;
    }

    void deposit(double depositAmount){
        this.balance += depositAmount;
        System.out.println(depositAmount + " has been deposited to your account");
    }

    void withdraw(double withdrawAmount){
        if(withdrawAmount <= 0) {
            System.out.println("Invalid Withdraw");
        }else if(this.balance < withdrawAmount){
            System.out.println("You have insufficient balance");
        }else{
            this.balance -= withdrawAmount;
            System.out.println(withdrawAmount + " has been withdrawn from your account");
        }
    }


    public static void main(String[] args){
        BankAccount bankAcc = new BankAccount(1542658745,"Nikesh",15000);

        bankAcc.deposit(10222);
        bankAcc.withdraw(12000);
        bankAcc.withdraw(-40);
        bankAcc.deposit(500);


        System.out.println(bankAcc.balance);
        bankAcc.withdraw(22000);

    }
}
