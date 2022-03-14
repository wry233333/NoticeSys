
drop database if exists BookSys_db;
create database BookSys_db;
use BookSys_db;

create table user(
    id bigint AUTO_INCREMENT primary key ,
    username varchar(32) not null unique,
    password varchar(32) not null,
    gender varchar(4),
    email varchar(64) not null
);
insert into user values (null,'zhangsan','1234','男','12345@china.gov.cn');

select * from user;

create table bookClasses(
    c_id int not null auto_increment primary key ,
    name varchar(32)
);
insert into bookClasses values (null,'计算机类');
insert into bookClasses values (null,'生活类');
insert into bookClasses values (null,'学术类');
select * from bookClasses;

create table book(
    b_id bigint auto_increment primary key ,
    name varchar(64) not null ,
    publisher varchar(64),
    author varchar(64) not null ,
    date date,
    info varchar(64),
    context varchar(1024),
    c_id int,
    constraint foreign key (c_id) references bookClasses(c_id)
);
insert into book values (null,'计算机组成原理','机械工业出版社','未知','2001-7-25','url','书籍内容简介','1');

select * from book;


create table list(
    l_id bigint primary key auto_increment,
    id bigint ,
    b_id bigint,
    return_date date not null ,
    borrow_date date not null ,
    rel_date date,
    constraint Fk1 foreign key list(id) references user(id),
    constraint Fk2 foreign key list(b_id) references book(b_id)
);
insert into list values (null,'1','1','2021-7-22','2021-7-10',null);
select * from list;

create table admin(
    id bigint,
    class varchar(32),
    level tinyint,
    constraint foreign key admin(id) references user(id)
);
insert into admin values ('1','图书管理员','1');
select * from admin;
