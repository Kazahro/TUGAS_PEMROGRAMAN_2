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
public class BIODATA_MAHASISWA {
    public static void main(String[] args) {
        MahasiswaAktif mhs = new MahasiswaAktif();
        mhs.nama = "Ro'isah Kazahro";
        mhs.nim = "2455201067";
        mhs.jurusan = "Ilmu Komputer";

        System.out.println("=== Data Mahasiswa ===");
        mhs.tampilkanData();
        mhs.tampilkanJurusan();
    }
}