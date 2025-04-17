/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bab2;

/**
 *
 * @author L E N O V O
 */
import java.util.Scanner;

// Kelas RentalSystem adalah program utama untuk simulasi sistem penyewaan kendaraan
public class RentalSystem {
    public static void main(String[] args) {
        // Membuat objek kendaraan dengan menggunakan konstruktor
        Vehicle car1 = new Vehicle("Toyota", "Avanza", 350000);
        Vehicle car2 = new Vehicle("Honda", "Civic", 500000);

        // Menampilkan daftar kendaraan yang tersedia
        System.out.println("=== Daftar Kendaraan Tersedia ===");
        car1.displayInfo();
        System.out.println("----------------------------");
        car2.displayInfo();

        // Membuat objek Scanner untuk input dari pengguna
        Scanner scanner = new Scanner(System.in);

        // Meminta pengguna memilih kendaraan
        System.out.println("\nPilih kendaraan (1: Toyota Avanza, 2: Honda Civic): ");
        int choice = scanner.nextInt();

        // Meminta input jumlah hari sewa
        System.out.print("Masukkan jumlah hari sewa: ");
        int days = scanner.nextInt();

        // Menentukan kendaraan yang dipilih
        Vehicle selectedCar = (choice == 1) ? car1 : car2;

        // Menghitung total biaya sewa berdasarkan hari
        double totalCost = selectedCar.getRentalPricePerDay() * days;

        // Menampilkan detail penyewaan
        System.out.println("\n=== Detail Penyewaan ===");
        selectedCar.displayInfo();
        System.out.println("Lama Sewa: " + days + " hari");
        System.out.println("Total Biaya: Rp " + totalCost);

        // Menutup scanner
        scanner.close();
    }
}
