/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bab5;

/**
 *
 * @author L E N O V O
 */
public class Vehicle {
    private String brand;
    private String model;
    private double rentalPricePerDay;

    public Vehicle(String brand, String model, double rentalPricePerDay) {
        this.brand = brand;
        this.model = model;
        this.rentalPricePerDay = rentalPricePerDay;
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public double getRentalPricePerDay() {
        return rentalPricePerDay;
    }

    public void displayInfo() {
        System.out.println("Merek: " + brand);
        System.out.println("Model: " + model);
        System.out.println("Harga Sewa per Hari: Rp " + rentalPricePerDay);
    }

    // Overloading
    public void displayInfo(String prefix) {
        System.out.println(prefix + " " + brand + " " + model + ", Harga: Rp " + rentalPricePerDay);
    }

    @Override
    public String toString() {
        return brand + " " + model + " = Rp" + rentalPricePerDay;
    }
}
