# Arun-kulukkal

table-->1
prize details:

prize id (p) int ,
prizes varchar .

table-->2

customer:

  token.no--> (p) int ,
 passbook.no-->unique varchar ,
name varchar ,
address varchar ,
mobile.number varchar ,
pid (f) int .

1) create database arunkulukkal;

2) use arunkulukkal;

3) create table prizes(pid int auto_increment primary key,prizes varchar(100) not null);

4) create table customer(tno int auto_increment primary key,pnumber varchar(100) not  null,name varchar(100) not null,address varchar(100) not null,mnumber varchar(100) not null,pid int not null,foriegn key(pid) references prizes(pid),unique(pnumber);
 
