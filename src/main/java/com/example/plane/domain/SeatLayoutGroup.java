/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.plane.domain;

/**
 *
 * @author U43718
 */
public class SeatLayoutGroup {
    
    /* The name of the group. */
    private String name;
    
    /* The seat layout */
    private SeatLayout seatLayout;
    
    /* The number of columns. */
    private int numberOfColumns;

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return the seatLayout
     */
    public SeatLayout getSeatLayout() {
        return seatLayout;
    }

    /**
     * @param seatLayout the seatLayout to set
     */
    public void setSeatLayout(SeatLayout seatLayout) {
        this.seatLayout = seatLayout;
    }

    /**
     * @return the numberOfColumns
     */
    public int getNumberOfColumns() {
        return numberOfColumns;
    }

    /**
     * @param numberOfColumns the numberOfColumns to set
     */
    public void setNumberOfColumns(int numberOfColumns) {
        this.numberOfColumns = numberOfColumns;
    }
  
}
