/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bank.controller;

import bank.DB.DBQuery;
import java.sql.SQLException;
import java.sql.ResultSet;

/**
 *
 * @author Kirbey
 */
public class BankController {
    
    public String[][] getTable(String fullName) throws SQLException{
    String[][] table;
        if(fullName != null){
            DBQuery query = new DBQuery();
            ResultSet rSet;
            String split[] = fullName.split(" ");
            String FN = split[0];
            String LN = split[1];
            int rowSize;
            rSet=query.getCustomerInfo(FN, LN);

            //Comprobamos si la tabla tiene datos
            if(rSet.first()){
                //Obtenemos el tamaño del query para establecer
                //el tamaño de la tabla generada
                rSet.last();
                rowSize=rSet.getRow();
                rSet.beforeFirst();
                String[]accounts = new String[rowSize];
                String toTable="";
                int row= 1;
                //Funcion que llena solamente una fila en la tabla y en la
                //ultima fila, pone las cuentas
                table=new String[row][getHeader().length];
                    for(int i=0; i<rowSize; i++){
                        if(rSet.next()){
                            table[row-1][0] = "" +rSet.getInt("idCustomer");
                            table[row-1][1] = rSet.getString("FirstName");
                            table[row-1][2] = rSet.getString("LastName");
                            accounts[i] = rSet.getInt("idAccount") +", ";
                        }
                    }
                    for(int i = 0; i<rowSize; i++){
                        toTable =accounts[i] +toTable ;
                    }
                    table[row-1][3] = toTable;
                 //
                query.closeDBQuery();
                rSet.close();
            }else table=null;
        } else {
            table = null;
        }
        //Devolvemos null si no tiene datos
        return table;
    } 
    
    public String[][] getSimilarTable (String fullName) throws SQLException{
        String[][] table;
        if(fullName != null){
            DBQuery query = new DBQuery();
            ResultSet rSet;
            int rowSize;
            rSet=query.getSimilarCustomer(fullName);

            //Comprobamos si la tabla tiene datos
            if(rSet.next()){
                //Obtenemos el tamaño del query para establecer
                //el tamaño de la tabla generada
                rSet.last();
                rowSize=rSet.getRow();
                rSet.beforeFirst();
                //
                table=new String[rowSize][getHeader().length];
                    for(int row=0; row<rowSize; row++){
                        if(rSet.next()){
                            table[row][0] = "" +rSet.getInt("idCustomer");
                            table[row][1] = rSet.getString("FirstName");
                            table[row][2] = rSet.getString("LastName");
                            table[row][3] = rSet.getString("idAccount");
                        }
                    }
                query.closeDBQuery();
                rSet.close();
            }else table=null;
        } else {
            table = null;
        }
        //Devolvemos null si no tiene datos
        return table;
    } 
    
    //Funcion booleanaque recibe un parámetro String igual al nombre del customer
    //que se buscará. Devuelve true si todas las cuentas son iguales a 0 y false
    //si al menos una es diferente a 0
    public boolean accountsBalanceEqualsZero(String fullName) throws SQLException{
        boolean result;
        DBQuery query = new DBQuery();
        ResultSet rSet;
        String split[] = fullName.split(" ");
        String FN = split[0];
        String LN = split[1];
        int[] list;
        int rowSize;
        rSet=query.getAccountsBalance(FN, LN);
        
        //Comprobamos si la lista tiene datos
        if(rSet.first()){
            //Obtenemos el numero de filas del query para establecer
            //el numero de filas de la lista generada
            rSet.last();
            rowSize=rSet.getRow();
            rSet.beforeFirst();
            //Llenamos los elementos de la lista con el Balance de cada cuenta
            //respectivamente
            list = new int [rowSize];
            for(int element=0; element<rowSize; element++){
                rSet.next();
                list[element] = rSet.getInt("Balance");
            }
            //Cerramos el pipe del query y rSet
            query.closeDBQuery();
            rSet.close();
        }
        else {
            list = new int [-1];
            query.closeDBQuery();
            rSet.close();
        }
        //Hacemos una comprobación para saber si todas las cuentas estan
        //en cero. SI se cumple devuelve true, false en caso contrario.
        int verifier=0;
        for(int i = 0; i<list.length; i++){
            if(list[i]==0) verifier++;
        }
        if(verifier==list.length) result=true;
        else result=false;
    return result;
    }
    //Funcion booleana que comprueba si un nombre ya existe,
    //si existe devuelve true, devuelve false en caso contrario
    public boolean existCustomer(String fullName) throws SQLException{
        boolean result;
        DBQuery query = new DBQuery();
        ResultSet rSet;
        String splitName[] = fullName.split(" ");
        String FN = splitName[0];
        String LN = splitName[1];
        //El rSet me devolverá una lista vacia si el nombre no existe en
        //la base de datos
        rSet=query.getCustomersName(FN, LN);
        
        //Si hay al menos un valor entonces el nombre ya existe
        if(rSet.next()) result=true;
        else{
            result=false;
        } 
        query.closeDBQuery();
        rSet.close();
        return result;
    }
    
