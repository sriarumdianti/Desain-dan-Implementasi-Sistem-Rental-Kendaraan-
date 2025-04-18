/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bab5;

/**
 *
 * @author L E N O V O
 */
public class Motorcycle extends Vehicle{
    private boolean hasHelmet;

    public Motorcycle(String brand, String model, double rentalPricePerDay, boolean hasHelmet) {
        super(brand, model, rentalPricePerDay);
        this.hasHelmet = hasHelmet;
    }

    public boolean hasHelmet() {
        return hasHelmet;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Dilengkapi Helm: " + (hasHelmet ? "Ya" : "Tidak"));
    }

    // Overloading
    public void displayInfo(String additionalInfo) {
        super.displayInfo();
        System.out.println("Info Tambahan: " + additionalInfo);
    }
}
