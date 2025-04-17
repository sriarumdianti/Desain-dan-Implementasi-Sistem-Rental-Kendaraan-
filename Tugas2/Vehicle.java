/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bab2;

/**
 *
 * @author L E N O V O
 */
public class Vehicle {
    // Atribut merek kendaraan
    private String brand;

    // Atribut model kendaraan
    private String model;

    // Atribut harga sewa kendaraan per hari
    private double rentalPricePerDay;

    /**
     * Konstruktor untuk membuat objek kendaraan
     * @param brand Merek kendaraan
     * @param model Model kendaraan
     * @param rentalPricePerDay Harga sewa per hari
     */
    public Vehicle(String brand, String model, double rentalPricePerDay) {
        this.brand = brand;
        this.model = model;
        this.rentalPricePerDay = rentalPricePerDay;
    }

    /**
     * Mengembalikan merek kendaraan
     * @return brand
     */
    public String getBrand() {
        return brand;
    }

    /**
     * Mengembalikan model kendaraan
     * @return model
     */
    public String getModel() {
        return model;
    }

    /**
     * Mengembalikan harga sewa per hari kendaraan
     * @return rentalPricePerDay
     */
    public double getRentalPricePerDay() {
        return rentalPricePerDay;
    }

    /**
     * Menampilkan informasi kendaraan ke layar
     */
    public void displayInfo() {
        System.out.println("Merek: " + brand);
        System.out.println("Model: " + model);
        System.out.println("Harga Sewa per Hari: Rp " + rentalPricePerDay);
    }
}

