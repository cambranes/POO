/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bank.DB;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

/**
 *
 * @author edgar.cambranes
 */
public class DBConnection {
    private Connection connection;
    private Properties connectionProps;
    private String dbms = "mysql";
    private String serverName = "localhost";
    private String portNumber = "3306"; 
    private String database = "bank";
     
    private void getDBURLinfo(){
    /*
    Las siguientes atributos de un .txt
    private String dbms = "mysql";
    private String serverName = "localhost";
    private String portNumber = "3306"; 
    private String database = "bank";
        */
    }
    
    private void getCredentials(){
    connectionProps = new Properties();
    connectionProps.put("user", "root");
    connectionProps.put("password", "12345678");
        
    }
    
    public Connection getConnection() throws SQLException {
    //"jdbc:mysql://localhost:3306/sonoo","root","root");  
    getCredentials();
    if (this.dbms.equals("mysql")) {
        connection = DriverManager.getConnection(
                   "jdbc:" + this.dbms + "://" +
                   this.serverName +
                   ":" + this.portNumber + "/"
                    + this.database,
                    connectionProps);
        }
    System.out.println("Connection Established");
    return connection;
    }
    
    public boolean closeConnection(){
        boolean flag = true;
        try{
             connection.close();
       
        }
        catch(SQLException ex){
            System.out.println(ex.getMessage());
            flag  = false;
        }
    return flag;   
    }

public static void main(String args[]){
       try{
           Connection connection = new DBConnection().getConnection();
           connection.close();
       }
       catch(SQLException ex){
            System.out.println(ex.getMessage());
        }
}
    
}