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
public class CreateExecStatementTest {
    
    public CreateExecStatementTest() {
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
     * Test of queryExecution method, of class CreateExecStatement.
     */
    @Test
    public void testQueryExecution() throws Exception {
        System.out.println("queryExecution");
        String cmdString = "";
        CreateExecStatement instance = new CreateExecStatement();
        ResultSet expResult = null;
        ResultSet result = instance.queryExecution(cmdString);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of updateExecution method, of class CreateExecStatement.
     */
    @Test
    public void testUpdateExecution() throws Exception {
        System.out.println("updateExecution");
        String cmdString = "";
        CreateExecStatement instance = new CreateExecStatement();
        instance.updateExecution(cmdString);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
}
