/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bab4;

/**
 *
 * @author L E N O V O
 */
public class Car extends Vehicle{
   private int seatCapacity; // Kapasitas tempat duduk

    // Konstruktor
    public Car(String brand, String model, double rentalPricePerDay, int seatCapacity) {
        super(brand, model, rentalPricePerDay); // Memanggil konstruktor dari Vehicle
        this.seatCapacity = seatCapacity;
    }

    // Getter untuk kapasitas tempat duduk
    public int getSeatCapacity() {
        return seatCapacity;
    }

    // Override method displayInfo
    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Kapasitas Tempat Duduk: " + seatCapacity + " orang");
    } 
}
