/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 * Author:  Michael
 * Created: 03-10-2016
 */
USE ca2;
DROP TABLE IF EXISTS PERSON;
DROP TABLE IF EXISTS HOBBY;

CREATE TABLE PERSON(
    firstName VARCHAR(40),
    lastName VARCHAR(40),
    fk_id INT,
    FOREIGN KEY(fk_id) REFERENCES infoentity(id)
);

CREATE TABLE HOBBY(
	hobbyName VARCHAR(40),
    description VARCHAR(100),
    fk_id INT,
    FOREIGN KEY(fk_id) REFERENCES infoentity(id)
);

INSERT INTO PERSON VALUES ('','');


INSERT INTO HOBBY VALUES ('','');

SELECT * FROM PERSON;
SELECT * FROM HOBBY;
