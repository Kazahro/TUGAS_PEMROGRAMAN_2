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
    import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        phone xiaomi = new xiaomi();
        PhoneUser user = new PhoneUser(xiaomi);

        Scanner input = new Scanner(System.in);
        int pilihan;

        do {
            System.out.println("\n=== MENU HP ===");
            System.out.println("1. Hidupkan HP");
            System.out.println("2. Matikan HP");
            System.out.println("3. Volume Up");
            System.out.println("4. Volume Down");
            System.out.println("0. Keluar");
            System.out.print("Pilih: ");
            pilihan = input.nextInt();

            switch (pilihan) {
                case 1:
                    user.turnOnPhone();
                    break;
                case 2:
                    user.turnOffPhone();
                    break;
                case 3:
                    user.makePhoneLouder();
                    break;
                case 4:
                    user.makePhoneSilent();
                    break;
                case 0:
                    System.out.println("Keluar...");
                    break;
                default:
                    System.out.println("Pilihan tidak ada!");
            }

        } while (pilihan != 0);
    }
}