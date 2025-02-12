package com.movieticketbooking.ui;

import com.movieticketbooking.service.MovieService;
import com.movieticketbooking.service.BookingService;
import com.movieticketbooking.model.Movie;

import java.util.List;
import java.util.Scanner;

public class ConsoleUI {
    private static final MovieService movieService = new MovieService();
    private static final BookingService bookingService = new BookingService();
    private static final Scanner scanner = new Scanner(System.in);

    public static void displayMenu() {
        while (true) {
            System.out.println("\n--- Movie Ticket Booking System ---");
            System.out.println("1. View Movies");
            System.out.println("2. Book a Ticket");
            System.out.println("3. View Bookings");
            System.out.println("4. Exit");
            System.out.print("Choose an option: ");
            
            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1 -> viewMovies();
                case 2 -> bookTicket();
                case 3 -> viewBookings();
                case 4 -> {
                    System.out.println("Exiting... Thank you!");
                    return;
                }
                default -> System.out.println("Invalid choice. Try again.");
            }
        }
    }

    private static void viewMovies() {
        List<Movie> movies = movieService.getMovies();
        System.out.println("\nAvailable Movies:");
        for (Movie movie : movies) {
            System.out.println(movie.getId() + ". " + movie.getTitle() + " (" + movie.getGenre() + ")");
        }
    }

    private static void bookTicket() {
        System.out.print("\nEnter your name: ");
        String userName = scanner.nextLine();
        
        viewMovies();
        System.out.print("\nSelect a movie by ID: ");
        int movieId = scanner.nextInt();
        
        System.out.print("Enter seat number: ");
        int seatNumber = scanner.nextInt();
        
        bookingService.bookTicket(movieId, seatNumber, userName);
    }

    private static void viewBookings() {
        System.out.println("\nBooking Details:");
        bookingService.getBookings().forEach(b ->
            System.out.println("User: " + b.getUserName() + ", Movie ID: " + b.getMovieId() + ", Seat: " + b.getSeatNumber()));
    }
}
