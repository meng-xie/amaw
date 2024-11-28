
-- Database: amawdb

-- DROP DATABASE IF EXISTS amawdb;

CREATE DATABASE amawdb
    WITH
    OWNER = postgres
    ENCODING = 'UTF8'
    LC_COLLATE = 'C'
    LC_CTYPE = 'C'
    LOCALE_PROVIDER = 'libc'
    TABLESPACE = pg_default
    CONNECTION LIMIT = -1
    IS_TEMPLATE = False;


CREATE TABLE myuser (
  userid int ,
  username VARCHAR(255),
  address VARCHAR(255),
    city VARCHAR(255)

);


insert into myuser (userid,username,address,city) values(1,'firstuser','abc','mycity');
commit;
