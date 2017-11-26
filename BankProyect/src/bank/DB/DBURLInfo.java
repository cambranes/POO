/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package bank.DB;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;


/**
 *
 * @author Kirbey
 */
public class DBURLInfo {
    private String dbms;
    private String serverName;
    private String serverPort;
    private String database;
    private String fullInfo;
    
    
    //Función que recibe el nombre del archivo donde se almacena
    //la información del URL. Devuelve un string diseñado para la función
    //getConnection(String, Propperties) en DBConnection.
    public String getURLInfo(String fileName){
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
            //Asigno a fullinfo el String que devolvera la función
            //en la forma que se necesita para getConection()
            fullInfo =  "jdbc:" + this.dbms + "://" +
                        this.serverName +
                        ":" + this.serverPort + "/"
                        + this.database;
            
            //Cerramos el scan
            scan.close();
        }
        catch(FileNotFoundException exc)
           {
           System.err.print(exc);
           }
        //Devolvemos fullinfo como
        return fullInfo;
    }
    
    //Función que recibe un parámtero String y devuelve un String
    //correspondiente al dbms
    public String getDbms(String fileName) throws FileNotFoundException{
        Scanner scan = new Scanner(new FileReader(fileName));
        scan.useDelimiter("\\s*,\\s*");
        while (scan.hasNext()){
                if("dbms".equals(scan.next())){
                dbms= scan.next();
                }
        }
        return dbms;//<- Pendiente revisar esta parte
    }
}
