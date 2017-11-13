/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bank.DB;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author chiki
 */
public class DBQuery {
    private Connection conn;
    private Statement query;
    private ResultSet resultset;
    
    public ResultSet getCustomersAccountsInfo(String FN, String LN){
        String SQLQuery = "select * from bank.customer where FirstName='"
                + FN + "' and LastName='" + LN + "'";
        try{
        conn = new DBConnection().getConnection();
        query = conn.createStatement();
        resultset = query.executeQuery(SQLQuery);
        }
        catch (SQLException ex){
            System.out.println(ex.getMessage());
        }
        return resultset;
    }
    
    public static void main(String args[]){
        String record = "";
        try{
        ResultSet rs = new DBQuery().getCustomersAccountsInfo("Guido", "Mista");
        while(rs.next()){
            record += rs.getInt("IDCustomer") + "\t" + rs.getString("FirstName")
                    + "\t" + rs.getString("LastName");
        }
        }    
        catch(SQLException ex){
           System.out.println(ex.getMessage());
        }
        System.out.println(record);
        
    }
   
}
