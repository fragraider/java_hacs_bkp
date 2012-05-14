/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Database;

import java.sql.SQLException;


/**
 *
 * @author Notandi
 */
public class SerialParser {
    
    public String committRFID(String serialData) throws SQLException{
        QueryExchange affirmEx = new QueryExchange();
        String affirmRFID = affirmEx.affirmRFID(serialData).toString();
        return affirmRFID;
    }
    
    
}


