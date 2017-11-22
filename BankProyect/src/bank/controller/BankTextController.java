package bank.controller;

import java.util.ArrayList;
import bank.model.BankTextReader;
import java.util.Hashtable;

/**
 *
 * @author chiki
 */
public class BankTextController {
    
    //metodo para generar el hashtable
    public String[][] getTable(String Filename){
        
        int i;
        int j;
        
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
    /*public String[][] getHashTable(String key){
        
        int j;
        BankTextReader bankBuilder = new BankTextReader();
        Hashtable<String,String> input;
        input = bankBuilder.bankHashReader("Bank.txt");
        String[][] output = new String[0][4];
        
        //Si existe el elemento
        if(input.containsKey(key)){
            String line;
            String accounts;
            String[] split;
            //Recibe la linea del .txt correspondiente
            line = input.get(key);
            //y lo divide en los elementos necesarios para mostrarlo en una tabla
            split = line.split(",");
            //colocandolos en la matriz output
            for(j=0;j<3;j++){
                output[0][j] = split[j];
            }
            //acomoda todos los IDAccount en un solo elemento de la matriz
            accounts = split[3];
            for(j=6;j<split.length;j++){
                accounts = accounts + ", " + split[j];
                j = j + 2;
            }
            output[0][3] = accounts;
        }
        //Si el elemento no existe, se devuelve null
        else{
            output = null;
        }
        return output;
    }*/
}