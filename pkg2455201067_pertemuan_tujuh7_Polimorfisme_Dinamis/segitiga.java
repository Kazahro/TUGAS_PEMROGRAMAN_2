/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg2455201067_pertemuan_tujuh7_Polimorfisme_Dinamis;

public class segitiga extends bangun_datar {

    int alas;
    int tinggi;

    public segitiga(int alas, int tinggi) {
        this.alas = alas;
        this.tinggi = tinggi;
    }

    public float luas() {
        return 0.5f * this.alas * this.tinggi;
    }

    public float keliling() {
        return 0; // jika perlu, bisa ditambahkan rumus keliling segitiga
    }
}
