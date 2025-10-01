/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg2455201067_studikasus;

/**
 *
 * @author WINDOWS
 */
import java.util.Scanner;
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int pilih;
        do {
            System.out.println("\n1.Array  2.Percabangan  3.Perulangan  0.Keluar");
            System.out.print("Pilih: "); pilih = in.nextInt();

            if (pilih == 1) {
                int[] nilai = {80, 75, 90};
                for (int i = 0; i < nilai.length; i++)
                    System.out.println("Nilai ke-" + (i+1) + " = " + nilai[i]);
            } 
            else if (pilih == 2) {
                System.out.print("Masukkan nilai: "); int n = in.nextInt();
                System.out.println(n >= 70 ? "Lulus" : "Tidak Lulus");
            } 
            else if (pilih == 3) {
                for (int i = 1; i <= 10; i++) System.out.print(i + " ");
                System.out.println();
            }
        } while (pilih != 0);
        in.close();
    }
    
}
