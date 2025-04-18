/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bab5;

/**
 *
 * @author L E N O V O
 */
public class Car extends Vehicle{
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
        super.displayInfo();
        System.out.println("Kapasitas Tempat Duduk: " + seatCapacity + " orang");
    }

    // Overloading
    public void displayInfo(boolean withLabel) {
        if (withLabel) {
            System.out.println("[Mobil] " + getBrand() + " " + getModel() + " - " + seatCapacity + " Kursi");
        } else {
            System.out.println(getBrand() + " " + getModel());
        }
    }
}
