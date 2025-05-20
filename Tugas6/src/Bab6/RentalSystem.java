/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bab6;

/**
 *
 * @author L E N O V O
 */
import java.util.Scanner;

public class RentalSystem {
    public static void main(String[] args) {
        Vehicle[] kendaraan = {
            new Car("Toyota", "Avanza", 350000, 7),
            new Car("Honda", "Civic", 500000, 5),
            new Motorcycle("Yamaha", "NMax", 150000, true),
            new Truck("Mitsubishi", "Fuso", 750000, 5.0)
        };

        System.out.println("=== Daftar Kendaraan Tersedia ===");
        for (int i = 0; i < kendaraan.length; i++) {
            System.out.println("Pilihan " + (i + 1));
            kendaraan[i].displayInfo();
            System.out.println("----------------------------");
        }

        Scanner scanner = new Scanner(System.in);
        System.out.print("Pilih kendaraan (1-" + kendaraan.length + "): ");
        int choice = scanner.nextInt();

        System.out.print("Masukkan jumlah hari sewa: ");
        int days = scanner.nextInt();

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