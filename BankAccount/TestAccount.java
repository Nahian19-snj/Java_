/******************************************
 *  Author : Nahian Karim   
 *  Created On : Thu Feb 27 2025
 *  File : TestAccount.java
 *******************************************/

import java.util.Random;

public class TestAccount {



public static void main(String[] args) {
    
Account[] accounts = new Account[3]; 
accounts[0]= new Account( 'c', 100.0, 0.0, 1000, "Fred", "Flint"); 
accounts[1]= new Account('s', 500.0, 0.5, 1001, "Fred", "Flint");
accounts[2]= new Account('l', 5000.0, 8.25, 1002, "Fred", "Flint");

for (int i =0; i<=90; i++){

    if (i%30==1){
      accounts[1].updateInterest();
      System.out.println("Updated Savings Account Interest for Day " + i + ": ");
       System.out.println(accounts[1]);
       }

    }
Random rand = new Random();
int accountIndex = rand.nextInt(3); // Select a random account (0: checking, 1: savings, 2: loan)
  Account selectedAccount = accounts[accountIndex];

  boolean isDeposit = rand.nextBoolean(); // true for deposit, false for withdrawal
 double amount = 0.99 + (99.99 - 0.99) * rand.nextDouble(); // Amount between $0.99 and $99.99

 if (isDeposit) {
    selectedAccount.makeDeposite(amount);
    System.out.println("Day "  + ": Deposited $" + String.format("%.2f", amount) + " to " + selectedAccount.getType() + " account.");
} else {
    if (selectedAccount.makeWithdrawal(amount)) {
        System.out.println("Day "  + ": Withdrew $" + String.format("%.2f", amount) + " from " + selectedAccount.getType() + " account.");
    } else {
        System.out.println("Day "  + ": Failed to withdraw $" + String.format("%.2f", amount) + " from " + selectedAccount.getType() + " account due to insufficient funds.");
    }
}
 int day = 0;
 double loanPayment = 101.98;
 // Pay loan from checking account each day
 if (selectedAccount == accounts[0] && day % 30 != 0) {
    if (!accounts[0].makeWithdrawal(loanPayment)) {
        System.out.println("Failed to pay loan installment on Day " + day);
    } else {
        System.out.println("Paid loan installment of $" + String.format("%.2f", loanPayment) + " from checking account.");
    }
}

// Print account details at the end of each day
System.out.println("Checking Account: ");
System.out.println(accounts[0]);
System.out.println("Savings Account: ");
System.out.println(accounts[1]);
System.out.println("Loan Account: ");
System.out.println(accounts[2]);

}

}