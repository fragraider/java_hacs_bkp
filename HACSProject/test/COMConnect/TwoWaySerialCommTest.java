/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package COMConnect;

import org.junit.*;
import static org.junit.Assert.*;

/**
 *
 * @author Notandi
 */
public class TwoWaySerialCommTest {
    
    public TwoWaySerialCommTest() {
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
     * Test of connect method, of class TwoWaySerialComm.
     */
    @Test
    public void testConnect() throws Exception {
        System.out.println("connect");
        String portName = "";
        TwoWaySerialComm instance = new TwoWaySerialComm();
        instance.connect(portName);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of main method, of class TwoWaySerialComm.
     */
    @Test
    public void testMain() {
        System.out.println("main");
        String[] args = null;
        TwoWaySerialComm.main(args);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
}
