/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.plane;

import com.example.plane.domain.Seat;
import com.example.plane.domain.SeatLayout;
import com.example.plane.domain.LayoutGroup;
import com.example.plane.domain.SeatLayoutGroup;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;
import javafx.print.Collation;

/**
 *
 * @author U43718
 */
public class Application {
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        Application application = new Application();
        
        
        SeatLayout seatLayout = application.designPlaneSeatLayout(input);
        List<LayoutGroup> layoutGroups = application.groupingPlaneSeatLayout(input, seatLayout);
        Seat[][] seats = application.designPlaneSeats(seatLayout, layoutGroups);
        List<SeatLayoutGroup> seatLayoutGroups = application.seatGrouping(seatLayout, layoutGroups, seats);

        //To print the seat
        application.printSeat(seatLayout, seats, layoutGroups);
        
//        System.out.println(" <====== Select seat ====> ");
//        System.out.println("Enter seat count : ");
//        int seatCount = input.nextInt();

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
    private List<LayoutGroup> groupingPlaneSeatLayout(Scanner input, SeatLayout seatLayout) {
        
        System.out.println("Group your seat layout: ");
        System.out.println("Enter the total number of groups in layout : ");
        int numberOfgroups = input.nextInt();
        
        List<LayoutGroup> layoutGroups = new ArrayList<>();
        for(int i = 0; i < numberOfgroups; i++) {
            System.out.println("Enter the group  " + i + " columns :");
            int numberOfColumns = input.nextInt();
            LayoutGroup seatLayoutGroup = new LayoutGroup();
            seatLayoutGroup.setName("Group"+i);
            seatLayoutGroup.setNumberOfColumns(numberOfColumns);
            seatLayoutGroup.setSeatLayout(seatLayout);
            layoutGroups.add(seatLayoutGroup);
        }
        return layoutGroups;
    }
    
    /**
     * To design plane seat. 
     * @param seatLayout the seat layout.
     * @param layoutGroups the seat layout groups.
     * @return the designPlaneSeats.
     */
    private Seat[][] designPlaneSeats(SeatLayout seatLayout, List<LayoutGroup> layoutGroups) {
        int rows = seatLayout.getRows();
        int columns = seatLayout.getColumns();
        Seat[][] seats = new Seat[rows][columns];
        
        for(int i = 0; i < seatLayout.getRows(); i++) {
            char c = 'A';
            for(int j = 0; j < seatLayout.getColumns(); j++) {
                Seat seat = new Seat();
                String name = String.valueOf(i+1) + String.valueOf(c);
                c++;
                seat.setName(name);
                seat.setRowNumber(i);
                seat.setColumnNumber(j);
                seat.setIsFilled(false);
                seats[i][j] = seat;
            }
            
        }
        return seats;
    }
    
    /**
     * To grouping the plan seats. 
     * @param seatLayout the seat layout.
     * @param layoutGroups the seat layout groups.
     * @param seats the seats.
     * @return the designPlaneSeats.
     */
    private List<SeatLayoutGroup> seatGrouping(SeatLayout seatLayout, List<LayoutGroup> layoutGroups, Seat[][] seats) {
        List<SeatLayoutGroup> seatLayoutGroups = new ArrayList<>();
        int seatColumnIndex = 0;
        for (LayoutGroup layoutGroup: layoutGroups) {
            System.out.println("layoutGroup: "+layoutGroup.getNumberOfColumns());
            for(int i = 0; i < seatLayout.getRows(); i++) {
                for(int j = seatColumnIndex; j < seatColumnIndex + layoutGroup.getNumberOfColumns(); j++) {
                    SeatLayoutGroup seatLayoutGroup = new SeatLayoutGroup();
                    seatLayoutGroup.setLayoutGroup(layoutGroup);
                    seatLayoutGroup.setSeat(seats[i][j]);
                    seatLayoutGroups.add(seatLayoutGroup);
                }   
            }
            seatColumnIndex = seatColumnIndex + layoutGroup.getNumberOfColumns();
        }
        return seatLayoutGroups;
    }
    
    /**
     * To print the seat.
     * 
     * @param seatLayout
     * @param seats
     * @param layoutGroups 
     */
    private void printSeat(SeatLayout seatLayout, Seat[][] seats, List<LayoutGroup> layoutGroups) {
        
        System.out.println(" <======= Available seats ========>" );

        for (int i = 0; i <  seatLayout.getRows(); i++) {
            for (int j = 0; j < seatLayout.getColumns(); j++) {

                System.out.print(seats[i] [j].getName() + " ");
            }
            System.out.println("\n");
        }

        System.out.println(" <======= Available seats by group ========>" );
        
        for(int i = 0; i < seatLayout.getRows(); i++) {

            int index = 0;
            int x = 1;
            for(LayoutGroup layoutGroup: layoutGroups) {
//                    System.out.print(layoutGroup.getName() + " ");
                for(int j = index; j < index + layoutGroup.getNumberOfColumns(); j++) {
                    System.out.print(seats[i] [j].getName() + " ");
                }
                index = index + layoutGroup.getNumberOfColumns();
                if( x < layoutGroups.size()) {
                    System.out.print(" |  ");
                }
                x++;
            }
            System.out.println("\n");
        } 
    }
    
}
