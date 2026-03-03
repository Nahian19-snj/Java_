/******************************************
 *  Author : Nahian Karim   
 *  Created On : Thu Feb 27 2025
 *  File : Account.java
 *******************************************/
import java.util.Date;

public class Account {
    private char type;
    private double balance;
    private double interestRate;
    private int accountID;
    private String ownerFirstName;
    private String ownerLastName;
    private Date lastUpdate;
    
    
    public Account(char type, double balance, double interestRate, int accountID, String ownerFirstName,
            String ownerLastName) {
        this.type = type;
        this.balance = balance;
        this.interestRate = interestRate;
        this.accountID = accountID;
        this.ownerFirstName = ownerFirstName;
        this.ownerLastName = ownerLastName;
        this.lastUpdate = new Date();
    }
    
    public char getType() {
        return type;
    }

    public void setType(char type) {
        this.type = type;
        
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public double getInterestRate() {
        return interestRate;
    }

    public void setInterestRate(double interestRate) {
        this.interestRate = interestRate;
    }

    public int getAccountID() {
        return accountID;
        
    }

    public void setAccountID(int accountID) {
        this.accountID = accountID;


    }

    public String getOwnerFirstName() {
        return ownerFirstName;
    }

    public void setOwnerFirstName(String ownerFirstName) {
        this.ownerFirstName = ownerFirstName;
    }

    public String getOwnerLastName() {
        return ownerLastName;
    }

    public void setOwnerLastName(String ownerLastName) {
        this.ownerLastName = ownerLastName;

    }
    
    public Date getLastUpdate(){
        return lastUpdate;
    }
    
    public void setLastUpdate(Date lastUpdate){
            this.lastUpdate =  lastUpdate;
    }

 public void updateInterest(){
    balance += balance * interestRate;
    lastUpdate = new Date();


 }
 public void makeDeposite(double amount){
    
    balance += amount;
    updateInterest();

 }
 public boolean makeWithdrawal(double amount){
    if (amount <= balance) {
        balance -= amount;
        updateInterest(); 
        return true;
    } else {
        return false; // If insufficient funds
    }
}

@Override
public String toString() {
    return "Account [type=" + type + ", balance=" + balance + ", interestRate=" + interestRate + ", accountID="
            + accountID + ", ownerFirstName=" + ownerFirstName + ", ownerLastName=" + ownerLastName + "]";
}


    
}