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
public class ExtraLargeTableTest {
    
    public ExtraLargeTableTest() {
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
     * Test of isFull method, of class ExtraLargeTable.
     */
    @Test
    public void testIsFull() {
        System.out.println("isFull");
        ExtraLargeTable instance = new ExtraLargeTable();
        boolean expResult = false;
        boolean result = instance.isFull();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getATableBooked method, of class ExtraLargeTable.
     */
    @Test
    public void testGetATableBooked() {
        System.out.println("getATableBooked");
        ExtraLargeTable instance = new ExtraLargeTable();
        boolean expResult = false;
        boolean result = instance.getATableBooked();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
