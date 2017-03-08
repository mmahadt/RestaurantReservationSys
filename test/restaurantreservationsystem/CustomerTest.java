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
public class CustomerTest {
    
    public CustomerTest() {
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
     * Test of getCustomerID method, of class Customer.
     */
    @Test
    public void testGetCustomerID() {
        System.out.println("getCustomerID");
        Customer instance = new Customer();
        int expResult = 0;
        int result = instance.getCustomerID();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setCustomerID method, of class Customer.
     */
    @Test
    public void testSetCustomerID() {
        System.out.println("setCustomerID");
        int customerID = 0;
        Customer instance = new Customer();
        instance.setCustomerID(customerID);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setBookingDetails method, of class Customer.
     */
    @Test
    public void testSetBookingDetails() {
        System.out.println("setBookingDetails");
        String timeSlot = "";
        int tblNo = 0;
        String tblType = "";
        Customer instance = new Customer();
        instance.setBookingDetails(timeSlot, tblNo, tblType);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getDetails method, of class Customer.
     */
    @Test
    public void testGetDetails() {
        System.out.println("getDetails");
        Customer instance = new Customer();
        instance.getDetails();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
