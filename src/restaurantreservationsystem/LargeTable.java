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
public class LargeTable implements Table {

    boolean[] STSlotsAvailable = {true, true, true, true, true, true, true};

    String timeSlots[]
            = {
                "11:00 am to 12:30 pm",
                "12:30 pm to 2:00 pm",
                "2:00 pm to 3:30 pm",
                "3:30 pm to 5:00 pm",
                "5:00 pm to 6:30 pm",
                "6:30 pm to 8:00 pm",
                "8:00 pm to 9:30 pm"
            };

    public boolean isFull() {
        for (int i = 0; i < STSlotsAvailable.length; i++) {
            if (STSlotsAvailable[i] == true) {
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean getATableBooked() {

        if (!this.isFull()) {
            Customer C1 = new Customer();

            for (int i = 0; i < STSlotsAvailable.length; i++) {
                if (STSlotsAvailable[i]) {
                    STSlotsAvailable[i] = false;//book the slot
                    C1.setBookingDetails(timeSlots[i], i, "Small Table");
                    C1.getDetails();
                    System.out.println("Congratulations your table has been booked.");
                    return true;
                }
            }
        }
        System.out.println("We are sorry. All large tables have been booked for today.");
        return false;
    }
}


/*

    @Override
    public boolean getATableBooked() {

        if (!this.isFull()) {
            Customer C1 = new Customer();

            for (int i = 0; i < ST.length; i++) {
                for (int j = 0; j < timeSlots.length; j++) {
                    if (STSlotsAvailable[j] == true) {
                        STSlotsAvailable[j] = false;
                        C1.setBookingDetails(timeSlots[j], i, "Small Table");
                        return true;
                    }
                }
            }
        }
        return false;
    } 
 */
