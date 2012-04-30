/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Control;

import java.sql.SQLException;

/**
 *
 * @author Notandi          //I only started using this class because some SQL error 
 *                          catch methods wouldn't work and other silly shit in
 *                          MainScreen. 
 *                          
 */
public class TriggeredActionsHelper {
    
    
    
    public void CreateUserButtonAction(String RFID) throws SQLException {
        Database.QueryExchange newUserObj = new Database.QueryExchange();
        newUserObj.newUser("RFID");
    }
    
    
    
    
    
}
