/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bank.DB;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;
import java.util.Hashtable;


/**
 *
 * @author Kirbey
 */
public class DBURLInfo {
    Hashtable data = new Hashtable();
    String dbms;
    String serverName;
    String serverPort;
    String database;
    String fullInfo;
    
    
    //Función que recibe el nombre del archivo donde se almacena
    //la información del URL. Devuelve un string diseñado para la función
    //getConnection(String, Propperties) en DBConnection.
    public Hashtable getURLInfo(String fileName){
        try{
            Scanner scan = new Scanner(new FileReader(fileName));
            //Uso una coma como delimitador de tokens
            scan.useDelimiter("\\s*,\\s*");
            //Mientras hayan tokens en el archivo, los leo
            while (scan.hasNext()){
                //Busco el token "dbms" y guardo el valor siguiente en
                //this.dbms
                if("dbms".equals(scan.next())){
                this.dbms= scan.next();
                }
                //Busco el token "serverName" y guardo el valor siguiente en
                //this.serverName
                if("serverName".equals(scan.next())){
                    this.serverName = scan.next();
                }
                //Busco el token "serverPort" y guardo el valor siguiente en
                //this.serverPort
                if("serverPort".equals(scan.next())){
                    this.serverPort = scan.nextBigInteger().toString();
                }
                //Busco el token "database" y guardo el valor siguiente en
                //this.database
                if("database".equals(scan.next())){
                    this.database = scan.next();
                }
            }
            
            this.data.put("dbms", this.dbms);
            this.data.put("serverName", this.serverName);
            this.data.put("serverPort", this.serverPort);
            this.data.put("database", this.database);
            scan.close();
        }
        catch(FileNotFoundException exc){
           System.err.print(exc);
        }
        //Devolvemos fullinfo como
        return data;
    }
}