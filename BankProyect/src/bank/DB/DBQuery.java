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
    private DBConnection dbConn; //try to replace this for a DBConnection object, so that close is accesible
    private Statement query;
    private ResultSet resultset;
    
    public ResultSet getCustomersAccountsInfo(String FN, String LN){
        String SQLQuery = "select customer.IDCustomer, customer.FirstName"
                + ", customer.LastName, accounts.IDAccount "
                + "from bank.customer, bank.accounts "
                + "where customer.IDCustomer = accounts.IDCustomer and FirstName='"
                + FN + "' and LastName='" + LN + "'";
        try{
        dbConn = new DBConnection();
        Connection conn = dbConn.getConnection();
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
                    + "\t" + rs.getString("LastName") + "\t" + rs.getInt("IDAccount")
                    + "\n";
        }
        }    
        catch(SQLException ex){
           System.out.println(ex.getMessage());
        }
        System.out.println(record);
        
    }
   
    public void closeConn(){
        dbConn.closeConnection();
        }
}
