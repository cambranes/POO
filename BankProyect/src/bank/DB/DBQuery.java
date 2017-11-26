/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bank.DB;

import java.io.FileNotFoundException;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author Kirbey
 */
public class DBQuery {
    private DBConnection dbconnection;
    private Statement query;
    private ResultSet resultset;
    
    public ResultSet addNewCustomer(int idCus, String FN, String LN){
        String SQLquery =
                "INSERT INTO customers(idCustomer, `FirstName`, `LastName`) " +
                "Values(" +idCus +", \"" +FN +"\", \"" +LN +"\")";
        try{
        dbconnection = new DBConnection();
        Connection connection = dbconnection.getConnection();
        query = connection.createStatement();
        query.executeUpdate(SQLquery);
        }
        catch(SQLException | FileNotFoundException ex){
            System.out.print(ex);
        }
        return resultset;
    }
    
    public ResultSet addNewAccount(int idCust, int idAcc, int balance, String accType){
        String SQLquery =
                "INSERT INTO accounts(idCustomer, idAccount, Balance," +
                " `accountType`) Values(" +idCust +", " +idAcc +", " +balance +
                ", \"" +accType +"\")";
        try{
        dbconnection = new DBConnection();
        Connection connection = dbconnection.getConnection();
        query = connection.createStatement();
        query.executeUpdate(SQLquery);
        }
        catch(SQLException | FileNotFoundException ex){
            System.out.print(ex);
        }
        return resultset;
    }
    
    public ResultSet getCustomerInfo(String FN, String LN){
        String SQLquery =
                "SELECT C.idCustomer, FirstName, LastName, idAccount " +
                "FROM accounts A, customers C " +
                "WHERE FirstName=\'" +FN + "\' and "+
                "LastName=\'" +LN + "\' and " +
                "A.idCustomer = C.idCustomer ";
        try{
        dbconnection = new DBConnection();
        Connection connection = dbconnection.getConnection();
        query = connection.createStatement();
        resultset = query.executeQuery(SQLquery);
        }
        catch(SQLException | FileNotFoundException ex){
            System.out.print(ex);
        }
        return resultset;
    }
    
    public ResultSet getAllidAccounts(){
        String SQLquery =
                "SELECT idAccount " +
                "FROM accounts";
        try{
        dbconnection = new DBConnection();
        Connection connection = dbconnection.getConnection();
        query = connection.createStatement();
        resultset = query.executeQuery(SQLquery);
        }
        catch(SQLException | FileNotFoundException ex){
            System.out.print(ex);
        }
        return resultset;
    }
    
    public ResultSet getAllidCustomers(){
        String SQLquery =
                "SELECT idCustomer " +
                "FROM customers";
        try{
            dbconnection = new DBConnection();
            Connection connection = dbconnection.getConnection();
            query = connection.createStatement();
            resultset = query.executeQuery(SQLquery);
        }
        catch(SQLException | FileNotFoundException ex){
            System.out.print(ex);
        }
        return resultset;
    }
    
    public ResultSet getAccountsBalance(String FN, String LN){
        String SQLquery =
                "SELECT Balance " +
                "FROM accounts A, customers C " +
                "WHERE FirstName=\'" +FN + "\' and "+
                "LastName=\'" +LN + "\' and " +
                "A.idCustomer = C.idCustomer ";
        try{
        dbconnection = new DBConnection();
        Connection connection = dbconnection.getConnection();
        query = connection.createStatement();
        resultset = query.executeQuery(SQLquery);
        }
        catch(SQLException | FileNotFoundException ex){
            System.out.print(ex);
        }
        return resultset;
    }
    
    public ResultSet getCustomersName(String FN,String LN){
        String SQLquery = "SELECT FirstName, LastName " +
            "FROM customers " + "WHERE FirstName='" +FN +"' and "+
            "LastName='" +LN +"'";
        try{
        dbconnection = new DBConnection();
        Connection connection = dbconnection.getConnection();
        query = connection.createStatement();
        resultset = query.executeQuery(SQLquery);
        }
        catch(SQLException | FileNotFoundException ex){
            System.out.print(ex);
        }
        return resultset;
    }
    
    public ResultSet getidAccounts(String FN,String LN){
        String SQLquery = "SELECT FirstName, LastName " +
            "FROM customers " + "WHERE FirstName='" +FN +"' and "+
            "LastName='" +LN +"'";
        try{
        dbconnection = new DBConnection();
        Connection connection = dbconnection.getConnection();
        query = connection.createStatement();
        resultset = query.executeQuery(SQLquery);
        }
        catch(SQLException | FileNotFoundException ex){
            System.out.print(ex);
        }
        return resultset;
    }
    
    public ResultSet updateFirstAndLastName(String oldFN,String oldLN,String newFN,String newLN){
        String SQLquery = "UPDATE customers SET FirstName='" +newFN +
                "', LastName='" +newLN +"' WHERE FirstName='" +oldFN +
                "' and LastName='" +oldLN +"'";
        try{
        dbconnection = new DBConnection();
        Connection connection = dbconnection.getConnection();
        query = connection.createStatement();
        query.executeUpdate(SQLquery);
        }
        catch(SQLException | FileNotFoundException ex){
            System.out.print(ex);
        }
        return resultset;
    }
    
    public ResultSet getSimilarCustomer(String name){
        String SQLquery = "SELECT C.idCustomer, FirstName, LastName," +
                " idAccount FROM customers C," +
                " accounts A WHERE FirstName LIKE \'%" +name +"%\'" +
                //" OR LastName LIKE \'%" +name +"%\'"+
                " and A.idCustomer = C.idCustomer";
        try{
        dbconnection = new DBConnection();
        Connection connection = dbconnection.getConnection();
        query = connection.createStatement();
        resultset=query.executeQuery(SQLquery);
        }
        catch(SQLException | FileNotFoundException ex){
            System.out.print(ex);
        }
        return resultset;
    }
    
    public void closeDBQuery(){
        dbconnection.closeConnection();
    }
}
