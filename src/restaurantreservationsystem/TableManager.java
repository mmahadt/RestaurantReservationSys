/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package restaurantreservationsystem;

import java.util.Scanner;

/**
 *
 * @author Mahad
 */
public class TableManager {

    private Scanner scan = new Scanner(System.in);

    private SmallTable[] smallTables = new SmallTable[4];

    private MediumTable[] mediumTables = new MediumTable[8];

    private LargeTable[] largeTables = new LargeTable[3];

    private ExtraLargeTable[] extraLargeTables = new ExtraLargeTable[1];

    public void getInputFromUser() {
        System.out.println("Welcome to Restaurant Reservation System");

        System.out.println("Please input number of persons you want to book "
                + "a table for");

        int persons = scan.nextInt();

        Table tbl;
        if (persons <= 2) {

            for (int i = 0; i < smallTables.length; ++i) {
                if(!smallTables[i].isFull()){
                    smallTables[i].getATableBooked();
                }
            }
//book a small table for them if available

        } else if (persons > 2 && persons <= 4) {
            //book a medium table for them
            tbl = new MediumTable();
            if (tbl.getATableBooked()) {
                System.out.println("Congratulations your table has been booked.");
            }
        } else if (persons > 4 && persons <= 6) {
            //book a large table for them
            tbl = new LargeTable();
            if (tbl.getATableBooked()) {
                System.out.println("Congratulations your table has been booked.");
            }
        } else if (persons > 6 && persons <= 12) {
            //book a extra large table for them
            tbl = new LargeTable();//Extralarge table
            if (tbl.getATableBooked()) {
                System.out.println("Congratulations your table has been booked.");
            }
        }

        System.out.println("Welcome to Restaurant Reservation System");

        System.out.println("Welcome to Restaurant Reservation System");

        System.out.println("Welcome to Restaurant Reservation System");

    }
}
