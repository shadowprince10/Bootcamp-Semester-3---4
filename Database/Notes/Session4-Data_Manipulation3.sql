USE CoffeeShop

SELECT *
FROM Customer as c, HeaderTransaction as ht
where ht.CustomerID = c.CustomerID
-- output: jumlah Cartesian Product
-- setiap customer memiliki 10 transaksi (yang keluar kombinasi), maka jumlah Cartesian Product-nya itu 90
-- berhubungan dengan Primary Key dan Foreign Key
-- CustomerID yang menunjuk ke Primary Key customer
-- Buat join, biasanya kita harus samakan Foreign Key ke Primary Key
-- Child Table: Header Transaction, master table: Customer
-- foreign key yang menunjuk ke customer adalah CustomerID
-- kalau c.CustomerID = ht.CustomerID juga tidak apa-apa

SELECT *
FROM customer
-- ada customer ID

SELECT *
FROM HeaderTransaction

-- kombinasi semua customer dan Header Transaction
-- CS001 kita sambungkan dengan CS002 akan lebih berguna
-- Customer 2 pemilik Customer 1
-- kita bisa beri lihat suatu transaksi milik siapa dan tanggal berapa apabila digabungkan
-- biar ketahuan transaksi punya siapa (c.CustomerID = ht.CustomerID)
-- apabila join berdasarkan date, kita bisa lihat transaksi kapan saja)

SELECT *
FROM Customer as c
JOIN HeaderTransaction as ht on c.CustomerID = ht.CustomerID 
-- on untuk menuliskan mau join berdasarkan apa?

SELECT *
FROM Customer as c
JOIN HeaderTransaction as ht on c.CustomerID = ht.CustomerID
JOIN DetailTransaction as dt on ht.TransactionID = dt.TransactionID
-- join berdasarkan relasi

SELECT *
FROM Customer as c
LEFT JOIN HeaderTransaction as ht on c.CustomerID = ht.CustomerID
-- kalau kalian mau join, di kanannya table yang HeaderTransaction dan di kiri table yang Customer

SELECT *
FROM Customer as c
RIGHT JOIN HeaderTransaction as ht on c.CustomerID = ht.CustomerID

SELECT *
FROM DetailTransaction as dt
RIGHT JOIN Coffee as c on dt.CoffeeID = c.CoffeeID

-- tidak ada transaksi yang tidak ada Customernya, jadi beda table
-- pertama, dia dapat hasil INNER JOIN
-- kemudian di kiri, kita dapatkan NULL
-- kita tidak dapat mengisi di table 3 x 3
-- Left dan Right agak jarang, tapi bisa terpakai

SELECT *
FROM HeaderTransaction as ht
RIGHT JOIN Customer as c on ht.CustomerID = c.CustomerID
-- customer dan header digabung -> FULL OUTER JOIN: customer yang ada transaksi, transaksi yang tidak ada customer, dan customer yang tidak memiliki transaksi

SELECT *
FROM Customer as c
FULL JOIN HeaderTransaction as ht on c.CustomerID = ht.CustomerID

-- SET OPERATOR
-- SET A
SELECT CustomerID
FROM Customer
-- SET B
SELECT TransactionID
FROM HeaderTransaction

SELECT CustomerID
FROM Customer
UNION
SELECT TransactionID
FROM HeaderTransaction
-- tidak peduli duplikat

SELECT CustomerID, CustomerName
FROM Customer
UNION ALL
SELECT CustomerID, TransactionID
FROM HeaderTransaction

SELECT CustomerID
FROM Customer
INTERSECT
-- intersect adalah analogi INNER JOIN
-- SELECT DISTINCT: keluarkan yang unik
-- berarti yang ada transaksi Customer 1 - 6
-- apabila terdapat Customer 1 - 9, dia akan keluarkan semua customer yang transaksi
-- INTERSECT adalah irisan dari dua hasil query
-- INTERSECT untuk mendapatkan irisan dari dua hasil query
SELECT DISTINCT CustomerID
FROM HeaderTransaction

-- EXCEPT: customer yang tidak pernah belanja
SELECT CustomerID
FROM HeaderTransaction
EXCEPT
SELECT CustomerID
FROM Customer
-- hasil yang ada di A dan B dikeluarkan

-- contoh query akan diberikan, tetapi tidak sekarang

create database review
use review

create table customers (
	-- columns
	customer_id char(5)

	-- keys
	constraint PK_customers
		primary key(customer_id)

	-- constraints
	constraint customersCheckID
		check(customer_id like 'CS[0-9][0-9][0-9]')
)
