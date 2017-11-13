/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bank.DB;

import bank.model.BankTextReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Properties;

/**
 *
 * @author chiki
 */
public class DBConnection {
    private Connection connection;
    private String dbms;
    private Properties connectionProps;
    private String serverName;
    private String portNumber;
    private String dbName;
    
    private Properties getDBURLinfo(){
    //Obtener Los Strings de arriba aqui, desde un .txt con formato <KEY> <VALOR>
    //Guardarlo en otro Properties
    BankTextReader reader = new BankTextReader();
    ArrayList<String> infoText = reader.bankReader("DBInfo.txt");
    Properties DBInfo = new Properties();
    int i=0;
    while(i<infoText.size()){
    DBInfo.put(infoText.get(i),infoText.get(i+1));
    i += 2;
    }
    return DBInfo;
    }
    
    private void getDBStrings(Properties DBInfo){
        dbms = DBInfo.getProperty("dbms");
        serverName = DBInfo.getProperty("serverName");
        portNumber = DBInfo.getProperty("portNumber");
        dbName = DBInfo.getProperty("dbName");
    }
    
    private Properties getCredentials(){
    //Hay que agregar usuarios a la DB, y debe recibir las credenciales de un txt? credentials.txt
        BankTextReader reader = new BankTextReader();
        ArrayList<String> credText = reader.bankReader("credentials.txt");
        Properties connectionProps = new Properties();
        connectionProps.put("user", credText.get(0));
        connectionProps.put("password", credText.get(1));
        return connectionProps;
    }
    
    public Connection getConnection() throws SQLException{
        Connection connection = null;
        getDBStrings(getDBURLinfo());
        connectionProps = getCredentials();
        if (this.dbms.equals("mysql")) {
         connection = DriverManager.getConnection(
                "jdbc:" + this.dbms + "://" +
                this.serverName +
                ":" + this.portNumber + "/",
                connectionProps);
        } else if (this.dbms.equals("derby")) {
            connection = DriverManager.getConnection(
                "jdbc:" + this.dbms + ":" +
                this.dbName +
                ";create=true",
                connectionProps);
        }
    System.out.println("Connected to database");
    return connection;
    }
    
    public boolean closeConnection(){
        boolean flag = true;
        try{
            connection.close();
        }
        catch(SQLException ex){
            System.out.println(ex.getMessage());
            flag = false;
        }
        return flag;
    }
    
    

  
}

