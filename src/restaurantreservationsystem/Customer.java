/*
This is customer clas. It holds all the data about one customer 
who has booked a table
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
