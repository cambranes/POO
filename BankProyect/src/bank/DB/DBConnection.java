/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bank.DB;

import java.io.FileNotFoundException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;


/**
 *
 * @author Kirbey
 */
public class DBConnection {
    private Connection connection;
    private Properties props;
    private String dbms = "mysql";  //Al usar la función getDbms();
                                    //obtenemos un valor null
    private DBURLInfo urlInfo;
    private DBCredentials credInfo;
    
    public Connection getConnection() throws SQLException, FileNotFoundException  {
        props = new Properties();
        credInfo = new DBCredentials();
        credInfo.getCredentials("DBCredentials.txt");
        props.put("user", credInfo.user);
        props.put("password", credInfo.password);
        
        urlInfo = new DBURLInfo();
        urlInfo.getURLInfo("DBURLInfo.txt");
        if (urlInfo.dbms.equals("mysql")) {
            connection = DriverManager.getConnection("jdbc:" + urlInfo.dbms 
                    +"://" +urlInfo.serverName +":" +urlInfo.serverPort + "/" +
                    urlInfo.database, props);
        }
        System.out.println("Connection established");
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
