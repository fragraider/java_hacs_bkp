/** @file */

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
    /* 
     * @Brief Returns all RFID's to a ResultSet. 
     * 
     * Opens a CreateExecStatement instance which in turn opens up a connection. Returns a resultSet is built from a the resultSet sent from the queryExecution() method in CreatexecStatement. Returns all RFID's to a ResultSet.
     */
    public ResultSet getAllRFIDs() throws SQLException{   
        CreateExecStatement getRFIDs = new CreateExecStatement();
        ResultSet resultSet = getRFIDs.queryExecution("SELECT RFID FROM HACSDB");
        return resultSet;
    }
     /* 
     * @Brief Returns all configuration settings for a given RFID. 
     * 
     * Opens a CreateExecStatement instance which in turn opens up a connection. Returns a resultSet is built from a the resultSet sent from the queryExecution() method in CreatexecStatement. Returns all configuration settings for a given RFID.
     */
    public ResultSet getConfig(String RFID) throws SQLException{   //return type is ResultSet from CreateExecStatement class. 
        CreateExecStatement getConfig = new CreateExecStatement();
        ResultSet resultSet = getConfig.queryExecution("SELECT * FROM HACSDB WHERE RFID = '" + RFID + "'");
        return resultSet;
    }    
     /* 
     * @Brief Creates a new user in Database. 
     * 
     * Opens a CreateExecStatement instance which in turn opens up a connection. Sends a an takes the RFID that is meant to be created and attaches that to a String which is sent to the Database. If everything works a new user is created. 
     */
    public void newUser(String newUserNumber) throws SQLException{    
        CreateExecStatement newUser = new CreateExecStatement();
        newUser.updateExecution("INSERT INTO HACSDB (RFID) VALUES '" + newUserNumber + "'");   //INSERT INTO HACSDB (RFID) VALUES ('1AAF25')
    }
    
    /*
     * @Brief Deletes a user/RFID (and configuration). 
     * 
     * This method simply deletes the line associated with an RFID. RFID is "key" and unique in the database and therefore simple to do. 
     */
    public void delUser(String delUserNumber) throws SQLException{   
        CreateExecStatement delUser = new CreateExecStatement();
        delUser.updateExecution("DELETE FROM HACSDB WHERE RFID='" + delUserNumber + "'"); //DELETE FROM HACSDB WHERE RFID=('1AAF28')
    }

       /*
        * @Brief Creates a new config. 
        * 
        * The newConfig method is hardcoded to take the parameters from the GUI and send them on to the database and thereby create or update an configuration for an RFID. 
        */
    public void newConfig(String RFID, int PIN, int Item1,int Item2,int Item3,int Item4,int Item5,int Item6,int Item7,int Item8,int Item9) throws SQLException{    //String newConfig
        CreateExecStatement newConfiguration = new CreateExecStatement();
        System.out.println("UPDATE HACSDB SET PIN=" + PIN + ", ITEM1=" + Item1 +  ", ITEM2=" + Item2 + ", Item3=" + Item3 +  ", Item4=" + Item4 +  ", Item5=" + Item5 +  ", Item6=" + Item6 +  ", Item7=" + Item7 +",  Item8=" + Item8 +  ", Item9=" + Item9 + " WHERE RFID='" + RFID + "'");
        newConfiguration.updateExecution("UPDATE HACSDB SET PIN=" + PIN + ", ITEM1=" + Item1 +  ", ITEM2=" + Item2 + ", Item3=" + Item3 +  ", Item4=" + Item4 +  ", Item5=" + Item5 +  ", Item6=" + Item6 +  ", Item7=" + Item7 +",  Item8=" + Item8 +  ", Item9=" + Item9 + " WHERE RFID='" + RFID + "'");
    }    
    
    /*
     * @Brief Used for the Serial part. 
     * 
     * Was supposed to help identifying the PIN for an RFID. Not used in present system. 
     */
    public ResultSet affirmRFID(String RFID) throws SQLException{   //This is tailor made for the call from the hardware to verify RFID. 
        CreateExecStatement affirmRFID = new CreateExecStatement();
        ResultSet resultSet = affirmRFID.queryExecution("SELECT RFID,PIN FROM HACSDB WHERE RFID = '" + RFID + "'");
        return resultSet;
    }    
    
    
    
    /**
     * @Brief Not used but gets everything in the Database
     * 
     * Added for completeness and testing. 
     * 
     * @throws SQLException 
     */
    /*
    public ResultSet getAll() throws SQLException{
        CreateExecStatement getConfig = new CreateExecStatement();
        getConfig.queryExecution("SELECT * FROM HACSDB");
        return getConfig.getResultSet();
    }
    */
    
  
}
