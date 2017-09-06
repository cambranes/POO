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
public class Customer{
    private String firstName;
    private String lastName;
    private Account account;
    //cons
    
    public Customer (String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }
    
    public Customer (String firstName, String lastName, Account account) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.account = account;
    }
    
    public void setFirstName(String firstName){
        this.firstName = firstName;
    }
    
    public String getFirstName(){
        return this.firstName;
    }
    
    public void setLastName(String lastName){
        this.lastName = lastName;
    }
    
    public String getLastName(){
        return this.lastName;
    }
    public void setAccount(Account account){
        this.account = account;
    }
    public Account getAccount(){                
        return this.account;
    }
    
    public boolean equals(Object obj){
        boolean flag = false;
        
        
        
        return flag;
    }
}                               

