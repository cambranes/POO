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
    
    public boolean removeCustomer(Customer client){
        boolean flag = false;
        for(int i = 0; i<numberOfCustomers; i++){
            clients[i]=clients[numberOfCustomers-1];
            clients[numberOfCustomers-1] = null;
            flag = true;
        }
        
        return flag;
    }
}
