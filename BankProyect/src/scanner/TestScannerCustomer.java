package scanner;

import java.io.File;
import java.util.Scanner;


public class TestScannerCustomer{
    public static void main (String args){
        
    try{
        Scanner sc = new Scanner(new File("Customer.txt"));
        
        while(sc.hasNext()){
            String output = sc.next();
            System.out.println(output);
                    }
    }
    
    
    
    catch(Exception exc){
    System.err.print(exc);
}
    }
}