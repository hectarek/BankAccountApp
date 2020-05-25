public class Savings extends Account {
    
     // Properties for Checking
    private int saftyDepositBoxId;
    private int saftyDepositBoxKey;

    // Constructor 
    public Savings(String name, String ssn, double initalDeposit) {
        super(name, ssn, initalDeposit);
        accountNum = "1" + accountNum;
        setSaftyDepositBox();
    }

    // Getters and Setters
    public int getSaftyDepositBoxId() {
        return saftyDepositBoxId;
    }
    private void setSaftyDepositBoxId() {
        this.saftyDepositBoxId = (int) (Math.random() * Math.pow(10, 3));
        System.out.println(saftyDepositBoxId);
    }

    public int getSaftyDepositBoxKey() {
        return saftyDepositBoxKey;
    }
    private void setSaftyDepositBoxKey() {
        this.saftyDepositBoxKey =  (int) (Math.random() * Math.pow(10, 4));
        System.out.println(saftyDepositBoxKey);
    }

    // Other Methods
    public void showInfo(){
        System.out.println("Account Type: Saving");
        super.showInfo();
        System.out.println(
            "Your Savings Account Fatures" + 
            "\nSafety Deposit Box ID: " + saftyDepositBoxId +
            "\nSafety Deposit Box Key: " + saftyDepositBoxKey
        );
    }

    private void setSaftyDepositBox() {
        setSaftyDepositBoxId();
        setSaftyDepositBoxKey();
    }

    @Override
    public void setRate() {
        rate = getBaseRate() - .25;

    }
    
}