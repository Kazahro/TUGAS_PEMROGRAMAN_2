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
public class Orang {
    protected String nama;

    public Orang(String nama) {
        this.nama = nama;
    }

    public String getInfo() {
        return "Nama: " + nama;
    }
}