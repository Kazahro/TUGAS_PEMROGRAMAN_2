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
class Enemy {
    String name;
    int hp;
    int attackPoin;

    void attack() {
        System.out.println(name + " menyerang dengan kekuatan " + attackPoin);
    }

    void walk() {
        System.out.println(name + " sedang berjalan...");
    }
}