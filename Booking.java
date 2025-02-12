package com.movieticketbooking.model;

public class Booking {
    private int id;
    private int movieId;
    private int seatNumber;
    private String userName;

    public Booking(int id, int movieId, int seatNumber, String userName) {
        this.id = id;
        this.movieId = movieId;
        this.seatNumber = seatNumber;
        this.userName = userName;
    }

    public int getId() { return id; }
    public int getMovieId() { return movieId; }
    public int getSeatNumber() { return seatNumber; }
    public String getUserName() { return userName; }
}
