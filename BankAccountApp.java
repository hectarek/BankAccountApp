import java.util.LinkedList;
import java.util.List;

public class BankAccountApp {
    
    public static void main(String[] args) {
        
        List<Account> accounts = new LinkedList<Account>();

        String file = "./NewBankAccounts.csv";
        List<String[]> newAccountHolders = Utilites.read(file);

        for (String[] accountHolder : newAccountHolders) {
            String name = accountHolder[0];
            String ssn = accountHolder[1];
            String accountType = accountHolder[2];
            double initDeposit = Double.parseDouble(accountHolder[3]);
           
            if (accountType.equals("Savings")) {
                accounts.add(new Savings(name, ssn, initDeposit));
            } else if (accountType.equals("Checking")) {
                accounts.add(new Checking(name, ssn, initDeposit));
            } else {
                System.out.println("Error Reading Account type.");
            }
        }

        for (Account acc : accounts) {
            System.out.println("*******************");
            acc.showInfo();
        }
    }
}