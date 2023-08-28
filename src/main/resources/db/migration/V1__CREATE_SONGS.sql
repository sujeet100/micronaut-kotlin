CREATE TABLE songs (
    song_id serial PRIMARY KEY,
    title VARCHAR ( 50 ) UNIQUE NOT NULL,
    artist VARCHAR ( 50 ) NOT NULL,
    album VARCHAR ( 50 ) NOT NULL,
    year VARCHAR ( 50 ) NOT NULL,
    genre VARCHAR ( 50 ) NOT NULL,
    created_on TIMESTAMP NOT NULL
);