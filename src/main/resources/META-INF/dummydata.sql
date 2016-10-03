/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 * Author:  xboxm
 * Created: 03-10-2016
 */

USE ca2;

CREATE TABLE cityinfo (
    zipcode INT PRIMARY KEY,
    city VARCHAR(50) UNIQUE
);

CREATE TABLE infoentity (
    id INT PRIMARY KEY AUTO_INCREMENT,
    email VARCHAR(50) UNIQUE
);

CREATE TABLE phone (
    pnum VARCHAR(8) PRIMARY KEY,
    description VARCHAR(50),
    FOREIGN KEY(fk_id) REFERENCES infoentity(id)
);

CREATE TABLE person (
    firstName VARCHAR(40),
    lastName VARCHAR(40),
    fk_id INT,
    FOREIGN KEY(fk_id) REFERENCES infoentity(id)
);

CREATE TABLE hobby(
    hobbyName VARCHAR(40),
    description VARCHAR(100),
    fk_id INT,
    FOREIGN KEY(fk_id) REFERENCES infoentity(id)
);

CREATE TABLE address (
    street VARCHAR(40),
    additionalinfo VARCHAR(200),
    fk_id INT,
    fk_zipcode INT,
    FOREIGN KEY (fk_zipcode) REFERENCES cityinfo(zipcode),
    FOREIGN KEY (fk_id) REFERENCES infoentity(id)
);

CREATE TABLE company (
    vcr VARCHAR(8) UNIQUE,
    cname VARCHAR(100),
    description VARCHAR(200),
    no_of_employees INT,
    market_value INT,
    FOREIGN KEY (fk_id) REFERENCES infoentity(id)
);
