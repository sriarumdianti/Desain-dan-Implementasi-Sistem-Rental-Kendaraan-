/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bab4;

/**
 *
 * @author L E N O V O
 */
public class Motorcycle extends Vehicle {
    private boolean hasHelmet; // Apakah motor dilengkapi helm

    // Konstruktor
    public Motorcycle(String brand, String model, double rentalPricePerDay, boolean hasHelmet) {
        super(brand, model, rentalPricePerDay); // Memanggil konstruktor dari Vehicle
        this.hasHelmet = hasHelmet;
    }

    // Getter untuk informasi helm
    public boolean hasHelmet() {
        return hasHelmet;
    }

    // Override method displayInfo
    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Dilengkapi Helm: " + (hasHelmet ? "Ya" : "Tidak"));
    }
}
