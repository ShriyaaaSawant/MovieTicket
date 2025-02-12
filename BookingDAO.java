package com.movieticketbooking.db;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class BookingDAO {
    public static boolean bookTicket(int movieId, int seatNumber, String userName) {
        String query = "INSERT INTO bookings (movie_id, seat_number, user_name) VALUES (?, ?, ?)";

        try (Connection conn = DatabaseConnection.getConnection();
             PreparedStatement pstmt = conn.prepareStatement(query)) {

            pstmt.setInt(1, movieId);
            pstmt.setInt(2, seatNumber);
            pstmt.setString(3, userName);
            return pstmt.executeUpdate() > 0;

        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
    }
}
