
drop database if exists NoticeSys_db;
create database NoticeSys_db;
use NoticeSys_db;
create table user(
    username varchar(32),
    password varchar(32),
    gender varchar(4),
    email varchar(32)
);
insert into user values ('zhangsan','1234','男','12345@china.gov.cn');
select * from user;

create table notice(
    name varchar(64),
    info varchar(256),
    context varchar(1048),
    institute varchar(32)
);
insert into notice values ('计算机公告1','公告简介','2021年，在教育部、省市教育工委等举办的党建、思政类评选中，我校获得高级别奖项和优秀组织奖93项，其中一等奖12项；《翰墨丹青绘党史》获全省高校精品党课；张龙同志获评全省高校‘优秀党史宣讲员’；17人获评珠海市委和教育系统优秀党员及党务工作者，2个基层党总支获评‘先进基层党组织’。”这一组亮眼的数据，是党委书记李晋平在3月2日召开的全校党史学习教育总结大会上谈到的成绩','计算机学院');
insert into notice values ('计算机公告2','公告简介','公告详情','计算机学院');
insert into notice values ('计算机公告3','公告简介','公告详情','计算机学院');
insert into notice values ('商学院公告1','公告简介','公告详情','商学院');
insert into notice values ('商学院公告2','公告简介','公告详情','商学院');
insert into notice values ('商学院公告3','公告简介','公告详情','商学院');
insert into notice values ('数理学院公告1','公告简介','公告详情','数理学院');
insert into notice values ('数理学院公告2','公告简介','公告详情','数理学院');
insert into notice values ('数理学院公告3','公告简介','公告详情','数理学院');
insert into notice values ('外语学院公告1','公告简介','公告详情','外语学院');
insert into notice values ('外语学院公告2','公告简介','公告详情','外语学院');
insert into notice values ('外语学院公告3','公告简介','公告详情','外语学院');
insert into notice values ('马克思学院公告1','公告简介','公告详情','马克思学院');
insert into notice values ('马克思学院公告2','公告简介','公告详情','马克思学院');
insert into notice values ('马克思学院公告3','公告简介','公告详情','马克思学院');
select * from notice;

create table institute(
    name varchar(32)
);
insert into institute values ('计算机学院');
insert into institute values ('数理学院');
insert into institute values ('商学院');
insert into institute values ('外语学院');
insert into institute values ('马克思学院');
select * from institute;