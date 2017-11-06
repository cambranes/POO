/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bank.model;

/**
 *
 * @author edgar.cambranes
 */
public class Bank{
    private Customer[] clients;
    private int numberOfCustomers;
    
    public Bank(int maxClients){
        clients = new Customer[maxClients];
        numberOfCustomers = 0;
    }
    
    public boolean addCustomer(Customer client){
        boolean flag = false;
        if(numberOfCustomers < clients.length ){
            clients[numberOfCustomers] = client;
            numberOfCustomers++;
            flag = true;
        }
        return flag;
    }
    
    public boolean removeCustomer(int IDcustomer){
        boolean flag = false;
            for(int i = 0; i < numberOfCustomers; i++){
                if(clients[i].getIDCustomer() == IDcustomer){
                    clients[i] = clients[numberOfCustomers-1];
                    clients[numberOfCustomers-1] = null;
                    numberOfCustomers--;
                    flag = true;
                }
            }
        
        return flag;
    }
    
    public Customer searchClient(int IDClient){
        Customer temp = null;
        for(Customer client: clients){
            if(client.getIDCustomer() == IDClient){
                temp = client;
            }
        }
        return temp;
    }
    
    public String toString(){
      String output= "";
      for(int i = 0; i < numberOfCustomers; i++){
          output += clients[i].toString() +"\n";
      }
      return output;
    }
    
    
    
}
