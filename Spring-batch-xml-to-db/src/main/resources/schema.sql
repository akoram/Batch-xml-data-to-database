--DROP TABLE IF EXISTS person;
--
--CREATE TABLE person  (
--    personId INTEGER NOT NULL PRIMARY KEY,
--    firstName VARCHAR(40),
--    lastName VARCHAR(40),
--    email VARCHAR(100),
--    age INTEGER(100)
--);
DROP TABLE IF EXISTS person;
CREATE TABLE person  (
    person_id INTEGER NOT NULL PRIMARY KEY,
    first_name VARCHAR(40),
    last_name VARCHAR(40),
	code bigint,
	salary double precision,
	fresher boolean,
--	jdate date,
    email VARCHAR(100),
    age INTEGER
);