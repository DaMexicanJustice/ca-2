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

CREATE TABLE CITYINFO (
    ZIP VARCHAR(5) PRIMARY KEY,
    CITY VARCHAR(50)
);

CREATE TABLE address (
    addressid INT PRIMARY KEY AUTO_INCREMENT,
    street VARCHAR(40),
    additionalinfo VARCHAR(200),
    fk_zipcode VARCHAR(5),
    FOREIGN KEY (fk_zipcode) REFERENCES cityinfo(zip)
);

CREATE TABLE infoentity (
    id INT PRIMARY KEY AUTO_INCREMENT,
    email VARCHAR(50) UNIQUE,
    typeof VARCHAR(20),
    fk_addressid INT,
    FOREIGN KEY (fk_addressid) REFERENCES address(addressid)
);

CREATE TABLE company (
    cid INT PRIMARY KEY REFERENCES infoentitiy(id),
    cvr VARCHAR(8) UNIQUE,
    cname VARCHAR(100),
    description VARCHAR(200),
    no_of_employees INT,
    market_value INT
);

CREATE TABLE person (
    pid INT PRIMARY KEY REFERENCES infoentitiy(id),
    firstName VARCHAR(40),
    lastName VARCHAR(40)
);

CREATE TABLE hobby(
    hobbyid INT PRIMARY KEY AUTO_INCREMENT,
    hobbyName VARCHAR(40),
    description VARCHAR(100),
    fk_pid INT,
    FOREIGN KEY(fk_pid) REFERENCES person(pid)
);

CREATE TABLE phone (
    pnum VARCHAR(8) PRIMARY KEY,
    description VARCHAR(50),
    fk_id INT,
    FOREIGN KEY(fk_id) REFERENCES infoentity(id)
);

