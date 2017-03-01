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
public class SmallTable implements Table {

    static boolean ST[] = new boolean[4];//an array to store total number of tables 

//    static int numberOfSmallTables = 0;

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

//    private SmallTable() {
//        if (numberOfSmallTables <= 3) {
//            ++numberOfSmallTables;
//        }
//    }
    
//    public SmallTable getSmallTable(){
//        return new SmallTable();
//    }

    public boolean isFull() {
        for (int i = 0; i < ST.length; i++) {
            for (int j = 0; j < STSlotsAvailable.length; j++) {
                if (STSlotsAvailable[j] == true) {
                    return false;
                }
            }
        }
        return true;
    }

    @Override
    public boolean getATableBooked() {

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
        return false;
    }

}

//    @Override
//    public boolean getAvailableSlots() {
//        boolean slotsAvailable = false;
//        for (int i = 0; i < ST.length; i++) {
//            for (int j = 0; j < STSlotsAvailable.length; j++) {
//                if (STSlotsAvailable[j]) {
//                    System.out.println("Small Table number: " + i);
//                    System.out.println(timeSlots[j]);
//                    System.out.println("\n");
//                    slotsAvailable = true;
//                }
//            }
//        }
//        return slotsAvailable;
//    }