    //Funciion void que recibe dos String como parametros, oldName como el nombre
    //completo actual, y newName como el nombre a asignar.
    public void modifyCustomerName(String oldName, String newName) throws SQLException{
        DBQuery query = new DBQuery();
        ResultSet rSet;
        String splitOName[] = oldName.split(" ");
        String oFN = splitOName[0];
        String oLN = splitOName[1];
        String splitNName[] = newName.split(" ");
        String nFN = splitNName[0];
        String nLN = splitNName[1];
        
        rSet=query.updateFirstAndLastName(oFN, oLN, nFN, nLN);
        
        query.closeDBQuery();
    }
    
    //Función que no recibe parámetros. Solicita el ultimo valor de idCustomer
    //registrado en la DB y devuelve un int correspondiente al próximo int
    //más grande (el siguiente valor)
    public int getNextIDCustomer() throws SQLException{
        DBQuery query = new DBQuery();
        ResultSet rSet;
        int nextValue;
        rSet=query.getAllidCustomers();
        rSet.last();
        nextValue=rSet.getInt("idCustomer")+1;
        
        query.closeDBQuery();
        rSet.close();
        return nextValue;
    }
    
    //Función que no recibe parámetros. Solicita el ultimo valor de idAccount
    //registrado en la DB y devuelve un int correspondiente al próximo int
    //más grande (el siguiente valor)
    public int getNextIDAccount() throws SQLException{
        DBQuery query = new DBQuery();
        ResultSet rSet;
        int nextValue;
        rSet=query.getAllidAccounts();
        rSet.last();
        nextValue=rSet.getInt("idAccount")+1;
        
        query.closeDBQuery();
        rSet.close();
        return nextValue;
    }
    
    /*
    Crea una cuenta a la que se le asignaran los parametros:
    int idCust que recibe el id del customer dueño de esta cuenta
    String fullName que es el mombre del customer dueño de esta cuenta
    int idAcc que recibe el id asignado para esta cuenta
    int balance que recibe el balance que tendrá la cuenta
    String accType que recibe el tipo de cuenta DEBIT o CREDIT
    Devuelve true si el fullName es diferente a otro ya registrado
    y false en caso contrario.
    */
    public boolean createNewCustomer(int idCust, String fullName, int idAcc, int balance, String accType) throws SQLException{
        boolean result;
        DBQuery query = new DBQuery();
        DBQuery query2 = new DBQuery();
        ResultSet rSet;
        ResultSet rSet2;
        String[] split = fullName.split(" ");
        String FN = split[0];
        String LN= split[1];
        if(this.existCustomer(fullName) == false){
            rSet=query.addNewCustomer(idCust, FN, LN);
            rSet2=query2.addNewAccount(idCust, idAcc, balance, accType);
            result=true;
        }
        else {
            result=false;
        }
        
        query.closeDBQuery();
        query2.closeDBQuery();
        return result;
    }
    
    /*
    Crea una cuenta a la que se le asignaran los parametros:
    int idCust que recibe el id del customer dueño de esta cuenta
    String fullName que es el mombre del customer dueño de esta cuenta
    int idAcc que recibe el id asignado para esta cuenta
    int balance que recibe el balance que tendrá la cuenta
    String accType que recibe el tipo de cuenta DEBIT o CREDIT
    Devuelve true si el fullName coincide con a otro ya registrado
    y false en caso contrario.
    */
    public boolean createNewAccount(int idCust, String fullName, int idAcc, int balance, String accType) throws SQLException {
        boolean result;
        DBQuery query = new DBQuery();
        ResultSet rSet;
        String[] split = fullName.split(" ");
        String FN = split[0];
        String LN= split[1];
        //Verifico si ya existe el customers al que le quiero agregar la cuenta
        if(this.existCustomer(fullName) == true) {
            rSet=query.addNewAccount(idCust, idAcc, balance, accType);
            result=true;
            query.closeDBQuery();
        }
        else {
            result=false;
        }
        return result;
    }
            
    //Función que no recibe parámetros.
    //Asigna nombres a una cadena para pasarselos al header de la tabla
    public String[] getHeader(){
        String[] header = {"ID","First Name","Last Name","Accounts"};
        return header;
    }
}

