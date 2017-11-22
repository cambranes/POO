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
    
    public void addNewCustomerInfo(String FN,String LN){
        int ID = customerIDCount() + 1;
        String SQLQuery = //"select max(IDCustomer) as ID"
                //+ " from bank.customer; "
                "insert into bank.customer (IDCustomer,FirstName"
                + ",LastName) "
                + "values ("+ ID + ",'" + FN + "','" + LN + "')";
        try{
        dbConn = new DBConnection();
        Connection conn = dbConn.getConnection();
        query = conn.createStatement();
        query.executeUpdate(SQLQuery);
        }
        catch (SQLException ex){
            System.out.println(ex.getMessage());
        }
    }
    
    public int customerIDCount(){
        int ID = 0;
        String SQLQuery = "select MAX(IDCustomer) as ID from bank.customer";
        try{
        dbConn = new DBConnection();
        Connection conn = dbConn.getConnection();
        query = conn.createStatement();
        resultset = query.executeQuery(SQLQuery);
        resultset.next();
        ID = resultset.getInt("ID");
        System.out.println(ID);
        }
        catch (SQLException ex){
            System.out.println(ex.getMessage());
        }
        return ID;
    }
    
    public ResultSet deleteCustomerInfo(String FN,String LN){
        String SQLQuery = "select customer.IDCustomer, customer.FirstName"
                + ", customer.LastName, accounts.IDAccount "
                + "from bank.customer, bank.accounts "
                + "where customer.IDCustomer = accounts.IDCustomer and FirstName='"
                + FN + "' and LastName='" + LN + "' and accounts.Balance != 0";
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
    
    public void updateCustomerInfo(String FN, String LN,String NFN,String NLN){
        String SQLQuery = "update bank.customer set FirstName = '"
                + NFN + "' , LastName = '" + NLN + "' "
                + "where FirstName = '" + FN + "' and LastName = '"
                + LN + "'";
        try{
        dbConn = new DBConnection();
        Connection conn = dbConn.getConnection();
        query = conn.createStatement();
        query.executeUpdate(SQLQuery);
        }
        catch (SQLException ex){
            System.out.println(ex.getMessage());
        }
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
