/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bab1;

import java.util.Scanner;
/**
 *
 * @author L E N O V O
 */
// Driver Class: RentalSystem
// Kelas ini mengatur proses penyewaan kendaraan.


public class RentalSystem {
    public static void main(String[] args) {
        // Membuat objek kendaraan
        Vehicle car1 = new Vehicle("Toyota", "Avanza", 350000);
        Vehicle car2 = new Vehicle("Honda", "Civic", 500000);

        // Menampilkan informasi kendaraan
        System.out.println("=== Daftar Kendaraan Tersedia ===");
        car1.displayInfo();
        System.out.println("----------------------------");
        car2.displayInfo();

        // Input penyewaan dari pengguna
        Scanner scanner = new Scanner(System.in);
        System.out.println("\nPilih kendaraan (1: Toyota Avanza, 2: Honda Civic): ");
        int choice = scanner.nextInt();

        System.out.print("Masukkan jumlah hari sewa: ");
        int days = scanner.nextInt();

        // Menghitung total biaya sewa
        Vehicle selectedCar = (choice == 1) ? car1 : car2;
        double totalCost = selectedCar.rentalPricePerDay * days; // akses langsung tanpa getter

        // Menampilkan detail penyewaan
        System.out.println("\n=== Detail Penyewaan ===");
        selectedCar.displayInfo();
        System.out.println("Lama Sewa: " + days + " hari");
        System.out.println("Total Biaya: Rp " + totalCost);

        scanner.close();
    }
}

