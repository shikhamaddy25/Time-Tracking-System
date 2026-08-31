CREATE DATABASE time_tracking;
USE time_tracking;

CREATE TABLE users (
    id INT PRIMARY KEY,
    name VARCHAR(50),
    email VARCHAR(50),
    role VARCHAR(10)
);

CREATE TABLE timelogs (
    log_id INT PRIMARY KEY,
    user_id INT,
    date VARCHAR(20),
    hours INT,
    task VARCHAR(100)
);
