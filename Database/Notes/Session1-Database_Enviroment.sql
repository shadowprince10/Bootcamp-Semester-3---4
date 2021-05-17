--create database hello_world
--use hello_world
--drop database hello_world
use doto
select *
from Users
select UserId, UserName
from Users
select UserId, UserName, UserPassword, UserEmail
from Users
select *
from Users
where UserId = 'US001'
-- = < > <= >= 
-- tanda kutip pakai tanda kutip satu, bukan dua
-- where: kondisi
select *
from Users
where UserId = 'US001' or UserId = 'US002'

SeLeCT *
frOM Users
whErE UserId = 'us001' or UserId = 'uS002'
-- case insensitive

select *
from Equipments

-- dbo.Equipments
select *
from Equipments
where EquipmentPrice >= 12 AND EquipmentPrice <= 300
-- seni coding: bagaimana supaya orang lain mengerti

select *
from Equipments
where EquipmentPrice between 12 and 300

-- cara mendapatkan email yang berdomain gmail
-- menggunakan regex 
-- LIKE(REGEX)

-- cara mendapatkan username yang mengandung a
-- %% itu maksudnya string apapun
-- %a depannya boleh apa saja, tapi belakangnya harus a
-- like: apa saja
select *
from Users
where UserName like '%a%'
-- case insensitive

select *
from Users
where UserName like '%a'

select *
from Users
where UserName like 'a%'

select *
from Users
where UserEmail like '%@gmail.com'

select *
from Users
where not UserName like 's%'

-- UserName = '%a%'
-- akan menganggap username itu literally %a%




