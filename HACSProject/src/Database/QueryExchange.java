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
        getConfig.queryExecution(RFID);
        return getConfig.getResultSet();
    }    
    
    public void newUser(String newUserNumber) throws SQLException{          //return type? Possibly set a code variable in the main class.  String newUserNumber
        CreateExecStatement newUser = new CreateExecStatement();
        newUser.updateExecution(newUserNumber);   //INSERT INTO HACSDB (RFID) VALUES ('1AAF25')
    }
    
    
    
    
    //newUser                                       String payload
    //delUser                                       String payload
    
    //newConfig()                                   multiple Strings payload, from Arraylist? 
    //getConfig()                                   String payload
    //getAllUsers()  ? or cylcle getConfig() ??     no payload
    

    
}
