/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bab6;

/**
 *
 * @author L E N O V O
 */
public class Car extends Vehicle {
    private int seatCapacity;

    public Car(String brand, String model, double rentalPricePerDay, int seatCapacity) {
        super(brand, model, rentalPricePerDay);
        this.seatCapacity = seatCapacity;
    }

    public int getSeatCapacity() {
        return seatCapacity;
    }

    @Override
    public void displayInfo() {
        System.out.println("Mobil: " + getBrand() + " " + getModel());
        System.out.println("Harga Sewa per Hari: Rp " + getRentalPricePerDay());
        System.out.println("Kapasitas Penumpang: " + seatCapacity + " orang");
    }
}