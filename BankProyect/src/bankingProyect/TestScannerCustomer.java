package bankingProyect;


import java.io.File;
import java.nio.file.Paths;
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author edgar.cambranes
 */
public class TestScannerCustomer {
    
public static void main(String args[]){    
    
    try{
        
    Scanner sc = new Scanner(new File("Customer.txt"));
      while (sc.hasNext()) {
          String output = sc.next();
          System.out.println(output);
          String vector[] = output.split(",");
          
          for(int i = 0;i < vector.length; i++){
            System.out.println(vector[i]);
          }
          System.out.println();
      }
    
    }
    catch(Exception exc){
        System.err.print(exc);
    }
}

}
