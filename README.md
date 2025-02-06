# Movie Ticket Booking System

A simple Movie Ticket Booking System implemented in Java. It allows users to view available movies, book tickets, and check seat availability for selected movies.

## Features

- **View Movies:** Users can view the list of movies available for booking.
- **Seat Availability:** Users can check available seats for the selected movie.
- **Booking Tickets:** Users can book available seats for movies.
- **Database Integration:** The system is integrated with a SQLite database for storing movie, seat, and booking information.

## Project Structure


## Setup Instructions

1. **Clone the Repository:**
    ```bash
    git clone https://github.com/yourusername/MovieTicketBooking.git
    cd MovieTicketBooking
    ```

2. **Database Setup:**
    - The `schema.sql` file contains the necessary SQL queries to create the required tables.
    - You can use any SQLite client to run the script and set up the database.

3. **Running the Project:**
    - Compile the project using `javac` or an IDE like IntelliJ or Eclipse.
    - Run the `MainUI.java` class to start the application.

4. **Maven Setup (Optional):**
    If you're using Maven, ensure to run the following command to set up dependencies:
    ```bash
    mvn install
    ```

## Technologies Used

- **Java 8+**
- **SQLite** (for database)
- **JDBC** (for database connection)
- **Maven** (for dependency management)

## Contributors

- Shriya sawant - Initial project setup, logic, and database integration.


