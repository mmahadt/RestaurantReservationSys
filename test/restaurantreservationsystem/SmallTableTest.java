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
 * @author Mahad
 */
public class SmallTableTest {

    public SmallTableTest() {
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
     * Test of isFull method, of class SmallTable.
     */
    @Test
    public void testIsFull() {
        System.out.println("isFull");
        SmallTable instance = new SmallTable();

        boolean expResult = false;

        boolean result = instance.isFull();

        assertFalse(result);

        for (int i = 0; i < 30; ++i) {
            instance.getATableBooked();
        }

        expResult = true;
        result = instance.isFull();
        assertEquals(expResult, result);
    }

    /**
     * Test of getATableBooked method, of class SmallTable.
     */
    @Test
    public void testGetATableBooked() {
        System.out.println("getATableBooked");

        SmallTable instance = new SmallTable();

        assertTrue(instance.getATableBooked());

        for (int i = 0; i < 5; ++i) {
            instance.getATableBooked();
        }

        assertTrue(instance.getATableBooked());
    }

//    /**
//     * Test of getAvailableSlots method, of class SmallTable.
//     */
//    @Test
//    public void testGetAvailableSlots() {
//        System.out.println("getAvailableSlots");
//        SmallTable instance = new SmallTable();
//        for (int i = 0; i < 30; ++i) {
//            instance.getATableBooked();
//        }
//        assertFalse(instance.getAvailableSlots());
//
//        SmallTable instance2 = new SmallTable();
//        for (int i = 0; i < 5; ++i) {
//            instance2.getATableBooked();
//        }
//        assertTrue(instance2.getAvailableSlots());
//    }
}
