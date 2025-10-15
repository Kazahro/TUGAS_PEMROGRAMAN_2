/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package pkg2455201067_petemuan_tiga3;

public class class_utama {
    public static void main(String[] args) {
        // Membuat objek mahasiswa pertama
        mahasiswa m1 = new mahasiswa("2455201067", "Roisah Kazahro", 3.55);

        // Menampilkan data mahasiswa ke-1
        m1.tampilData(1);
        System.out.println("Predikat : " + m1.predikat());

        // Memperbarui data mahasiswa
        m1.updateData("2455201077", "Roisah K. Update", 3.25);

        // Menampilkan data setelah diperbarui
        m1.tampilData(1);
        System.out.println("Predikat : " + m1.predikat());
    }
}
