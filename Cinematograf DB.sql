create database Cinematograf;
use `Cinematograf`;

create table Client
(
	first_name varchar(10) not null,
    last_name varchar(10) not null,
    age integer not null
);
create table Cinema
(
	cinema_name varchar(20) not null
);
create table Film
(
	film_name varchar(20) not null,
    age_required integer not null,
    start_time varchar(10) not null,
    price float not null
);
create table Camera
(
	id integer primary key,
    capacity integer not null,
    randuri integer not null,
    coloane integer not null
);