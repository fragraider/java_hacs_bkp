/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package serial;

import gnu.io.SerialPortEvent;
import org.junit.*;
import static org.junit.Assert.*;

/**
 *
 * @author Notandi
 */
public class SerialFrameTest {
    
    public SerialFrameTest() {
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
     * Test of closePort method, of class SerialFrame.
     */
    @Test
    public void testClosePort() {
        System.out.println("closePort");
        SerialFrame instance = null;
        instance.closePort();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of addFrameEventListener method, of class SerialFrame.
     */
    @Test
    public void testAddFrameEventListener() throws Exception {
        System.out.println("addFrameEventListener");
        FrameEventListener fel = null;
        SerialFrame instance = null;
        instance.addFrameEventListener(fel);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of serialEvent method, of class SerialFrame.
     */
    @Test
    public void testSerialEvent() {
        System.out.println("serialEvent");
        SerialPortEvent event = null;
        SerialFrame instance = null;
        instance.serialEvent(event);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of transmit method, of class SerialFrame.
     */
    @Test
    public void testTransmit() {
        System.out.println("transmit");
        byte[] byteArray = null;
        SerialFrame instance = null;
        instance.transmit(byteArray);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
}
