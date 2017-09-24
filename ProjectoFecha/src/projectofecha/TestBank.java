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
public class TestBank {
    
   public static void main(String[] args) {
       Bank narcobanco = new Bank(100);
       
       Customer client1 = new Customer("Chapo","Guzman", 10);
       Customer client2 = new Customer("Pablo","Escobar", 10);
       Customer client3 = new Customer("Amado","Carrillo", 10);
       Customer client4 = new Customer("Carlos","Salinas", 10);
       Customer client5 = new Customer("Rosario","Robles", 10);
       
       narcobanco.addCustomer(client1);
       narcobanco.addCustomer(client2);
       narcobanco.addCustomer(client3);
       narcobanco.addCustomer(client4);
       narcobanco.addCustomer(client5);
       
       client1.addAccount(new Account(Account.DEBIT, 1200));
       client1.addAccount(new Account(Account.CREDIT, 34000));
       
       client2.addAccount(new Account(Account.DEBIT, 14500));
       client2.addAccount(new Account(Account.DEBIT, 1200));
       client2.addAccount(new Account(Account.CREDIT, 120000));
       
       client3.addAccount(new Account(Account.DEBIT, 99900));
       
       client4.addAccount(new Account(Account.DEBIT, 6600));
       
       client5.addAccount(new Account(Account.DEBIT, 12345));
       
       
       
       System.out.println(narcobanco);
       
       
     

   
   }
    
}
