
 
package projectofecha;


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
                if(clients[i].getIDaccount() == IDcustomer){
                    clients[i] = clients[numberOfCustomers-1];
                    clients[numberOfCustomers-1] = null;
                    numberOfCustomers--;
                    flag = true;
                }
            }
        
        return flag;
    }
    
    public String toString(){
      String output= "";
      for(int i = 0; i < numberOfCustomers; i++){
          output += clients[i].toString() +"\n";
      }
      return output;
    }
    
    
    
}
