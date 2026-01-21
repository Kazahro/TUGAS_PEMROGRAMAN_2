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

public class Delete {
    // Method untuk menghapus data berdasarkan ID Alat
    public static int hapusAlat(String id) {
        int hasil = 0;
        String sql = "DELETE FROM alat WHERE id_alat = ?";
        
        try {
            Connection conn = Koneksi.getConnection(); // Mengambil koneksi
            if (conn != null) {
                PreparedStatement pst = conn.prepareStatement(sql);
                pst.setString(1, id);
                
                hasil = pst.executeUpdate(); // Mengembalikan 1 jika data berhasil dihapus
            }
        } catch (SQLException e) {
            System.out.println("Error Hapus: " + e.getMessage());
        }
        return hasil;
    }
}