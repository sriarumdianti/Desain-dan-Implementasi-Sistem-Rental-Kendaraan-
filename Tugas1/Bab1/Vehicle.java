/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bab1;

/**
 *
 * @author L E N O V O
 */
// Object Class: Vehicle
// Kelas ini merepresentasikan kendaraan yang disewakan.
public class Vehicle {
    public String brand;               // Merek kendaraan (public, bisa diakses langsung)
    public String model;               // Model kendaraan (public, bisa diakses langsung)
    public double rentalPricePerDay;   // Harga sewa per hari (public, bisa diakses langsung)

    // Konstruktor untuk inisialisasi objek Vehicle
    public Vehicle(String brand, String model, double rentalPricePerDay) {
        this.brand = brand;
        this.model = model;
        this.rentalPricePerDay = rentalPricePerDay;
    }

    // Method untuk menampilkan informasi kendaraan
    public void displayInfo() {
        System.out.println("Merek: " + brand);
        System.out.println("Model: " + model);
        System.out.println("Harga Sewa per Hari: Rp " + rentalPricePerDay);
    }
}


