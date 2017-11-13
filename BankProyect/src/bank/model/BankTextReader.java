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
   //Funcion que recibe el nombre de un archivo, lo pasa a bankReader para
   //convertir el ArrayList a un HashTable
   public Hashtable<String, ArrayList<String>> bankHashReader(String filename){
       int i;
       //Recibe el ArrayList usando bankReader
       ArrayList<String> array = bankReader(filename);
       Hashtable<String, ArrayList<String>> table = new Hashtable<>();
       String[] split;
       String line;
       String key;
       //Coloca el contenido del ArrayList
       for(i=0;i<array.size();i++){
           line = array.get(i);
           split = line.split(",", 4);
           //Key es el FirstName + LastName
           key = split[1] + split[2];
           ArrayList<String> content = new ArrayList<>();
           if(table.containsKey(key)){
               content.clear();
               content = table.get(key);
               content.add(line);
               table.replace(key, content);
           }
           else{
               content.clear();
               content.add(line);
               table.put(key, content);
           }    
       }
       System.out.println(table.toString());
       return table;
   }
}
