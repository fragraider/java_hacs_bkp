/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Database;

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
@Suite.SuiteClasses({Database.DerbyConnectionFactoryTest.class, Database.TestClassTest.class, Database.QueryExchangeTest.class, Database.CreateExecStatementTest.class})
public class DatabaseSuite {

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
