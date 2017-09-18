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
    
    /* The plane seat. */
    private Seat seat;
    
    /* The layout group. */
    private LayoutGroup layoutGroup;

    /**
     * @return the seat
     */
    public Seat getSeat() {
        return seat;
    }

    /**
     * @param seat the seat to set
     */
    public void setSeat(Seat seat) {
        this.seat = seat;
    }

    /**
     * @return the layoutGroup
     */
    public LayoutGroup getLayoutGroup() {
        return layoutGroup;
    }

    /**
     * @param layoutGroup the layoutGroup to set
     */
    public void setLayoutGroup(LayoutGroup layoutGroup) {
        this.layoutGroup = layoutGroup;
    }

}
