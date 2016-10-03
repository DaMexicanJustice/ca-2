USE ca2;

CREATE TABLE cityinfo (
	zipcode VARCHAR(5) PRIMARY KEY,
    city VARCHAR(40)
);

CREATE TABLE address (
	street varchar(40),
    additionalinfo VARCHAR(200),
    fk_id INT,
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