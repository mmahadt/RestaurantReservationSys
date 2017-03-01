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

    private String timeSlot;

    private int tableNumber;

    private String tableType;

    public Customer() {
        ++customerCount;
    }

    public void setBookingDetails(String timeSlot, int tblNo, String tblType) {
        this.timeSlot = timeSlot;
        this.tableNumber = tblNo;
        this.tableType = tblType;
    }

    public void getDetails() {
        System.out.print("Customer number "+getCustomerCount());
        System.out.print("Booked Table "+tableType);
        System.out.print("Table Number "+tableNumber);
    }

    public static int getCustomerCount() {
        return customerCount;
    }

    public static void setCustomerCount(int customerCount) {
        Customer.customerCount = customerCount;
    }

}
