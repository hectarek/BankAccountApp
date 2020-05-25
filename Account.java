public abstract class Account implements InterestRate{
    
    //List common Properties for accounts
    private String name, ssn;
    private double balance;

    protected String accountNum;
    protected double rate;

    private static int index = 10000;

    //Constructor
    public Account(String name, String ssn, double initalDeposit) {
        this.name = name;
        this.ssn = ssn;
        this.balance = initalDeposit;
        index++;
        this.accountNum = setAccountNum();
        setRate();
    }

    //Getters and Setters

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public String getSsn() {
        return ssn;
    }
    public void setSsn(String ssn) {
        this.ssn = ssn;
    }

    public String getAccountNum() {
        return accountNum;
    }
    

    public double getBalance() {
        System.out.println("Your Balance is: " + this.balance);
        return balance;
    }
    public void setBalance(double balance) {
        this.balance = balance;
    }

    public double getRate() {
        return rate;
    }
    public abstract void setRate();


    //Other Methods
    private String setAccountNum() {
        String lastTwoSSN = ssn.substring(ssn.length()-2, ssn.length());
        int uniqueId = index;
        int randomNum = (int) (Math.random() * Math.pow(10, 3));

        String account = lastTwoSSN + uniqueId + randomNum;
        this.accountNum = account;
        return accountNum;
    }

    public void compound() {
        double accruedInterest = balance * (rate/100);
        balance += accruedInterest;
        System.out.println("Accrued Interest: $" + accruedInterest);
        getBalance();
    }

    public void showInfo() {
        System.out.println(
            "Name: " + name + 
            "\nAccount Number: " + accountNum + 
            "\nBalance: " + balance +
            "\nRate: " + rate + "%"
        );
    }

    public void deposit(double amount) {
        balance = balance + amount;
    }

    public void withdraw(double amount) {
        balance = balance - amount;

    }

    public void transfer(String toWhere, double amount) {

        balance = balance - amount;
        System.out.println("Transfering $" + amount + " to " + toWhere);
    }

    
}