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
public class Plane {
    
    /* The name of plane.*/
    private String name;
    
    /* The clor of the plane. */
    private String color;
    
    /* The seat layout. */
    private SeatLayout seatLayout;

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
     * @return the color
     */
    public String getColor() {
        return color;
    }

    /**
     * @param color the color to set
     */
    public void setColor(String color) {
        this.color = color;
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
    
    
}
