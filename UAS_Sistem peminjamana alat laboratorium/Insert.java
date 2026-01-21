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
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Insert {
    public static int tambahAlat(String nama, String jumlah, String kondisi) {
        int hasil = 0;
        // Jangan masukkan id_alat ke dalam query jika sudah Auto Increment
        String sql = "INSERT INTO alat (nama_alat, jumlah, kondisi) VALUES (?, ?, ?)";
        
        try {
            java.sql.Connection conn = Koneksi.getConnection(); 
            if (conn != null) {
                java.sql.PreparedStatement pst = conn.prepareStatement(sql);
                pst.setString(1, nama);
                pst.setString(2, jumlah);
                pst.setString(3, kondisi);
                
                hasil = pst.executeUpdate();
            }
        } catch (java.sql.SQLException e) {
            System.out.println("Error Insert Auto-ID: " + e.getMessage());
        }
        return hasil;
    }
}