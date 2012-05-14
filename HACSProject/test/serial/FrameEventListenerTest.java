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
public class FrameEventListenerTest {
    
    public FrameEventListenerTest() {
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
     * Test of frameReady method, of class FrameEventListener.
     */
    @Test
    public void testFrameReady() {
        System.out.println("frameReady");
        FrameEvent frameEvent = null;
        FrameEventListener instance = new FrameEventListenerImpl();
        instance.frameReady(frameEvent);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    public class FrameEventListenerImpl implements FrameEventListener {

        public void frameReady(FrameEvent frameEvent) {
        }
    }
}
