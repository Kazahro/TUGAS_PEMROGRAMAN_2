/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg2455201067_pertemuan_lima5_inweritan;

/**
 *
 * @author WINDOWS
 */

public class main {
    public static void main(String[] args) {

        BangunDatar l = new Lingkaran(7);
        persegi p = new persegi(4);
        persegi_panjang pp = new persegi_panjang(5, 3);
        segitiga sg = new segitiga(6, 4);

        System.out.println("Luas Lingkaran: " + l.hitungLuas());
        System.out.println("Luas Persegi: " + p.hitungLuas());
        System.out.println("Luas Persegi Panjang: " + pp.hitungLuas());
        System.out.println("Luas Segitiga: " + sg.hitungLuas());
    }
}
