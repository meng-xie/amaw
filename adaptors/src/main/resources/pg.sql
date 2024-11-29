
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
  userid VARCHAR(255) ,
  username VARCHAR(255),
  cellphone int,
    email VARCHAR(255) ,
	passwords VARCHAR(255)

);



insert into myuser (userid,username,cellphone,email,passwords) values('1','firstuser', '4082323233' ,'myxj128@gmail.com','123');
commit;
