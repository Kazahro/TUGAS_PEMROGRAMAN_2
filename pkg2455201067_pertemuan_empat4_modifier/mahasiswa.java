/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg2455201067_pertemuan_empat4_modifier;

/**
 *
 * @author WINDOWS
 */
class mahasiswa {
    // Atribut
    private String nim;
    private String nama;
    private double ipk;
    private String predikat;

    // Konstruktor
    public mahasiswa (String nim, String nama, double ipk) {
        this.nim = nim;
        this.nama = nama;
        this.ipk = ipk;
    }

    // === PROSEDUR TANPA PARAMETER ===
    void tampilData(int urutan) {
        System.out.println("\n=== Data Mahasiswa ke-" + urutan + " ===");
        System.out.println("NIM  : " + nim);
        System.out.println("Nama : " + nama);
        System.out.println("IPK  : " + ipk);
    }

    // === PROSEDUR DENGAN PARAMETER ===
    void updateData(String nimBaru, String namaBaru, double ipkBaru) {
        this.nim = nimBaru;
        this.nama = namaBaru;
        this.ipk = ipkBaru;
        System.out.println("\nData mahasiswa telah diperbarui!");
    }

    // === FUNGSI TANPA PARAMETER ===
    String predikat() {
        if (ipk >= 3.5) {
            predikat = "Cumlaude";
        } else if (ipk >= 3.0) {
            predikat = "Sangat Memuaskan";
        } else if (ipk >= 2.75) {
            predikat = "Memuaskan";
        } else {
            predikat = "Cukup";
        }
        return predikat;
    }  
     }
