/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bab7;

/**
 *
 * @author L E N O V O
 */
public class Truck extends Vehicle {
     private double seatCapacity; // dalam ton

    public Truck(String brand, String model, double rentalPricePerDay, double seatCapacity) {
        super(brand, model, rentalPricePerDay);
        this.seatCapacity = seatCapacity;
    }

    public double getSeatCapacity() {
        return seatCapacity;
    }

    @Override
    public void displayInfo() {
        displayBasicInfo();
        System.out.println("Kapasitas Muatan: " + seatCapacity + " ton");
    }

    // Overloading
    public void displayInfo(boolean includeLabel) {
        if (includeLabel) {
            System.out.println("[Truk] " + getBrand() + " " + getModel() + " 5.00 " + seatCapacity + " Ton");
        } else {
            System.out.println(getBrand() + " " + getModel());
        }
    }
    
}