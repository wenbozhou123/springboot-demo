create database springboot CHARACTER SET utf8 COLLATE utf8_general_ci;

drop table if exists t_user;
create table t_user(
  uid int not null,
  name varchar(100),
  pwd varchar(100),
  primary key (uid)
) charset=utf8 ENGINE=InnoDB;

insert into t_user(uid, name, pwd) values(1,'name01', 'name01Pwd');
insert into t_user(uid, name, pwd) values(2,'name02', 'name02Pwd');
insert into t_user(uid, name, pwd) values(3,'name03', 'name03Pwd');