/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

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
@Suite.SuiteClasses({Control.ControlSuite.class, serial.SerialSuite.class, BullshitPackageIgnore.BullshitPackageIgnoreSuite.class, protocol.ProtocolSuite.class, controller.ControllerSuite.class, rfid.RfidSuite.class, Database.DatabaseSuite.class})
public class RootSuite {

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
