/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bab7;

/**
 *
 * @author L E N O V O
 */
public class Penyewa {
    private String nama;
    private String alamat;
    private String noTelepon;
    private String kendaraan;

    public Penyewa(String nama, String alamat, String noTelepon, String kendaraan) {
        this.nama = nama;
        this.alamat = alamat;
        this.noTelepon = noTelepon;
        this.kendaraan = kendaraan;
    }

    public String displayData() {
        return "Nama: " + nama + "\n"
             + "Alamat: " + alamat + "\n"
             + "No. Telepon: " + noTelepon + "\n"
             + "Kendaraan Disewa: " + kendaraan;
    }
}