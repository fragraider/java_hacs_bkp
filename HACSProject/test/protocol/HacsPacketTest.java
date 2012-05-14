/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package protocol;

import org.junit.*;
import static org.junit.Assert.*;

/**
 *
 * @author Notandi
 */
public class HacsPacketTest {
    
    public HacsPacketTest() {
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
     * Test of getBytes method, of class HacsPacket.
     */
    @Test
    public void testGetBytes() {
        System.out.println("getBytes");
        HacsPacket instance = new HacsPacket();
        byte[] expResult = null;
        byte[] result = instance.getBytes();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of generateChecksum method, of class HacsPacket.
     */
    @Test
    public void testGenerateChecksum() {
        System.out.println("generateChecksum");
        HacsPacket instance = new HacsPacket();
        instance.generateChecksum();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of isPacketComplete method, of class HacsPacket.
     */
    @Test
    public void testIsPacketComplete() {
        System.out.println("isPacketComplete");
        byte[] byteFrame = null;
        HacsPacket instance = new HacsPacket();
        boolean expResult = false;
        boolean result = instance.isPacketComplete(byteFrame);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getPacketSize method, of class HacsPacket.
     */
    @Test
    public void testGetPacketSize() {
        System.out.println("getPacketSize");
        byte[] byteFrame = null;
        HacsPacket instance = new HacsPacket();
        int expResult = 0;
        int result = instance.getPacketSize(byteFrame);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of equals method, of class HacsPacket.
     */
    @Test
    public void testEquals() {
        System.out.println("equals");
        Object obj = null;
        HacsPacket instance = new HacsPacket();
        boolean expResult = false;
        boolean result = instance.equals(obj);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of hashCode method, of class HacsPacket.
     */
    @Test
    public void testHashCode() {
        System.out.println("hashCode");
        HacsPacket instance = new HacsPacket();
        int expResult = 0;
        int result = instance.hashCode();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
}
