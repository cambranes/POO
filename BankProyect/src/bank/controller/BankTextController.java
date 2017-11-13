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
    
    //Recibe un hashTable y busca una key, si existe, regresa una tabla con
    //la informacion del resultado de la busqueda. Si no existe, regresa
    //un apuntador null
    public String[][] getHashTable(String key)
    {
        int i,j;
        BankTextReader bankBuilder = new BankTextReader();
        Hashtable<String,ArrayList<String>> input = bankBuilder.bankHashReader("Bank.txt");
        //Si existe el elemento
        String[][] finalOutput;
        if(input.containsKey(key)){
            String line;
            String accounts;
            String[] split;
            ArrayList<String> content = input.get(key);
            String[][] output = new String[content.size()][4];
            //Recibe la linea del .txt correspondiente
            for(i=0;i<content.size();i++){
                line = content.get(i);
            
                //y lo divide en los elementos necesarios para mostrarlo en una tabla
                split = line.split(",");
                //colocandolos en la matriz output
                for(j=0;j<3;j++){
                    output[i][j] = split[j];
                }
                //acomoda todos los IDAccount en un solo elemento de la matriz
                accounts = split[3];
                for(j=6;j<split.length;j++){
                    accounts = accounts + ", " + split[j];
                    j = j + 2;
                }
                output[i][3] = accounts;
            }
            finalOutput = output;
        }
        //Si el elemento no existe, se devuelve null
        else{
            finalOutput = null;
        }
        return finalOutput;
    }
}
