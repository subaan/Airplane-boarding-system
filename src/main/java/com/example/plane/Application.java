/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.plane;

import com.example.plane.domain.Seat;
import com.example.plane.domain.SeatLayout;
import com.example.plane.domain.SeatLayoutGroup;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author U43718
 */
public class Application {
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        Application application = new Application();
        SeatLayout seatLayout = application.designPlaneSeatLayout(input);
        List<SeatLayoutGroup> setLayoutGroups = application.groupingPlaneSeatLayout(input, seatLayout);
        List<Seat> seats = application.designPlaneSeats(seatLayout, setLayoutGroups);
        
        System.out.println(" <======= Available seats ========>" +seats);
        for(Seat seat: seats) {
             System.out.println(seat.getName() + " ");
//            for (int i = 0; i < seatLayout.getRows(); i++) {
//                for (int j = 0; j < seatLayout.getColumns(); j++) {
//                    
//                    System.out.println(seat.getName() + " ");
//                }
//                System.out.println("/n");
//            }
        }
       
        
//        System.out.println(" <======== Design your plane layout  =========>");
//        System.out.println("Enter the total number of rows in layout : ");
//        int rows = input.nextInt();
//        System.out.println("Enter the total number of columns in layout : ");
//        int columns = input.nextInt();
//        System.out.println("rows:" + rows +" : Columns: " + columns);
//        
//        SeatLayout seatLayout = new SeatLayout();
//        seatLayout.setName("Plane1 layout");
//        seatLayout.setRows(rows);
//        seatLayout.setColumns(columns);
//        
//        System.out.println("Group your seat layout: ");
//        System.out.println("Enter the total number of groups in layout : ");
//        int numberOfgroups = input.nextInt();
//        
//        List<SeatLayoutGroup> seatLayoutGroups = new ArrayList<SeatLayoutGroup>();
//        for(int i = 0; i < numberOfgroups; i++) {
//            System.out.println("Enter the group  " + i + " columns :");
//            int numberOfColumns = input.nextInt();
//            SeatLayoutGroup seatLayoutGroup = new SeatLayoutGroup();
//            seatLayoutGroup.setName("Group"+i);
//            seatLayoutGroup.setNumberOfColumns(numberOfColumns);
//            seatLayoutGroup.setSeatLayout(seatLayout);
//            seatLayoutGroups.add(seatLayoutGroup);
//        }
//        System.out.println("Enter the total number of groups in layout : ");
    }
    
    /**
     * The plane design layout.
     * 
     * @param inScanner the input scanner
     */
    private SeatLayout designPlaneSeatLayout(Scanner input) {
        
        System.out.println(" <======== Design your plane layout  =========>");
        System.out.println("Enter the total number of rows in layout : ");
        int rows = input.nextInt();
        System.out.println("Enter the total number of columns in layout : ");
        int columns = input.nextInt();
        System.out.println("rows:" + rows +" : Columns: " + columns);
        
        SeatLayout seatLayout = new SeatLayout();
        seatLayout.setName("Plane1 layout");
        seatLayout.setRows(rows);
        seatLayout.setColumns(columns);
        return seatLayout;

    }
    
    /**
     * Grouping the east layout.
     * @param seatLayout the seat Layout.
     * @param inScanner the input scanner.
     */
    private List<SeatLayoutGroup> groupingPlaneSeatLayout(Scanner input, SeatLayout seatLayout) {
        
        System.out.println("Group your seat layout: ");
        System.out.println("Enter the total number of groups in layout : ");
        int numberOfgroups = input.nextInt();
        
        List<SeatLayoutGroup> seatLayoutGroups = new ArrayList<SeatLayoutGroup>();
        for(int i = 0; i < numberOfgroups; i++) {
            System.out.println("Enter the group  " + i + " columns :");
            int numberOfColumns = input.nextInt();
            SeatLayoutGroup seatLayoutGroup = new SeatLayoutGroup();
            seatLayoutGroup.setName("Group"+i);
            seatLayoutGroup.setNumberOfColumns(numberOfColumns);
            seatLayoutGroup.setSeatLayout(seatLayout);
            seatLayoutGroups.add(seatLayoutGroup);
        }
        return seatLayoutGroups;
    }
    
    /**
     * To design plane seat. 
     * @param seatLayout the seat layout.
     * @param seatLayoutGroups the seat layout groups.
     * @return the designPlaneSeats.
     */
    private List<Seat> designPlaneSeats(SeatLayout seatLayout, List<SeatLayoutGroup> seatLayoutGroups) {
        List<Seat> seats = new ArrayList<Seat>();
        
        for(int i = 1; i < seatLayout.getRows() + 1; i++) {
            char c = 'A';
            for(int j = 0; j < seatLayout.getColumns(); j++) {
                Seat seat = new Seat();
                String name = String.valueOf(i) + String.valueOf(c);
                c++;
                seat.setName(name);
                seat.setRowNumber(i);
                seat.setColumnNumber(j);
                seat.setIsFilled(false);
                seats.add(seat);
            }
            
        }
        return seats;
    }
    
}
