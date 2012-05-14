/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import org.junit.*;
import static org.junit.Assert.*;
import protocol.Packet;
import serial.FrameEvent;
import serial.SerialTransceiver;

/**
 *
 * @author Notandi
 */
public class RFIDEventManagerSimpleTest {
    
    public RFIDEventManagerSimpleTest() {
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
     * Test of getSource method, of class RFIDEventManagerSimple.
     */
    @Test
    public void testGetSource() {
        System.out.println("getSource");
        RFIDEventManagerSimple instance = new RFIDEventManagerSimple();
        String expResult = "";
        String result = instance.getSource();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setSource method, of class RFIDEventManagerSimple.
     */
    @Test
    public void testSetSource() {
        System.out.println("setSource");
        String source = "";
        RFIDEventManagerSimple instance = new RFIDEventManagerSimple();
        instance.setSource(source);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getPacket method, of class RFIDEventManagerSimple.
     */
    @Test
    public void testGetPacket() {
        System.out.println("getPacket");
        RFIDEventManagerSimple instance = new RFIDEventManagerSimple();
        Packet expResult = null;
        Packet result = instance.getPacket();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getDestination method, of class RFIDEventManagerSimple.
     */
    @Test
    public void testGetDestination() {
        System.out.println("getDestination");
        RFIDEventManagerSimple instance = new RFIDEventManagerSimple();
        String expResult = "";
        String result = instance.getDestination();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setDestination method, of class RFIDEventManagerSimple.
     */
    @Test
    public void testSetDestination() {
        System.out.println("setDestination");
        String destination = "";
        RFIDEventManagerSimple instance = new RFIDEventManagerSimple();
        instance.setDestination(destination);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setTransmitter method, of class RFIDEventManagerSimple.
     */
    @Test
    public void testSetTransmitter() {
        System.out.println("setTransmitter");
        SerialTransceiver transmitter = null;
        RFIDEventManagerSimple instance = new RFIDEventManagerSimple();
        instance.setTransmitter(transmitter);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of openPort method, of class RFIDEventManagerSimple.
     */
    @Test
    public void testOpenPort() throws Exception {
        System.out.println("openPort");
        RFIDEventManagerSimple instance = new RFIDEventManagerSimple();
        instance.openPort();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of closePort method, of class RFIDEventManagerSimple.
     */
    @Test
    public void testClosePort() {
        System.out.println("closePort");
        RFIDEventManagerSimple instance = new RFIDEventManagerSimple();
        instance.closePort();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of sendRFIDResponse method, of class RFIDEventManagerSimple.
     */
    @Test
    public void testSendRFIDResponse() {
        System.out.println("sendRFIDResponse");
        String status = "";
        String data = "";
        RFIDEventManagerSimple instance = new RFIDEventManagerSimple();
        instance.sendRFIDResponse(status, data);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of frameReady method, of class RFIDEventManagerSimple.
     */
    @Test
    public void testFrameReady() {
        System.out.println("frameReady");
        FrameEvent frameEvent = null;
        RFIDEventManagerSimple instance = new RFIDEventManagerSimple();
        instance.frameReady(frameEvent);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
}
