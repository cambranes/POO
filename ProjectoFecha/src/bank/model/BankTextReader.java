/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bank.model;

import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
/**
 *
 * @author edgar.cambranes
 */
public class BankTextReader {
 private ArrayList<ArrayList<String>> bank = null;
    
 public ArrayList<ArrayList<String>> bankReader (String file){
            try
           {
            Scanner sc = new Scanner(new File(file));
            bank = new ArrayList<>();
            ArrayList<String> row = new ArrayList<String>();
            String tempStr;
            String[] tempArr;

            while (sc.hasNextLine())
                {
                    row = new ArrayList<>();
                    tempStr = sc.nextLine();
                    tempArr = tempStr.split(",");
                    Collections.addAll(row, tempArr);
                    bank.add(row);
                }
           }

            catch(Exception exc)
            {
            System.err.print(exc);
            }
        return bank;
        }   
}
