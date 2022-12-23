create table USERS (
id bigint not null,
email varchar(255),
name varchar(255),
user_name varchar(255),
password varchar(255),
role varchar(255),
primary key (id));

INSERT INTO USERS (id,name,user_name, password, email, role) VALUES
  (1,'Charlie Gamboa','cgamboa','123456' ,'carlosgamboa15@gmail.com', 'ADMIN');