
package projectofecha;


public class TestBank {
    
   public static void main(String[] args) {
       Bank narcobanco = new Bank(100);
       
       Customer client1 = new Customer("Chapo","Guzman", new Account (100000));
       Customer client2 = new Customer("Pablo","Escobar", new Account (12345));
       Customer client3 = new Customer("Amado","Carrillo", new Account (11111));
       Customer client4 = new Customer("Carlos","Salinas", new Account (22222));
       Customer client5 = new Customer("Rosario","Robles", new Account (76543));
       
       narcobanco.addCustomer(client1);
       narcobanco.addCustomer(client2);
       narcobanco.addCustomer(client3);
       narcobanco.addCustomer(client4);
       narcobanco.addCustomer(client5);
       
       System.out.println(narcobanco);
       
       narcobanco.removeCustomer(2);
       System.out.println(narcobanco);

   
   }
    
}
