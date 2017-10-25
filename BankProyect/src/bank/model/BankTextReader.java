package bank.model;

import java.io.FileReader;
import java.util.ArrayList;
import java.util.Hashtable;
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
   public Hashtable<String, String> bankHashReader(String filename){
       int i;
       ArrayList<String> array = new ArrayList<>();
       Hashtable<String, String> table = new Hashtable<>();
       array = bankReader(filename);
       String[] split;
       String line;
       String key;
       for(i=0;i<array.size();i++){
           line = array.get(i);
           split = line.split(",", 4);
           key = split[1] + split[2];
           table.put(key, line);
       }
       return table;
   }
}
