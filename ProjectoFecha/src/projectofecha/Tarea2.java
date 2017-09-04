 * @AUTHORS: POO FMAT 
 */
public class Account{                           
    private double balance; 
    
    public Account (double balance) {               
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
}

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
        this.firstName = first;
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

}                               

public class Bank{                          
    private Customer[] clients;
    private int numberOfCustomers;
    
    public Bank(int capacityOfCustomers){
        clients = new Costumer[capacityOfCustomers];
    }
    
    
}


public class Tarea2 {
    
}
