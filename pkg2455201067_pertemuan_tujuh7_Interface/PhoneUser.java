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
    public class PhoneUser {

    private phone phone;

    public PhoneUser(phone phone) {
        this.phone = phone;
    }

    public void turnOnPhone() {
        phone.powerOn();
    }

    public void turnOffPhone() {
        phone.powerOff();
    }

    public void makePhoneLouder() {
        phone.volumeUp();
    }

    public void makePhoneSilent() {
        phone.volumeDown();
    }
}