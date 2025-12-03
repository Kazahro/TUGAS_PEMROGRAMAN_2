/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg2455201067_pertemuan_tujuh7_Interface;

/**
 *
 * @author WINDOWS
 */
    public class xiaomi implements phone {

    private int volume;
    private boolean isPowerOn;

    public xiaomi() {
        this.volume = 50;
        this.isPowerOn = false;
    }

    @Override
    public void powerOn() {
        isPowerOn = true;
        System.out.println("Xiaomi menyala...");
    }

    @Override
    public void powerOff() {
        isPowerOn = false;
        System.out.println("Xiaomi mati...");
    }

    @Override
    public void volumeUp() {
        if (isPowerOn) {
            if (volume < 100) {
                volume++;
            }
            System.out.println("Volume Xiaomi: " + volume);
        } else {
            System.out.println("Nyalakan HP dulu!");
        }
    }

    @Override
    public void volumeDown() {
        if (isPowerOn) {
            if (volume > 0) {
                volume--;
            }
            System.out.println("Volume Xiaomi: " + volume);
        } else {
            System.out.println("Nyalakan HP dulu!");
        }
    }
}