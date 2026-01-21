/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package app;

/**
 *
 * @author WINDOWS
 */
public class Mahasiswa extends Orang implements TampilData {
    
    private String nim;

    public Mahasiswa(String nama, String nim) {
        super(nama);
        this.nim = nim;
    }

    public String getNim() {
        return nim;
    }
    @Override
    public String getInfo() {
        return super.getInfo() + "\nNIM: " + nim;
    }

    @Override
    public String tampilkanData(String prodi) {
        return getInfo() + "\nProdi: " + prodi;
    }
}
