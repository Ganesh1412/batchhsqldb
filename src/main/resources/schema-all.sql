DROP TABLE data IF EXISTS;

CREATE TABLE data  (
                         id VARCHAR(30) IDENTITY NOT NULL PRIMARY KEY,
                         type VARCHAR(20),
                         state VARCHAR(20),
                         timestamp TIMESTAMP,
                         host VARCHAR(20)
);
