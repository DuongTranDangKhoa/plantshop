use master
go
create database PlantShop
go
use PlantShop
go
create table Category
(
id int primary key,
name varchar(30)
)
go
create table Plant
(
id int primary key,
name varchar(30),
price int,
imgPath varchar(50),
[description] text,
[status] int,
[categoryId] int references Category(id)
)
go
insert into Category values
(1, 'Monstera'),
(2, 'Rose')
go
insert into Plant values
(1, 'Dark Green Monstera Deliciosa',100, 'p1.jpg','Vietnamese Dark Green Monstera Deliciosa',1,1),
(2, 'Light Green Monstera Deliciosa',200,'p2.jpg','Vietnamese Light Green Monstera Deliciosa',1,1),
(3, 'White Monstera Deliciosa',280,'p3.jpg','Vietnamese White Monstera Deliciosa',1,1),
(4, 'Green Monstera Deliciosa',82,'p4.jpg','Vietnamese Green Monstera Deliciosa',1,1),
(5, 'Pink Rose',120,'p5.jpg','Vietnamese Pink Rose',1,2),
(6, 'Black Rose',280,'p6.jpg','Vietnamese Black Rose',1,2),
(7, 'Red Rose',160,'p7.jpg','Vietnamese Red Rose',1,2),
(8, 'Yellow Rose',150,'p8.jpg','Vietnamese Yellow Rose',1,2)
go