# Projek-Individu-PBO
Arsha Alifa Mahmud-2408107010095

Project Individu Pemrograman Berbasis Objek – Sistem Bus Trans Koetaradja

Project ini merupakan implementasi konsep Pemrograman Berorientasi Objek (PBO) dalam Java yang mensimulasikan sistem pengelolaan penumpang pada Bus Trans Koetaradja. Program menerapkan aturan kursi prioritas, kategori penumpang, pembayaran ongkos, serta exception ketika saldo tidak mencukupi.

Struktur project terdiri dari 7 class yang saling berhubungan dan menggunakan konsep OOP seperti inheritance, abstraction, interface, polymorphism, encapsulation, enum, dan exception handling.

Daftar File / Class
Project ini terdiri dari:
1.	Person.java
2.	TopUp.java
3.	MyException.java
4.	Jenis.java
5.	Penumpang.java
6.	Bus.java
7.	TestBus.java

Penjelasan Setiap Class
1. Person.java
Class abstract yang menjadi superclass untuk semua penumpang.
Menyimpan atribut umum:
	•	id
	•	nama
	•	umur
Konsep yang digunakan:
	•	Abstraction (class abstrak)
	•	Inheritance (diturunkan ke Penumpang)

3. TopUp.java
Sebuah interface yang mendefinisikan method:
	•	tambahSaldo(int jumlah)
Interface ini memastikan bahwa objek penumpang dapat melakukan top-up saldo.
Konsep: Interface & Polymorphism

4. MyException.java
Custom exception yang digunakan ketika penumpang tidak memiliki saldo cukup untuk membayar ongkos bus.
Digunakan melalui:
throw new MyException("Saldo tidak cukup!");
Konsep: Exception Handling

5. Jenis.java
Enum sederhana untuk membedakan tipe penumpang:
	•	PRIORITAS
	•	BIASA
Dipakai untuk menentukan posisi duduk dan aturan naik bus.
Konsep: Enum

6. Penumpang.java
Subclass dari Person dan implementasi TopUp.
Class ini merepresentasikan satu penumpang bus.
Atribut:
	•	umur
	•	hamil atau tidak
	•	saldo (default: 10.000)
	•	kategori prioritas/biasa
Method penting:
	•	isPrioritas() → cek apakah prioritas
	•	bayar() → bayar ongkos
	•	tambahSaldo() → top up
	•	getJenis() → return enum Jenis
Konsep yang digunakan:
	•	Inheritance
	•	Polymorphism
	•	Encapsulation (private + getter)
	•	Interface implementation
	•	Enum usage

7. Bus.java
Class utama yang menangani logika bus.
Menyimpan array:
	•	16 kursi biasa
	•	4 kursi prioritas
	•	20 penumpang berdiri
Fitur utama:
	•	Menambah penumpang (naik())
	•	Menghapus penumpang (turun())
	•	Sistem kursi prioritas sesuai aturan
	•	Memproses pembayaran ongkos
	•	Menampilkan daftar penumpang
	•	Menambah total pendapatan bus
Konsep yang digunakan:
	•	Array (collection)
	•	Encapsulation
	•	Business logic with priority rules
	•	Exception handling (ketika saldo kurang)

8. TestBus.java
Class main untuk menjalankan simulasi.
Fitur:
	•	Menu interaktif:
	•	Naikkan penumpang
	•	Turunkan penumpang
	•	Lihat daftar penumpang
	•	Input user (nama, umur, hamil/tidak)
	•	Mewakili skenario seperti contoh pada PDF
Konsep:
	•	Object creation
	•	Method calling
	•	User interaction

Konsep PBO yang Digunakan
1. Class & Object
Setiap file adalah class dan objek dibuat dalam TestBus (misal: new Penumpang()).
2. Encapsulation
Atribut dibuat private dan diakses menggunakan getter & setter.
3. Inheritance
Penumpang extend dari Person.
4. Abstraction
Person adalah abstract class dan tidak dapat diinstansiasi langsung.
5. Polymorphism
	•	Interface TopUp diimplementasikan oleh Penumpang.
	•	Pemanggilan metode bayar/topup melalui konsep overriding.
6. Interface
TopUp digunakan untuk fungsi top-up saldo.
7. Exception Handling
Menggunakan MyException untuk saldo tidak cukup.
8. Enum
Jenis untuk menentukan apakah penumpang PRIORITAS atau BIASA.
