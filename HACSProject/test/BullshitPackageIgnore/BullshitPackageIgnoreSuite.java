/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package BullshitPackageIgnore;

import COMConnect.COMConnectionTest;
import COMConnect.COMControllerTest;
import COMConnect.TwoWaySerialCommTest;
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
@Suite.SuiteClasses({COMControllerTest.class, PortTest.class, TwoWaySerialCommTest.class, RFIDReaderSimpleSimulatorTestTest.class, COMConnectionTest.class})
public class BullshitPackageIgnoreSuite {

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
