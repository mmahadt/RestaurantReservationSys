/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package restaurantreservationsystem;

import java.util.Scanner;

/**
 *
 * @author mmahad.bese14seecs
 */
public class ExtraLargeTable implements Table{

    boolean booked = false;//not booked yet

    public boolean isFull() {
        return booked;
    }

    @Override
    public boolean getATableBooked() {

        if (!this.isFull()) {
            Customer C1 = new Customer();

            for (int i = 0; i < 1; i++) {
                System.out.println("Please tell your preferable time slot.");
                
                Scanner scan = new Scanner(System.in);
                
                String time=scan.nextLine();
                
                C1.setBookingDetails(time, i, "ExtraLarge Table");
                C1.getDetails();
                System.out.println("Congratulations your table has been booked.");
                return true;
            }
        }
        System.out.println("We are sorry. Extra large table has already been booked by someone for today.");
        return false;
    }
}
