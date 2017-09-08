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
    private static int IDkey;
    private int IDaccount;
    private double balance; 
    
    public Account (double balance) {               
        this.IDaccount =IDkey;
        IDkey++;
        this.balance = balance;
    }
    
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
    
    public String toString(){
        return "ID Account: " +IDaccount +
               " ,Balance: " + balance;
    }
}
