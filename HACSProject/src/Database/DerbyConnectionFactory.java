package Database;

//This is just a stupid connection to the database by Eirikur from 
//the simple database Demo, and other identical examples. 
//The only entry point into this class is the createConnection() method
//which returns a connection object. 

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
auth@ Eirikur Emilsson  Stolen from examples and teachers. 
 */
public class DerbyConnectionFactory {

    //<editor-fold defaultstate="collapsed" desc="HardCoded for legibility and simplicity.">
    //private static final String URL = "jdbc:derby://localhost:1527/HACSDB";
    //private static final String USERNAME = "HACSADMIN";
    //private static final String PASSWORD = "HACSPW";
    //</editor-fold>

    public static Connection createConnection() throws SQLException { 
        return DriverManager.getConnection("jdbc:derby://localhost:1527/HACSDB", "HACSADMIN", "HACSPW");  
        //Connection er return type.
        //Accessed through DerbyConnectionFactory.createConnection()  //static? Instantiated in the BuildQuery class.  
        //From the DriverManager class with a method getConnection(). 
    }
}