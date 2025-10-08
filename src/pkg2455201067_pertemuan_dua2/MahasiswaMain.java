/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg2455201067_pertemuan_dua2;

/**
 *
 * @author WINDOWS
 */

class Mahasiswa {
    String nama;
    String nim;

    void tampilkanData() {
        System.out.println("Nama : " + nama);
        System.out.println("NIM  : " + nim);
    }
}

// Class turunan
class MahasiswaAktif extends Mahasiswa {
    String jurusan;

    void tampilkanJurusan() {
        System.out.println("Jurusan : " + jurusan);
    }
}    