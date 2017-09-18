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
public class Seat {
    
    /* The name of the seat. */
    private String name;
    
    /* The row number. */
    private int rowNumber;
    
    /* The column number. */
    private int columnNumber;
    
    /* Seat is filled. */
    private boolean isFilled = false;
    
    /* The plane. */
    private Plane plane;
    
    /* The seat layout group. */
    private LayoutGroup seatLayoutGroup; 

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
     * @return the rowNumber
     */
    public int getRowNumber() {
        return rowNumber;
    }

    /**
     * @param rowNumber the rowNumber to set
     */
    public void setRowNumber(int rowNumber) {
        this.rowNumber = rowNumber;
    }

    /**
     * @return the columnNumber
     */
    public int getColumnNumber() {
        return columnNumber;
    }

    /**
     * @param columnNumber the columnNumber to set
     */
    public void setColumnNumber(int columnNumber) {
        this.columnNumber = columnNumber;
    }

    /**
     * @return the isFilled
     */
    public boolean isIsFilled() {
        return isFilled;
    }

    /**
     * @param isFilled the isFilled to set
     */
    public void setIsFilled(boolean isFilled) {
        this.isFilled = isFilled;
    }

    /**
     * @return the plane
     */
    public Plane getPlane() {
        return plane;
    }

    /**
     * @param plane the plane to set
     */
    public void setPlane(Plane plane) {
        this.plane = plane;
    }

    /**
     * @return the seatLayoutGroup
     */
    public LayoutGroup getSeatLayoutGroup() {
        return seatLayoutGroup;
    }

    /**
     * @param seatLayoutGroup the seatLayoutGroup to set
     */
    public void setSeatLayoutGroup(LayoutGroup seatLayoutGroup) {
        this.seatLayoutGroup = seatLayoutGroup;
    }

}
