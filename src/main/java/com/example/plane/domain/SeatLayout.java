/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.plane.domain;

import java.util.List;

/**
 *
 * @author U43718
 */
public class SeatLayout {
    
    /* The layout name.*/
    private String name;
    
    /* The total number of rows. */
    private int rows;
    
    /* The total number of columns. */
    private int columns;
    
    /* The plane. */
    private Plane plane;
    
    /* The seat layoput groups. */
    private List<LayoutGroup> seatLayoutGroups;

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
     * @return the rows
     */
    public int getRows() {
        return rows;
    }

    /**
     * @param rows the rows to set
     */
    public void setRows(int rows) {
        this.rows = rows;
    }

    /**
     * @return the columns
     */
    public int getColumns() {
        return columns;
    }

    /**
     * @param columns the columns to set
     */
    public void setColumns(int columns) {
        this.columns = columns;
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
     * @return the seatLayoutGroups
     */
    public List<LayoutGroup> getSeatLayoutGroups() {
        return seatLayoutGroups;
    }

    /**
     * @param seatLayoutGroups the seatLayoutGroups to set
     */
    public void setSeatLayoutGroups(List<LayoutGroup> seatLayoutGroups) {
        this.seatLayoutGroups = seatLayoutGroups;
    }
   
}
