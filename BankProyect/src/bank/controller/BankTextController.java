/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bank.controller;

import bank.model.BankTextReader;
import java.util.ArrayList;
import java.util.Collections;

/**
 *
 * @author edgar.cambranes
 */
public class BankTextController {
    BankTextReader  btr  = new BankTextReader();
    
    public String[][] getDataModel(){
        
        int i,j;
        String output[][] = null;
        ArrayList<ArrayList<String>> raw;
        raw = btr.bankReader("Bank.txt");
        Object[] temp1 = raw.toArray();
        System.out.println(temp1);
        ArrayList<String> temp2 = null;
        for(i=0;i<temp1.length;i++){
            temp2 = (ArrayList<String>)temp1[i];
            for(j=0;j<temp2.size();j++){
                output[i][j] = temp2.get(j);
            }
        }
        return output;
    }
    
}
