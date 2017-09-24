/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projectofecha;

/**
 *
 * @author edgar.cambranes
 */
/**
 * @AUTHORS: POO FMAT 
 */
public class Account{                           
    public static final String  CREDIT= "CREDIT";
    public static final String DEBIT = "DEBIT";
    
    private static int IDkey;
    private int IDaccount;
    private double balance; 
    private String typeAccount;
    
    public Account (String typeAccount, double balance) {               
        this.IDaccount =IDkey;
        IDkey++;
        this.typeAccount = typeAccount;
        this.balance = balance;
    }
    
    /*public Account (double balance) {               
        this.IDaccount =IDkey;
        IDkey++;
        this.balance = balance;
    }
    */
    public double withdraw(double ammount){
        if(balance>=ammount){
            balance = balance - ammount;
        }
        return balance;
    }
    
    public double deposit(double ammount){
        
        return balance;
    }
    
    public void setBalance (double balance){
        this.balance = balance;
    }
    
    public double getBalance (){
        return balance;
    }
    
    public int getIDAccount(){
        return this.IDaccount;
    }
    
    public String toString(){
        return "ID Account: " +IDaccount +
               ", Type: " + typeAccount+
               " ,Balance: " + balance;
    }
}
