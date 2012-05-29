/** @file */

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Database;

import java.sql.ResultSet;
import org.junit.*;
import static org.junit.Assert.*;

/**
 *
 * @author Notandi
 */
public class QueryExchangeTest {
    
    public QueryExchangeTest() {
    }
    
    @BeforeClass
    public static void setUpClass() throws Exception {
    }
    
    @AfterClass
    public static void tearDownClass() throws Exception {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of getAllRFIDs method, of class QueryExchange.
     *
     * @Test public void testGetAllRFIDs() throws Exception {
     * System.out.println("getAllRFIDs"); QueryExchange instance = new
     * QueryExchange(); ResultSet expResult = null; ResultSet result =
     * instance.getAllRFIDs(); assertEquals(expResult, result); // TODO review
     * the generated test code and remove the default call to fail. fail("The
     * test case is a prototype."); }
     *
     *
     * /**
     * Test of getConfig method, of class QueryExchange.
     */
 /*
    @Test
    public void testGetConfig() throws Exception {
        System.out.println("getConfig");
        String RFID = "997711";
        QueryExchange instance = new QueryExchange();
        
        String expResult = "997711";
        String expResult2 = "1113";
        ResultSet result = instance.getConfig(RFID);
        result.next();
        //result.next();
        String resultString = result.getObject(1).toString();
        String resultString2 = result.getObject(2).toString();
        System.out.println(resultString);
        System.out.println(expResult);
        //System.out.println(result.getObject(1));
        assertEquals(expResult, resultString);
        assertEquals(expResult2, resultString2);

    }
    * 
    */

    /**
     * Test of newUser method, of class QueryExchange.
     */
    
    @Test
    public void testNewUser() throws Exception {
        
        System.out.println("newUser");
        String newUserNumber = "131313";
        QueryExchange instance = new QueryExchange();
        instance.newUser(newUserNumber);
        ResultSet result = instance.getConfig(newUserNumber);
        result.next();
        String resultString = result.getObject(1).toString();
        System.out.println(resultString);
        System.out.println(newUserNumber);        
        assertEquals(resultString, newUserNumber);
        
        instance.delUser("131313");
    }

    /**
     * Test of delUser method, of class QueryExchange.
     */
    /*
    @Test
    public void testDelUser() throws Exception {
        System.out.println("delUser");
        String delUserNumber = "";
        QueryExchange instance = new QueryExchange();
        instance.delUser(delUserNumber);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    * 
    */

    /**
     * Test of newConfig method, of class QueryExchange.
     */
    /*
    @Test
    public void testNewConfig() throws Exception {
        System.out.println("newConfig");
        String RFID = "";
        int PIN = 0;
        int Item1 = 0;
        int Item2 = 0;
        int Item3 = 0;
        int Item4 = 0;
        int Item5 = 0;
        int Item6 = 0;
        int Item7 = 0;
        int Item8 = 0;
        int Item9 = 0;
        QueryExchange instance = new QueryExchange();
        instance.newConfig(RFID, PIN, Item1, Item2, Item3, Item4, Item5, Item6, Item7, Item8, Item9);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    * 
    */
    
}
