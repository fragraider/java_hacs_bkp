/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Database;

import java.sql.Connection;
import org.junit.*;
import static org.junit.Assert.*;

/**
 *
 * @author Notandi
 */
public class DerbyConnectionFactoryTest {
    
    public DerbyConnectionFactoryTest() {
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
     * Test of createConnection method, of class DerbyConnectionFactory.
     */
    @Test
    public void testCreateConnection() throws Exception {
        System.out.println("createConnection");
        Connection expResult = null;
        Connection result = DerbyConnectionFactory.createConnection();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
}
