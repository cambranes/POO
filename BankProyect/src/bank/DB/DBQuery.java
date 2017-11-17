/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bank.DB;

import java.sql.*;


/**
 *
 * @author edgar.cambranes
 */
public class DBQuery {
    private DBConnection dbconnection;
    private Statement query;
    private ResultSet resultset;
    
    
public ResultSet getCustomersAccountsInfo(String FN, String LN){
    String SQLquery ="SELECT C.idCustomer, FirstName, LastName, idAccount "+
                     "FROM Customers C, Accounts A "+
                     "WHERE FirstName=\'" +FN + "\' and "+
                     "LastName=\'" +LN + "\' and "+
                     "C.idCustomer = A.idCustomer";
    
    try{
        dbconnection = new DBConnection();
        Connection connection = dbconnection.getConnection();
        query = connection.createStatement();
        resultset = query.executeQuery(SQLquery);
        
    }
    catch(SQLException ex){
            System.out.println(ex.getMessage());
        }
    
    return resultset;
}

public void closeDBQuery(){
    dbconnection.closeConnection();
}


public static void main(String args[]){
       
    try{
        ResultSet  rs = new DBQuery().getCustomersAccountsInfo("Maria", "Moreno");
        String records ="";
        while(rs.next()){
        records += rs.getInt("idCustomer")+ "\t" +
                   rs.getString("FirstName") + "\t" +
                   rs.getString("LastName")+ "\t" +
                   rs.getString("idAccount")+"\n" ;
        }
        System.out.println(records);
    
    }catch(SQLException ex){
            System.out.println(ex.getMessage());
        }
       
}
    
}
