/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bank.DB;

import java.util.Scanner;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Hashtable;
import java.util.Properties;

/**
 *
 * @author Kirbey
 */
public class DBCredentials {
    Hashtable table = new Hashtable();
    String user;
    String password;
    
    //Función que recibe un parámetro String el cual será el nombre del
    //archivo contenedor de las credenciales
    public Hashtable getCredentials(String fileName) throws FileNotFoundException{
        try{
            Scanner scan = new Scanner(new FileReader(fileName));
            //Uso una coma como delimitador
            scan.useDelimiter("\\s*,\\s*");
            while (scan.hasNext()){
                //Busca en el documento el token "user" y guarda el
                //siguiente valor en user.
                if("user".equals(scan.next())){
                    this.user= scan.next();
                }
                //Busca en el documento el token "password" y guarda el
                //siguiente valor en password.
                if("password".equals(scan.next())){
                    this.password = scan.next();
                }
            }
            //Valor que devolvera la función
            this.table.put("user", this.user);
            this.table.put("password", this.password);
            
            //Terminamos la lectura de datos
            scan.close();
        }
        catch(FileNotFoundException exc)
           {
           System.err.print(exc);
           }
        
        return table;
    }
}
