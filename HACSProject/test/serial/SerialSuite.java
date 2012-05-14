/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package serial;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

/**
 *
 * @author Notandi
 */
@RunWith(Suite.class)
@Suite.SuiteClasses({serial.SerialFrameTest.class, serial.FrameEventTest.class, serial.FrameEventListenerTest.class, serial.SerialTransceiverTest.class})
public class SerialSuite {

    @BeforeClass
    public static void setUpClass() throws Exception {
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
    }

    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }
    
}
