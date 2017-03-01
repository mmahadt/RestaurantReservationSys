/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package restaurantreservationsystem;

/**
 *
 * @author Mahad
 */
public class Customer {

    private static int customerCount = 0;

    private int customerID;

    public int getCustomerID() {
        return customerID;
    }

    public void setCustomerID(int customerID) {
        this.customerID = customerID;
    }

    private String timeSlot;

    private int tableNumber;

    private String tableType;

    public Customer() {
        ++customerCount;
        customerID = customerCount;
    }

    public void setBookingDetails(String timeSlot, int tblNo, String tblType) {
        this.timeSlot = timeSlot;
        this.tableNumber = tblNo;
        this.tableType = tblType;
    }

    public void getDetails() {
        System.out.print("Customer number " + getCustomerID());
        System.out.print("Booked Table " + tableType);
        System.out.print("Table Number " + tableNumber);
    }

}
