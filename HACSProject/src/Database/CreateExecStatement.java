/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */


// part of 2nd commit see here. 


package Database;

import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * @author Notandi
 */
public class CreateExecStatement{
 
     
    private Connection connection = null;
    private PreparedStatement preparedStatement = null;
    private ResultSet resultSet = null;
    private ResultSetMetaData metaData = null;
    
    public CreateExecStatement(){
        
    }
    
    public ResultSet getResultSet(){   //I know it is basic but I'm not sure I can pass an object var like this or if this will work. 
        return resultSet;
    }
        
    public void queryExecution(String cmdString) throws SQLException    //getConfig //getConfigAll()
        {
        connection = DerbyConnectionFactory.createConnection();
        
        preparedStatement = connection.prepareStatement(cmdString);   //Formerly "SELECT * FROM  \"HACSDB\"" instead of cmdString
        //int 1stint = 5;     //For debugging only. 
        resultSet = preparedStatement.executeQuery();
        //int 2ndint = 6;    //For debugging only. 
        metaData = resultSet.getMetaData();        

        
        //For debugging only
            int numberOfColumns = metaData.getColumnCount();
            for (int i = 1; i <= numberOfColumns; i++) {
                System.out.printf("%-40s\t", metaData.getColumnName(i));
            }
            System.out.println();

            while (resultSet.next()) {
                for (int i = 1; i <= numberOfColumns; i++) {
                    System.out.printf("%-40s\t", resultSet.getObject(i));
                }
                System.out.println();
            }
        } 
    
    
    
    
    public void updateExecution(String cmdString) throws SQLException   //newUser //newConfig 
        {
        connection = DerbyConnectionFactory.createConnection();
        preparedStatement = connection.prepareStatement(cmdString); 
        preparedStatement.executeUpdate();
        } 
    
    
    
    
    
    
        //Doesn't work for some reason. Edited out and seems to be fine without it. 
        /* catch (SQLException ex) {
            Logger.getLogger(CreateExecStatement.class.getName()).log(Level.SEVERE, null, ex);
        } 
        
        finally
        {
            try {
                resultSet.close();
                preparedStatement.close();
                connection.close();
            } catch (SQLException temp) {
                Logger.getLogger(CreateExecStatement.class.getName()).log(Level.SEVERE, null, temp);
            }
        }
        
        */
        
        
}