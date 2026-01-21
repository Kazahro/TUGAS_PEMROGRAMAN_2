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
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.table.DefaultTableModel;

public class Select {

    public static DefaultTableModel tampilAlat() {
        DefaultTableModel model = new DefaultTableModel();

        // judul kolom JTable
        model.addColumn("ID Alat");
        model.addColumn("Nama Alat");

        try {
            Connection conn = Koneksi.getConnection();
            Statement st = conn.createStatement();
            ResultSet rs = st.executeQuery("SELECT * FROM alat");

            while (rs.next()) {
                model.addRow(new Object[]{
                    rs.getInt("id_alat"),
                    rs.getString("nama_alat")
                });
            }
        } catch (Exception e) {
            System.out.println("Gagal menampilkan data");
            System.out.println(e.getMessage());
        }

        return model;
    }
}
