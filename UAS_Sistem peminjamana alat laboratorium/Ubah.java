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
import javax.swing.JOptionPane;

public class Ubah {
    // Membuat method static agar bisa langsung dipanggil
    public static void updateData(String id, String nama, String status) {
        try {
            // Memanggil koneksi dari class Koneksi
            Connection conn = Koneksi.getConnection();
            
            String sql = "UPDATE peminjaman SET nama_peminjam=?, status=? WHERE id_alat=?";
            
            PreparedStatement pst = conn.prepareStatement(sql);
            pst.setString(1, nama);
            pst.setString(2, status);
            pst.setString(3, id);
            
            pst.executeUpdate();
            JOptionPane.showMessageDialog(null, "Data Berhasil Diubah");
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error pada Class Ubah: " + e.getMessage());
        }
    }
}
