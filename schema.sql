-- Create Movies Table
CREATE TABLE IF NOT EXISTS movies (
    id INTEGER PRIMARY KEY AUTOINCREMENT,
    title TEXT NOT NULL,
    genre TEXT NOT NULL
);

-- Create Seats Table
CREATE TABLE IF NOT EXISTS seats (
    id INTEGER PRIMARY KEY AUTOINCREMENT,
    movie_id INTEGER,
    seat_number INTEGER NOT NULL,
    is_booked BOOLEAN DEFAULT 0,
    FOREIGN KEY(movie_id) REFERENCES movies(id)
);

-- Create Bookings Table
CREATE TABLE IF NOT EXISTS bookings (
    id INTEGER PRIMARY KEY AUTOINCREMENT,
    movie_id INTEGER,
    seat_number INTEGER,
    user_name TEXT NOT NULL,
    booking_date TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
    FOREIGN KEY(movie_id) REFERENCES movies(id)
);

-- Insert Sample Movies
INSERT INTO movies (title, genre) VALUES ('Avengers: Endgame', 'Action');
INSERT INTO movies (title, genre) VALUES ('Inception', 'Sci-Fi');
INSERT INTO movies (title, genre) VALUES ('Titanic', 'Romance');

-- Insert Sample Seats (Assume each movie has 10 seats)
INSERT INTO seats (movie_id, seat_number) VALUES (1, 1);
INSERT INTO seats (movie_id, seat_number) VALUES (1, 2);
INSERT INTO seats (movie_id, seat_number) VALUES (1, 3);
INSERT INTO seats (movie_id, seat_number) VALUES (2, 1);
INSERT INTO seats (movie_id, seat_number) VALUES (2, 2);
INSERT INTO seats (movie_id, seat_number) VALUES (2, 3);
INSERT INTO seats (movie_id, seat_number) VALUES (3, 1);
INSERT INTO seats (movie_id, seat_number) VALUES (3, 2);
INSERT INTO seats (movie_id, seat_number) VALUES (3, 3);
