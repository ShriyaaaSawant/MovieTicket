package com.movieticketbooking.model;

public class Seat {
    private int seatNumber;
    private boolean isBooked;

    public Seat(int seatNumber) {
        this.seatNumber = seatNumber;
        this.isBooked = false;
    }

    public int getSeatNumber() { return seatNumber; }
    public boolean isBooked() { return isBooked; }

    public void bookSeat() { this.isBooked = true; }
}
