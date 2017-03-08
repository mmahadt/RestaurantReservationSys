/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package restaurantreservationsystem;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author mmahad.bese14seecs
 */
public class TableTest {
    
    public TableTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of getATableBooked method, of class Table.
     */
    @Test
    public void testGetATableBooked() {
        System.out.println("getATableBooked");
        Table instance = new TableImpl();
        boolean expResult = false;
        boolean result = instance.getATableBooked();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    public class TableImpl implements Table {

        public boolean getATableBooked() {
            return false;
        }
    }
    
}
