DROP TABLE IF EXISTS USERS;

CREATE TABLE USERS (
  USER_ID INT AUTO_INCREMENT NULL  PRIMARY KEY,
  USER_NAME VARCHAR(50) NOT NULL,
  USER_EMAIL VARCHAR(50) NOT NULL
);