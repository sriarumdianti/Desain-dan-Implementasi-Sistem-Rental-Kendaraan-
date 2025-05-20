/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bab6;

/**
 *
 * @author L E N O V O
 */
public class Truck extends Vehicle {
    private double loadCapacity;

    public Truck(String brand, String model, double rentalPricePerDay, double loadCapacity) {
        super(brand, model, rentalPricePerDay);
        this.loadCapacity = loadCapacity;
    }

    public double getLoadCapacity() {
        return loadCapacity;
    }

    @Override
    public void displayInfo() {
        System.out.println("Truk: " + getBrand() + " " + getModel());
        System.out.println("Harga Sewa per Hari: Rp " + getRentalPricePerDay());
        System.out.println("Kapasitas Muatan: " + loadCapacity + " ton");
    }
}