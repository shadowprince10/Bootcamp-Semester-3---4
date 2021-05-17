USE OOVEO_Salon

SELECT *
FROM MsTreatmentType
WHERE TreatmentTypeId = 'TT002' OR TreatmentTypeId = 'TT003'

SELECT *
FROM MsCustomer as c
WHERE c.CustomerId = hss.CustomerId AND PaymentType = 'Credit'

SELECT *
FROM MsCustomer as c
WHERE c.CustomerId not in (
	SELECT 'CU001', 'CU002'
)
-- IN -> hanya boleh satu row

SELECT *
FROM MsCustomer as c
WHERE c.CustomerId not in (
	SELECT 'CU001'
)

SELECT *
FROM MsCustomer as c
WHERE c.CustomerId not in (
	SELECT hss.CustomerId -- harus satu kolom isinya
	-- EXIST: cek query ini apabila dijalankan, apakah ada output-nya
	FROM HeaderSalonServices as hss
	WHERE PaymentType = 'Credit'
)

-- CU001 hasilnya ada tidak? Ada, dioutputkan
-- dst

-- Assignment ada soal 4 -> Subquery

SELECT *
FROM MsCustomer as c
WHERE c.CustomerId not in (
	SELECT 'CU001', 'CUU002'
)
-- nomor 1 dan 3

-- subquery: bisa lebih dari 2 table
-- IN : tidak harus pakai subquery, tapi bisa juga pakai list; menjalankan sekali saja
-- EXIST: harus subquery; menjalankan untuk semua row

-- kalau di C
-- analogi EXIST in C Code
FOR (int i = 0; i < 10; i++)
	FOR (int j = 0; j < 5; j++)
		IF (condition) break



-- 1. Display TreatmentId and TreatmentName for every treatment, which ID is 'TM001' or 'TM002'
-- (in)
SELECT TreatmentId, TreatmentName
FROM MsTreatment
WHERE TreatmentId in ('TM001', 'TM002')

-- cara pengerjaan nomor 2 seperti nomor 1

-- 3. Display CustomerName, CustomerPhone, and CustomerAddress for every customer whose name is more than 8 characters and did transactions on Friday
-- (len, in, datename, weekday)
SELECT *
FROM MsCustomer
WHERE LEN(CustomerName) > 8 and c.CustomerId in (
	SELECT hss.CustomerId -- jangan *, beri alias supaya output langsung keluar
	-- id yang ada di HSS
	FROM HeaderSalonServices as hss
	WHERE DATENAME(WEEKDAY, TransactionDate) = 'Friday'
)

SELECT c.CustomerName, c.CustomerPhone, c.CustomerAddress
FROM MsCustomer as c
WHERE LEN(CustomerName) > 8 and EXISTS (
	SELECT hss.CustomerId -- jangan *, beri alias supaya output langsung keluar
	-- hss.CustomerId = id yang ada di HSS
	-- hss digunakan supaya supaya nama kolom keluar sehingga tidak usah menghafalkan nama kolom
	FROM HeaderSalonServices as hss
	WHERE DATENAME(WEEKDAY, TransactionDate) = 'Friday'
)

SELECT *
FROM MsStaff
WHERE StaffSalary <= ALL (
	SELECT StaffSalary
	FROM MsStaff
	-- compare semuanya satu-satu dari paling atas
	-- sesuai abjad
	-- asalkan nama <=, dia akan mengeluarkan
	-- kalau hilang =, tidak akan mengeluarkan nama tertinggi
)

SELECT *
FROM MsStaff
WHERE StaffSalary < ANY (
	SELECT StaffSalary
	FROM MsStaff
)
ORDER BY StaffPhone
-- tidak berpengaruh
-- kalau di luar bisa, tapi di dalam tidak bisa

-- cari staff yang gajinya paling tinggi dan paling rendah
-- hasil yang tertinggi dulu, baru terendah dengan UNION

-- hanya empat karena paling atas 150 juta
-- 150 juta di-compare dengan semua
-- tidak memenuhi dengan semua kondisinya
-- tidak ada yang lebih kecil dari dia
-- 10 juta dikeluarkan karena memenuhi sekali (< 150 juta)
-- akan mengeluarkan semua kecuali gaji tertinggi

-- terkecil baru terbesar
SELECT *
FROM MsStaff
WHERE StaffSalary <= ALL (
	SELECT StaffSalary
	FROM MsStaff
	-- compare semuanya satu-satu dari paling atas
	-- sesuai abjad
	-- asalkan nama <=, dia akan mengeluarkan
	-- kalau hilang =, tidak akan mengeluarkan nama tertinggi
)
UNION
SELECT *
FROM MsStaff
WHERE StaffSalary >= ALL (
	SELECT StaffSalary
	FROM MsStaff
)

-- tetap disort meski terbalik karena mengikuti primary key-nya
-- row terbalik dll -> disalahkan oleh BINUS
-- kalau mengerjakan tidak diminta soal, dikurangi nilai untuk nomor tersebut

-- Number 8
SELECT tt.TreatmentTypeName, 
FROM MsTreatment as t
JOIN (
	SELECT AVG(PRICE) as average
	FROM MsTreatment
) as avgPrice on t.Price > avgPrice.average
JOIN MsTreatmentType as tt ON t.TreatmentTypeId = tt.TreatmentTypeId
