/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author WINDOWS
 */

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class Koneksi {
   public static Connection getConnection() {
        Connection conn = null;
        try {
            // Tambahkan driver JDBC (sesuai permintaan)
            Class.forName("com.mysql.cj.jdbc.Driver");

            String url = "jdbc:mysql://localhost/db_laboratorium";
            String user = "root";
            String pass = "";

            conn = DriverManager.getConnection(url, user, pass);
            JOptionPane.showMessageDialog(null, "Koneksi berhasil");

        } catch (ClassNotFoundException e) {
            JOptionPane.showMessageDialog(null, "Driver tidak ditemukan\n" + e.getMessage());
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Koneksi gagal\n" + e.getMessage());
        }
        return conn;
    }

    public static void main(String args[]) {
        Connection conn = Koneksi.getConnection();

        if (conn != null) {
            System.out.println("Koneksi berhasil!");
        } else {
            System.out.println("Koneksi gagal!");
        }
    }
}