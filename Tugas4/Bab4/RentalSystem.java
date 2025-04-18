/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bab4;

import java.util.Scanner;
/**
 *
 * @author L E N O V O
 */
// Kelas RentalSystem adalah program utama untuk simulasi sistem penyewaan kendaraan
public class RentalSystem {
    public static void main(String[] args) {
        // Buat array kendaraan dengan objek turunan Vehicle (Car dan Motorcycle)
        Vehicle[] kendaraan = {
            new Car("Toyota", "Avanza", 350000, 7),
            new Car("Honda", "Civic", 500000, 5),
            new Motorcycle("Yamaha", "NMax", 150000, true)
        };

        // Tampilkan daftar kendaraan
        System.out.println("=== Daftar Kendaraan Tersedia ===");
        for (int i = 0; i < kendaraan.length; i++) {
            System.out.println("Pilihan " + (i + 1));
            kendaraan[i].displayInfo();
            System.out.println("----------------------------");
        }

        // Input dari user
        Scanner scanner = new Scanner(System.in);
        System.out.print("Pilih kendaraan (1-" + kendaraan.length + "): ");
        int choice = scanner.nextInt();

        System.out.print("Masukkan jumlah hari sewa: ");
        int days = scanner.nextInt();

        // Validasi pilihan
        if (choice < 1 || choice > kendaraan.length) {
            System.out.println("Pilihan tidak valid.");
        } else {
            Vehicle selected = kendaraan[choice - 1];
            double totalCost = selected.getRentalPricePerDay() * days;

            System.out.println("\n=== Detail Penyewaan ===");
            selected.displayInfo();
            System.out.println("Lama Sewa: " + days + " hari");
            System.out.println("Total Biaya: Rp " + totalCost);
        }

        scanner.close();
    }
}

