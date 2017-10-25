package bank.model;

import java.io.FileReader;
import java.util.ArrayList;
import java.util.Scanner;

public class BankTextReader {

   private ArrayList<String> bankCustomer = null;
   
   
   public ArrayList<String> bankReader(String fileName){
           try
          {
           Scanner sc = new Scanner(new FileReader(fileName));
           ArrayList<String> list = new ArrayList<>();
           while (sc.hasNext()){
               list.add(sc.next());
           }
           sc.close();
           bankCustomer = list;
          }
           catch(Exception exc)
           {
           System.err.print(exc);
           }
              return bankCustomer;
       }
   
}
