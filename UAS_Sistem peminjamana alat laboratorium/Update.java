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

public class Update {
    // Method untuk memperbarui data alat berdasarkan ID
    public static int perbaruiDataAlat(String id, String nama, String jumlah, String kondisi) {
        int baris = 0;
        // Query SQL menggunakan placeholder (?) untuk parameter
        String sql = "UPDATE alat SET nama_alat=?, jumlah=?, kondisi=? WHERE id_alat=?";
        
        try {
            Connection conn = Koneksi.getConnection(); // Mengambil koneksi
            PreparedStatement pst = conn.prepareStatement(sql);
            
            // Mengatur nilai parameter sesuai urutan kolom
            pst.setString(1, nama);
            pst.setString(2, jumlah);
            pst.setString(3, kondisi);
            pst.setString(4, id); // Kunci utama untuk mencari baris yang diubah
            
            baris = pst.executeUpdate(); 
            
        } catch (SQLException e) {
            System.out.println("Error pada Class Update: " + e.getMessage());
        }
        return baris;
    }
}