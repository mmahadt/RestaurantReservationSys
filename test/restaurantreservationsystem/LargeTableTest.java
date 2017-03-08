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
public class LargeTableTest {
    
    public LargeTableTest() {
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
     * Test of isFull method, of class LargeTable.
     */
    @Test
    public void testIsFull() {
        System.out.println("isFull");
        LargeTable instance = new LargeTable();
        boolean expResult = false;
        boolean result = instance.isFull();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getATableBooked method, of class LargeTable.
     */
    @Test
    public void testGetATableBooked() {
        System.out.println("getATableBooked");
        LargeTable instance = new LargeTable();
        boolean expResult = false;
        boolean result = instance.getATableBooked();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
