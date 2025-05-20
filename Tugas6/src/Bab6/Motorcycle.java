/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bab6;

/**
 *
 * @author L E N O V O
 */
public class Motorcycle extends Vehicle {
    private boolean helmet;

    public Motorcycle(String brand, String model, double rentalPricePerDay, boolean helmet) {
        super(brand, model, rentalPricePerDay);
        this.helmet = helmet;
    }

    public boolean hasHelmet() {
        return helmet;
    }

    @Override
    public void displayInfo() {
        System.out.println("Motor: " + getBrand() + " " + getModel());
        System.out.println("Harga Sewa per Hari: Rp " + getRentalPricePerDay());
        System.out.println("Boncengan: " + (helmet ? "Bisa" : "Tidak bisa"));
    }
}