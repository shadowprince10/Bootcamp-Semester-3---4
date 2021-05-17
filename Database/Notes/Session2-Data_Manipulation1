CREATE DATABASE session2
USE session2
-- buat table yang bernama Heros
CREATE TABLE Heroes (
	HeroId CHAR(5) PRIMARY KEY,
	HeroName VARCHAR(255), 
	-- nama bisa beda panjangnya. Sebagai Primary Key, tidak ditambahkan NOT NULL karena sudah pasti, Primary Key tidak boleh NULL
	HeroType VARCHAR(10), 
	-- Melee and Range (panjangnya bisa various)
	HeroAttribute CHAR(3) NOT NULL
		CHECK(HeroAttribute like 'int' or HeroAttribute like 'str' or HeroAttribute like 'agi')
	-- strength, agility, intelligence (MOBILE LEGEND)
)

CREATE TABLE Equipments (
	EquipmentId CHAR(5),
	HeroId CHAR(5), 
	-- FOREIGN KEY REFERENCES Heroes(HeroId)
	-- REFERENCES untuk references ke Heroes
	EquipmentName VARCHAR(255),
	EquipmentRarity VARCHAR(20),
	EquipmentPrice INT DEFAULT 0,
	CONSTRAINT EquipmentsPK PRIMARY KEY(EquipmentId),
	CONSTRAINT EquipmentFK FOREIGN KEY(HeroId) REFERENCES Heroes(HeroId) 
		ON UPDATE CASCADE ON DELETE SET NULL
		-- pilihan ada ON UPDATE, CASCADE, dan ON DELETE
		-- SET NULL untuk menjaga referential integrity, mencegah error
		-- Equipment tetap mau ada
		-- Maka, ON DELETE kita set NULL
		-- beda set NULL dan delete
		-- NULL >> yang hilang hanya kolom itu, tidak kolom lainnya
	-- Hero Id Foreign Key
	-- kalau nama kolom boleh pakai titik koma, soalnya antara table satu dengan yang lain, namanya boleh sama
	-- nama kolom jangan sama
	-- tujuan nama EquipmentsPK: kalau error, tahu apa error tersebut
	-- table di-Query supaya lebih mudah
	-- kalau On Update, Cascade, dan On Delete Set Default, pasang default
)

ALTER TABLE Equipments
ADD HeroUseRate FLOAT DEFAULT 0

select *
from Equipments

ALTER TABLE Equipments
DROP COLUMN HeroUseRate

ALTER TABLE Equipments
ALTER COLUMN EquipmentName VARCHAR(200)

ALTER TABLE Heroes
ADD CONSTRAINT PKCheck CHECK(HeroId like 'HE[0-9][0-9][0-9]')
-- mesti HE diikuti dengan 3 angka di belakang

ALTER TABLE Heroes
DROP CONSTRAINT PKCheck

INSERT INTO Heroes (HeroId, HeroAttribute, HeroName, HeroType)
VALUES
('HE001', 'int', 'wukong', 'Melee')

INSERT INTO Heroes
VALUES
('HE002', 'test', 'Melee', 'agi')

-- hanya integer yang bisa di-increment

INSERT INTO HEROES(HeroId, HeroAttribute)
VALUES
('HE004', 'str'),
('HE005', 'int')
-- Hero Attribute tidak boleh NULL
-- kalau kalian tidak melanggar aturan constraint apapun,

select *
from Heroes

DELETE FROM Heroes
WHERE HeroId like 'HE001'

UPDATE Heroes
SET HeroName = 'Ben Alark', 
HeroType = 'Range'
WHERE HeroId like 'HE003'

select *
from Heroes

BEGIN TRAN
-- mulai transaksi
UPDATE Heroes
SET HeroName = NULL
-- update semua Hero

COMMIT
ROLLBACK
-- rollback, lalu select, dan kemudian kembali sebelum transaksi dimulai
-- COMMIT: unlock transaksi, kemudian langsung ter-save, save permanen
-- ROLLBACK harus di-block dan dijalani, tidak bisa Ctrl + Z untuk rollback
-- ROLLBACK >> kembali ke sebelum BEGIN TRAN: cancel transaction

-- Saat mau rollback, commit juga tidak apa-apa







-- kalau PK ada di master-nya, maka kalian bisa tidak insert value tersebut




DROP TABLE Equipments

-- Apabila HeroId diubah, di Equipment, HeroId juga akan berubah
-- Hero dengan HeroId HE001 misalkan di-delete, Equipment yang merefer ke HeroId HE001 akan menjadi NULL
