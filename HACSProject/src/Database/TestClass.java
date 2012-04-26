package Database;

import java.sql.SQLException;




public class TestClass {
    
    
    //Testing for CreateExecStatement
/* public static void main(String[] args) throws SQLException {
    CreateExecStatement createExec = new CreateExecStatement();
    createExec.queryExecution("SELECT * FROM  \"HACSDB\"");
    }
    */
 
    //Testing for QueryExchange.newUser;
/* public static void main(String[] args) throws SQLException {
    QueryExchange test1 = new QueryExchange();
    test1.newUser(); 
    }
    */
    
    //Testing for CreateExecStatement.updateExecution()
public static void main(String[] args) throws SQLException {
    CreateExecStatement createExec = new CreateExecStatement();
    createExec.updateExecution();
    }
    
    
    
        //Testing for QueryExchange.getConfig
/* public static void main(String[] args) throws SQLException {
    QueryExchange test1 = new QueryExchange();
    test1.getConfig("SELECT * FROM HACSDB WHERE RFID = ('1AAF23')");
    * }
    */
}