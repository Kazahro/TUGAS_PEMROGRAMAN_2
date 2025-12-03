/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg2455201067_pertemuan_tujuh7_Polimorfisme_Dinamis;

public class lingkaran extends bangun_datar {

    int r;

    public lingkaran(int r) {
        this.r = r;
    }

    @Override
    public float luas() {
        return (float) (Math.PI * r * r);
    }

    public float keliling() {
        return (float) (2 * Math.PI * r);
    }
}