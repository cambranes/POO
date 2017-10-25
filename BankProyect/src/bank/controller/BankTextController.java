/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bank.controller;

import java.util.ArrayList;
import bank.model.BankTextReader;
import java.util.Hashtable;

/**
 *
 * @author chiki
 */
public class BankTextController {
    
    
    public String[][] getTable(String Filename){
        int i,j;
        BankTextReader bankBuilder = new BankTextReader();
        ArrayList<String> input;
        input = bankBuilder.bankReader(Filename);
        String[][] output = new String[input.size()][4];
        String array;
        String accounts;
        String[] split;
        for(i=0;i<input.size();i++){
            array = input.get(i);
            split = array.split(",");
            accounts = split[3];
            for(j=6;j<split.length;j++){
                accounts = accounts + ", " + split[j];
                j = j + 2;
            }
            output[i][3] = accounts;
            for(j=0;j<3;j++){
                output[i][j] = split[j];
            }
        }
        return output;
    }
    
    public String[] getHeader(){
        String[] header = {"ID","First Name","Last Name","Accounts"};
        return header;
    }
    
    public String[][] searchHash(String key)
    {
        int j,k;
        Hashtable<String,String> input = new Hashtable<>();
        BankTextReader bankBuilder = new BankTextReader();
        input = bankBuilder.bankHashReader("Bank.txt");
        String[][] output = new String[input.size()][4];
        if(input.containsKey(key)){
            
            String line;
            String accounts;
            String[] split;
            line = input.get(key);
            split = line.split(",");
            for(j=0;j<3;j++){
                output[0][j] = split[j];
            }
            accounts = split[3];
            for(j=6;j<split.length;j++){
                accounts = accounts + ", " + split[j];
                j = j + 2;
            }
            output[0][3] = accounts;
        }
        else{
            output[0][0] = "Key";
            output[0][1] = "Not";
            output[0][2] = "Found";
            output[0][3] = "";
        }
        for(j=1;j<input.size();j++)
        {
            for(k=0;k<4;k++){
                output[j][k] = "";
            }
        }
        return output;
    }
}
