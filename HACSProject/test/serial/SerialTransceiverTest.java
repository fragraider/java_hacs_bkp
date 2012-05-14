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
public class SerialTransceiverTest {
    
    public SerialTransceiverTest() {
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
     * Test of openPort method, of class SerialTransceiver.
     */
    @Test
    public void testOpenPort() throws Exception {
        System.out.println("openPort");
        String port = "";
        SerialTransceiver instance = null;
        instance.openPort(port);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of transmit method, of class SerialTransceiver.
     */
    @Test
    public void testTransmit() {
        System.out.println("transmit");
        byte[] bytePacket = null;
        SerialTransceiver instance = null;
        instance.transmit(bytePacket);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of closePort method, of class SerialTransceiver.
     */
    @Test
    public void testClosePort() {
        System.out.println("closePort");
        SerialTransceiver instance = null;
        instance.closePort();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
}
