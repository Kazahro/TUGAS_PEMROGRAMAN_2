/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg2455201067_pertemuan_sembilan9;

/**
 *
 * @author WINDOWS
 */

import java.sql.Connection; // KONEKSI
    import java.sql.DriverManager; // HUBUNG APLIKASI SQL
    import java.sql.SQLException; // ATASI ERROR JIKA TERKENDALA
    import javax.swing.JOptionPane;

public class Koneksi {
    Connection con=null; // OBJEK DARI LIBRARY
    
    public void koneksi()
    {
        try // EXCEPTION HANDLING
        {
            String connectionURL = "jdbc:mysql://localhost:3306/mahasiswa";
            String username = "root";
            String password = "";
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection(connectionURL, username, password);
           JOptionPane.showMessageDialog(null, "Sukses Koneksi");
        }

        catch(Exception e) // MENAGKAP ERROR
        {
        JOptionPane.showMessageDialog(null, e);
        System.exit(0);
        }
    }
    public static void main(String[] args) {
        Koneksi koneksi = new Koneksi();
        koneksi.koneksi();
    }
}