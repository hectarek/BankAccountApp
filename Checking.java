public class Checking extends Account {

    // Properties for Checking
    private int debitCardNum, debitCardPin;

    // Constructor 
    public Checking(String name, String ssn, double initalDeposit) {
        super(name, ssn, initalDeposit);
        accountNum = "2" + accountNum;
        setDebitCard();
    }

    // Getters and Setters
    public int getDebitCardNum() {
        return debitCardNum;
    }
    private void setDebitCardNum() {
        this.debitCardNum = (int) (Math.random() * Math.pow(10, 12));
    }

    public int getDebitCardPin() {
        return debitCardPin;
    }
    private void setDebitCardPin() {
        this.debitCardPin = (int) (Math.random() * Math.pow(10, 4));
    }

    // Other Methods
    private void setDebitCard() {
        setDebitCardNum();
        setDebitCardPin();
    }

    public void showInfo(){
        super.showInfo();
        System.out.println("Your Checking Account Features");
        System.out.println("Debit Card: " + this.debitCardNum);
        System.out.println("Debit Card Pin: " + this.debitCardPin);
    }

    @Override
    public void setRate() {
        rate = getBaseRate() * .15;
    }

}