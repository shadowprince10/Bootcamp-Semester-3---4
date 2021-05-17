import java.util.ArrayList;
import java.util.Collection;
import java.util.Scanner;

public class main { // main

	public main() {
		// TODO Auto-generated constructor stub
	}

	// fungsi static: hanya bisa memanggil fungsi statis
	// static: hanya bisa memanggil fungsi yang memiliki keyword static atau fungsi yang bersifat static
	// void: tidak return apa-apa
	// public access modifier: hanya bisa diakses di package manapun
	// static method hanya dapat memanggil static method
	public static void main(String[] args) { // in main-nya
		// TODO Auto-generated method stub
		
		// Java SE 1.8 -> supaya sesuai dengan BINUS
		// src -> new -> class
		System.out.println("Hello World!");
		
		// byte b = 1000;
		// error karena 1000 sudah melebihi batas byte
		/*
		int sample = 1000;
		// default int sehingga tidak perlu diberi suffiks
		long sampleLong = 10000L;
		// L untuk memberitahu tipe data long
		long L = 2147483648L;
		float f = 3.142F;
		double sampleDouble = 20.50D;
		// yang membuat berbeda hanya suffiks saja
		int decInt = 7;
		int hexInt = 0x4CF;
		int binaryDecimal = 0b101010;
		*/
		int saldo = 60_000_000; // _ bisa dianggap seperti koma karena tidak akan dibaca oleh Java
		int bigNumber = (int) 1e6;
		// e default double untuk bilangan e sehingga harus di-convert ke integer
		System.out.println(saldo);
		

		 /*
		  * Casting
		  * Widening (otomatis): byte-short-int-long-float-double
		  * Narrowing: kebalikannya 
		 */
		
		// Widening
		/*
		byte iniByte = 10;
		short iniShort = iniByte;
		int iniInt = iniShort;
		
		// Narrowing
		int iniInt2 = 1000;
		// -128 sampai 127
		// iterasi sebanyak 1000 kali hingga menghasilkan -24
		// setelah 127, akan ada -128 dan akan jalan hingga 127, kemudian setelah 127, terdapat -128, dst.
		byte iniByte = (byte) iniInt2; // akan mengalami number overflow
		System.out.println(iniByte);
		*/
		
		// narrowing casting kurang berguna karena ujung-ujungnya number overflow 
		// specific use case di mana number overflow tidak masalah
		// sesuaikan dengan use case kamu
		// kalau price dari int di-convert menjadi byte: akan mengalami masalah
		// byte c = 127;
		
		/*
		// Character Value
		char Character = 'E';
		System.out.println(Character);
		
		// Boolean: hanya bisa True or False
		boolean isValidName = true;
		System.out.println(isValidName);
		
		// String
		String s1 = "Algorithm";
		String s2 = "Bootcamp";
		String name = "Ben Alark";
		// concatenation
		System.out.println(s1 + "" + s2);
		System.out.println(name.length());
		*/
		
		// Java: static type (data type yang tidak dapat berubah)
		// String name;
		// name = "Algorithm Bootcamp";
		// name = "Algorithm";
		// name = 100;
		// semua variabel di Java adalah static, tidak dapat berubah data type di mana sebenarnya banyak programming language support
		// penamaan variabel tidak boleh menggunakan whitespace (spasi, tab, enter, dll) dan tidak boleh seluruhnya menggunakan angka
		
		// Sejak Java 10, ada keyword yang namanya var
		// var -> tidak perlu pusing-pusing dengan data type
		// deklarasi harus disertai initialisasi
		// var name: error
		// var name = "The Mystic Prince";
		// Sangat jarang kita declare manual lagi
		// Kebanyakan projek menggunakan var
		
		// Secara default, variabel di Java dapat diubah
		// Dengan keyword final, variabel tidak dapat diubah
		// final double pi = 3.142;
		// pi = 4; // error
		// the final local variabel pi can't be assigned
		
		// Class: harus lebih spesifik dalam penentuan variabel
		// Saat mau nge-loop,
		
		// bisa langsung iterasi di names
		// kepakai di looping saat 
		// Java 8 -> harus tahu data type nama, tidak bisa pakai char
		
		/*
		for (String nama: names) {
			System.out.println(nama);
		}
		*/
		
		// System.out.println(pi);
		
		// Java berorientasi objek (nonprimitive)
		// Number (default 0), char (default '\u0000'), boolean (default false)
		// non-primitive data type => tidak punya default value sehingga dapat bernilai NULL
		// tipe data primitif tidak dapat memiliki method, sedangkan tipe data nonprimitif tidak bisa
		
		// int -> Integer
		// long -> Long
		
		// Integer number = 10;
		// Long bigNumber1 = 100000L;
		// Byte b = NULL; // default NULL
		// b = 100;
		// System.out.println(b);
		
		// kalau kita tidak validasi untuk NULL-nya
		// harus initialisasi, jangan dibiarkan NULL
		
		// Automatic Conversion between Primitive and Nonprimitive Variables
		int a = 100;
		Integer b = a;
		int c = b;
		
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		
		// semua non-primitive default-nya NULL
		
		// sebuah nilai primitif tidak support nilai NULL dari data primitif
		// Integer d = 100;
		// int e = d;
		
		// System.out.printf(format, args);
		System.out.printf("%s", "Ben Alark");
		System.out.print("Ben Alark");
		System.out.println("Ben Alark");
		
		Integer x = 10;
		// kelas nonprimitif harus langsung initialize
		// tapi bisa paksa print NULL dengan initialize varaibel nonprimitif NULL
		// initialize bebas
		// Integer -> function off, toString (convert angka menjadi string), toHexString (convert angka menjadi string hex decimal)
		// Method adalah bagian dari class
		// Kekurangan variable primitif karena sedikit lebih besar memori 
		// makanya masih di-prefer variable nonprimitfi karena kekurangannya kurang signifikan
		// C++ -- satu function dapat memiliki banyak atribut
		// Di Method A, kamu dapat memanggil Method B, tetapi tidak dapat membuat Method di dalam Method
		
		System.out.println(x);
		
		// convert dari nonprimitif ke primitif yang tidak compatible
		// banyak orang tidak sengaja melakukan ini
		
		Integer b1 = 1000;
		
		short shortNumber = b1.shortValue();
		// .shortValue() -- casting otomatis sebuah integer menjadi short
		System.out.println(shortNumber);
		
		// conversion function of Integer, Byte class
		// longValue, doubleValue, toString, byteValue
		// Integer.class
		// Byte.class
		
		// tidak bisa tampung b 1000 sehingga terjadi number overflow
		short shortNumber1 = b.shortValue();
		System.out.println(shortNumber1);
		
		// Array: data type tidak bisa berubah dan demikian juga dengan jumlah data
		String[] names = new String[4]; // array yang dapat menampung 3 elemen
		/* 
		 * atau:
		 * String[] names;
		 * names = new String[4]
		 */
		names[0] = "Ben Alark";
		names[1] = "Rosella Meadow";
		names[2] = "Nicky Varensky";
		names[3] = "Vincent Oscario";
		// character di indeks berapa <- charAt()
		
		// A R R A Y  I N I T I A L I Z E R
		int[] numbers = new int[]
		{
			10, 20, 30, 40, 50		
		};
		// int[]: integer array
		
		numbers[0] = 0;
		numbers[1] = 15;
		System.out.println(numbers[1]);
		System.out.println(numbers.length); // akses jumlah elemen
		// yang paling sering dipakai (untuk tahu jumlah elemen dalam array)
		// supaya bisa iterasi
		// length: atribut
		// sama seperti Person.age
		// length berupa atribut, bukan method
		
		/*
		long[] bigNumbers = {
				2000L, 3000L, 4000L, 5000L
		};
		*/
		
		String[][] characters = {
				{"Ben Alark", "Rosella Meadow", "Nicky Varensky", "Vincent Oscario", "Princella Sephora"},
				{"Isabella Paloma", "Thery Kowalski"},
				{"Eric Paloma", "Kenneth Elloch", "Hazuki Naomi"}
		};
		
		String[] team1 = characters[0]; // Ben Alark, Rosella Meadow, Nicky Varensky, Vincent Oscario, Princella Sephora
		System.out.println(team1);
		System.out.println(team1[1]);
		System.out.println(characters[1][0]);
		
		// ARITHMETIC OPERATIONS
		int a1 = 5;
		int b2 = 9;
		int c1 = 10;
		System.out.println(a1 + b2);
		System.out.println(a1 - b2);
		System.out.println(b2 * c1);
		System.out.println(a1 / b2);
		System.out.println(c1 % a1);
		
		// Augmented Assignment (Java) ~ Shorthand Operator (C)
		int number = 10;
		number += 5;
		number -= 5;
		number *= 2;
		number /= 5;
		System.out.println(number);
		number %= 2;
		System.out.println(number);
		
		// Unary Operator: increment, decrement
		int num1 = -10;
		int num2 = 10;
		num1--;
		num2++;
		System.out.println(num1);
		System.out.println(num2);
		
		// Comparison Operator
		int x1 = 5;
		int y = 10;
		
		System.out.println(x1 > y);
		System.out.println(x1 >= y);
		System.out.println(x1 < y);
		System.out.println(x1 <= y);
		System.out.println(x1 == y);
		System.out.println(x1 != y);
		
		// JavaScript: membedakan sama dengan tiga kali dan sama dengan dua kali
		int k = 5;
		int l = 5; // kenapa b aku taruh di memori lain, padahal bisa taruh di memori yang sama
		// pas di-compare, apakah 100 = 100 karena Java melihat variabel yang sama
		System.out.println(a == b);
		
		String person1 = "Ben"; // memory 100 misal
		person1 = person1 + "" + "Alark";
		
		String person2 = "Ben Alark"; // memory 200 misal
		System.out.println(person1 == person2); // false
		// khusus untuk nonprimitive, dia compare memori
		
		String person3 = "Isabella Paloma";
		String person4 = "Isabella Paloma"; // daripada alokasikan satu stack memori untuk tampung value yang sama, lebih baik letakkan saja value yang sama di memori yang sama dengan value tersebut
		System.out.println(person1 == person2); // true
		
		// Java melihat saat nilai initialisasi, bukan nilai mutasi
		System.out.println(person1.equals(person2));
		// bawaan kelas nonprimitif
		// person1.equals() => method
		// method hanya bisa di nonprimitif variable
		// primitif pakai ==
		// nonprimitive pakai equals
		// memori tidak dapat berpindah
		
		// B O O L E A N  O P E R A T I O N S
		int g = 5;
		int h = 3;
		System.out.println(g > 5 && h <= g);
		System.out.println(g > 6 || h != g);
		System.out.println(!(g == 5));
		
		// Polymorphism: suatu bentuk berubah menjadi banyak bentuk
		
		// J A V A  S T A T E M E N T
		// Statement berbeda dengan Expression
		// Statement adalah kumpulan expression
		int angka = 5; // Assignment Statement (angka = 5: expression)
		angka++; // Increment Statement
		System.out.println(angka); // Method Invocation Statement: memanggil method
		Date date = new Date(); // misalkan mau membuat objek tanggal -> Object Creation Statement: memanggil/membuat objek baru
		
		// Block: kumpulan Statement
		System.out.println("Hello");
		System.out.println("World");
		
		{
			System.out.println("Hello");
			System.out.println("World");
		}
		// Block: untuk mengelompokkan
		// dia akan commit dan tidak membaca kurung kurawal, hanya membaca statement di dalam kurung kurawal
		
		// S E L E C T I O N
		int score = 90;
		int minimum = 75;
		
		boolean attendExam = true;
		
		if (score > minimum && attendExam)
		{
			System.out.println("Pass");
		}
		
		else if (score > minimum && !attendExam)
		{
			System.out.println("Can't attend the exam");
		}
		
		else
		{
			System.out.println("Don't pass the exam");
		}
		
		// S W I T C H  C A S E
		char grade = 'F';
		switch(grade) {
			// sifat: 
		case 'A':
			System.out.println("A");
			break;
		case 'B':
			System.out.println("B");
		case 'C':
			System.out.println("C");
		default:
			System.out.println("default");
		}
		
		// Kekurangan Switch Statement:
		// 1. Tidak bisa range
		// 2. Lebih lambat daripada if else
		// Java 14 -> switch lamda, tidak perlu break (break yang sudah di-upgrade)
		
		/*
		var score = 90;
		
		switch(score)
		{
			case "A" -> System.out.println("A");
			case "B", "C" -> System.out.println("B. C");
			default -> {
				System.out.println("Default");
			}
		}
		*/ // Java 14+
		
		// Java 14: Yield Operator
		// lebih sering digunakan Yiled Operator daripada Switch Score
		/*
		 * Tergantung dari switch nilai
		 * Yield bisa variable primitif, nonprimitif
		 * nilai message tergantung dengan nilai yang diyield oleh switch statement
		var score = "A";
		String message = switch(score) {
		case "A":
			yield "Lulus";
		case "B":
			yiled "Keren";
		}
		*/
		
		// Ternary Operator
		int score1 = 80;
		System.out.println(score1 >= 75 ? "Pass" : "Fail");
		
		// For Loop
		for (int i = 0; i < 10; i++)
		{
			System.out.println(i);
		}
		
		// Infinite loop
		for (;;)
		{
			System.out.println("Alark Universe");
		}
		// untuk menghentikan (pause) While Loop > tinggal pencet tombol merah
		// pause infinite loop
		
		// sering infinite loop > belajar Multitrading
		
		// W H I L E  L O O P
		int counter = 10;
		
		while (counter <= 10)
		{
			System.out.println(counter);
			counter++;
		}
		
		// D O  W H I L E  L O O P
		int count = 10;
		
		do
		{
			System.out.println(count);
			count++;
		} while (count < 10);
		
		// B R E A K  A N D  C O N T I N U E
		// Break: menghentikan perulangan
		// Continue: menghentikan perulangan saat ini
		
		int counter = 1;
		
		while (true)
		{
			counter++;
			
			if (counter == 5)
			{
				continue;
			}
			
			System.out.println(counter);
			
			if (counter == 10)
			{
				break;
			}
		}
		
		// FOR EACH
		String novelCharacters[] = {"Isabella Paloma", "Ben Alark", "Hazuki Naomi"};
		
		for (int i = 0; i < novelCharacters.length; i++)
		{
			System.out.println(novelCharacters[i]);
		}
		
		for (String character: novelCharacters)
		{
			System.out.println(character);
		}
		// kekurangan for each sebelum Java 10: harus tahu data type apa
		
		/*
		for (var character: novelCharacters)
		{
			System.out.println(character);
		}
		*/
		// var: detect tipe data yang cocok apa untuk setiap elemen
		// 1000 lebih cocok masuk ke short
		// selain var bisa menentukan tipe data, tanpa diberitahu secara eksplisit, langsung tahu tipe data
		// menyesuaikan dengan variabel primitif dan nonprimitif juga
		
		// Input and Output
		Scanner scan = new Scanner(System.in);
		// Java tidak di-desain untuk terima input dari user
		// input di mobile berarti input dari keyboard 
		// input di web berarti input dari textbox
		// bukan terima input dari console
		
		// dari class Scanner, buat objek Scanner baru, yaitu scan yang terima system.in
		// System in dari console
		
		// import Scanner dari Java Util (karena class Scanner tidak default ada di aplikasi, tetapi ada di jre
		
		System.out.println("Insert your score: ");
		int score11 = scan.nextInt();
		scan.nextLine(); // similar to getchar() in C
		// harus tekan enter untuk memasukkan kembali
		// enter harus dimakan dan dimakan oleh getchar()
		System.out.println("Insert your student name: ");
		String studentName = scan.nextLine();
		System.out.println("Your score: " + score11);
		// kalau kamu minta angka, habis itu kamu minta string
		System.out.println("Student Name: " + studentName);
		// untuk getchar, kita harus include di bawahnya (perlu buffer)
		
		Collection<String> collections = new ArrayList<String>();
		
	}

}
// Run: Ctrl + F11

// Color Theme: 
// https://github.com/guari/eclipse-ui-theme
