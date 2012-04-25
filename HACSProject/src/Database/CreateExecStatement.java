/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Database;

import java.sql.*;

/**
 * @author Notandi
 */
public class CreateExecStatement{
 
     
    private Connection connection = null;
    private ResultSet rs = null;
    
    public CreateExecStatement(){
        
    }
        
    public void testMethod() throws SQLException    
        {
        connection = DerbyConnectionFactory.createConnection();
        
        PreparedStatement preparedStatement = connection.prepareStatement ("SELECT * FROM  \"HACSDB\"");
        //int 1stint = 5;     //For debugging only. 
        rs = preparedStatement.executeQuery ();
        
        //int 2ndint = 6;    //For debugging only. 
        }
}