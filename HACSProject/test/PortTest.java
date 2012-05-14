/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

import org.junit.*;
import static org.junit.Assert.*;

/**
 *
 * @author Notandi
 */
public class PortTest {
    
    public PortTest() {
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
     * Test of open method, of class Port.
     */
    @Test
    public void testOpen() {
        System.out.println("open");
        String comportUsed = "";
        Port instance = new Port();
        instance.open(comportUsed);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
}
