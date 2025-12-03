/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg2455201067_pertemuan_tujuh7_Polimorfisme_Dinamis;

/**
 *
 * @author WINDOWS
 */
public class main_utama {

    public static void main(String[] args) {

        bangun_datar bangunD = new bangun_datar();
        persegi persegi = new persegi(5);
        segitiga segitiga = new segitiga(5, 10);
        lingkaran lingkaran = new lingkaran(10);

        // panggil method luas dan keliling
        System.out.println("Luas Bangun Datar : " + bangunD.luas());
        System.out.println("Keliling Bangun Datar : " + bangunD.keliling());

        System.out.println("\nLuas Persegi : " + persegi.luas());
        System.out.println("Keliling Persegi : " + persegi.keliling());

        System.out.println("\nLuas Segitiga : " + segitiga.luas());

        System.out.println("\nLuas Lingkaran : " + lingkaran.luas());
        System.out.println("Keliling Lingkaran : " + lingkaran.keliling());
    }
}
