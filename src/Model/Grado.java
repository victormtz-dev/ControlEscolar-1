/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;
import com.mysql.jdbc.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Vector;
import Connector.*;
/**
 *
 * @author victormanuel
 */
public class Grado {
    int id;
    String grado;
    
     public int getId() {
        return id;
    }
     
     public void setId(int id) {
        this.id = id;
    }
     
     public String getGrado() {
        return grado;
    }

    public void setGrado(String grado) {
        this.grado = grado;
    }

    @Override
    public String toString() {
        return this.grado;
    }
    
     public Vector<Grado> mostrarGrado() {

        PreparedStatement ps = null;
        ResultSet rs = null;
        Conexion conn = new Conexion();
        Connection con = (Connection) conn.getConnection();

        Vector<Grado> datos = new Vector<Grado>();
        Grado dat = null;
        try {

            String sql = "SELECT * FROM grado";
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();

            dat = new Grado();
            dat.setId(0);
            dat.setGrado("Selecciona");
            datos.add(dat);

            while (rs.next()) {
                dat = new Grado();
                dat.setId(rs.getInt("id_grado"));
                dat.setGrado(rs.getString("descripcion"));
              
                datos.add(dat);
            }
            rs.close();
        } catch (SQLException ex) {
            System.err.println("Error consulta :" + ex.getMessage());
        }
        return datos;
    }
    
    
    
    
    
    
    
    
    
    
}
