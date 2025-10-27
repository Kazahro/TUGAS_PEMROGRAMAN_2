/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg2455201067_pertemuan_empat_inheritance;

/**
 *
 * @author WINDOWS
 */
public class main {
    public static void main(String[] args) {
        Pocong p = new Pocong();
        p.name = "Pocong Jawa";
        p.hp = 100;
        p.attackPoin = 25;

        Burung b = new Burung();
        b.name = "Elang Hitam";
        b.hp = 80;
        b.attackPoin = 20;

        Zombie z = new Zombie();
        z.name = "Zombie Kota";
        z.hp = 120;
        z.attackPoin = 30;

        System.out.println("=== Aksi Para Musuh ===");
        p.attack();
        p.jump();

        b.attack();
        b.fly();

        z.attack();
        z.walk();
    }
}