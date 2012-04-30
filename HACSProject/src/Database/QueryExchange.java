/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Database;

import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * @author Notandi   //Should I just make the CreateExecStatement object once and for all or once per execution of this class?
 */
public class QueryExchange {
       
    public ResultSet getConfig(String RFID) throws SQLException{   //return type is ResultSet from CreateExecStatement class. 
        CreateExecStatement getConfig = new CreateExecStatement();
        getConfig.queryExecution("SELECT * FROM HACSDB WHERE RFID = '" + RFID + "'");
        return getConfig.getResultSet();
    }    
    
    public void newUser(String newUserNumber) throws SQLException{   //return type? Would be nice to get some sort of validation. Just a select to get the new user and return a ResultSet. 
        CreateExecStatement newUser = new CreateExecStatement();
        newUser.updateExecution("INSERT INTO HACSDB (RFID) VALUES '" + newUserNumber + "'");   //INSERT INTO HACSDB (RFID) VALUES ('1AAF25')
    }
    
    public void delUser(String delUserNumber) throws SQLException{   //return type? Would be nice to get some sort of validation. Just a select to get the new user and return a ResultSet. 
        CreateExecStatement delUser = new CreateExecStatement();
        delUser.updateExecution("DELETE FROM HACSDB WHERE RFID='" + "delUserNumber" + "'"); //DELETE FROM HACSDB WHERE RFID=('1AAF28')
    }

        //test. newConfig is below. 
    public void newConfig(int Item1,int Item2,int Item3,int Item4,int Item5,int Item6,int Item7,int Item8,int Item9) throws SQLException{    //String newConfig
        CreateExecStatement newConfiguration = new CreateExecStatement();
        newConfiguration.updateExecution("UPDATE HACSDB SET ITEM1=" + Item1 +  ", ITEM2=" + Item2 + ", Item3=" + Item3 +  ", Item4=" + Item4 +  ", Item5=" + Item5 +  ", Item6=" + Item6 +  ", Item7=" + Item7 +",  Item8=" + Item8 +  ", Item9=" + Item9 + " WHERE RFID='290401'");
                                        //UPDATE HACSDB SET LIGHT1=77, LIGHT2=77 WHERE RFID='270401';
       
    }    
    
    public ResultSet getAll() throws SQLException{
        CreateExecStatement getConfig = new CreateExecStatement();
        getConfig.queryExecution("SELECT * FROM HACSDB");
        return getConfig.getResultSet();
    }    
}
