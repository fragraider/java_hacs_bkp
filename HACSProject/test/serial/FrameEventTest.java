/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package serial;

import org.junit.*;
import static org.junit.Assert.*;

/**
 *
 * @author Notandi
 */
public class FrameEventTest {
    
    public FrameEventTest() {
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
     * Test of getData method, of class FrameEvent.
     */
    @Test
    public void testGetData() {
        System.out.println("getData");
        FrameEvent instance = null;
        byte[] expResult = null;
        byte[] result = instance.getData();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
}
