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
    private Connection connection;
    private Statement query;
    private ResultSet resultset;
    
    public ResultSet getCustomersAccountInfo(String FN, String LN){
        String SQLquery ="select * from bank.customers where "+
                "FirstName=\'" +FN + "\' and "+
                "LastName=\'" +LN + "\'";
        try{
        connection = new DBConnection().getConnection();
        query = connection.createStatement();
        resultset = query.executeQuery(SQLquery);
        
        }
        catch(SQLException | FileNotFoundException ex){
            System.out.print(ex);
        }
        return resultset;
    }
    
    
public static void main(String args[]){
    try{    
        ResultSet rs = new DBQuery().getCustomersAccountInfo("Maria", "Moreno");
        String records = "";
        while(rs.next()){
        records +=  rs.getInt("idCustomer") + "\t" +
                    rs.getString("FirstName") + "\t" +
                    rs.getString("LastName");
        }
        System.out.println(records);
    }
    catch(SQLException ex){
        System.out.println(ex.getMessage());
    }
}
    
}
