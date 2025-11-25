/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg2455201067_pertemuan_lima5_Overriding_pada_Inheritance;

public class main {
    public static void main(String[] args) {

        Mobil m1 = new Mobil();
        MobilMetic m2 = new MobilMetic();

        m1.jalan();  // method induk
        m2.jalan();  // method override
    }
}