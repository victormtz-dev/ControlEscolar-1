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
public class Mes {
    int id;
    String mes;
    
     public int getId() {
        return id;
    }
     
     public void setId(int id) {
        this.id = id;
    }
     
     public String getMes() {
        return mes;
    }

    public void setMes(String mes) {
        this.mes = mes;
    }

    @Override
    public String toString() {
        return this.mes;
    }
    
     public Vector<Mes> mostrarMes() {

        PreparedStatement ps = null;
        ResultSet rs = null;
        Conexion conn = new Conexion();
        Connection con = (Connection) conn.getConnection();

        Vector<Mes> datos = new Vector<Mes>();
        Mes dat = null;
        try {

            String sql = "SELECT * FROM mes";
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();

            dat = new Mes();
            dat.setId(0);
            dat.setMes("Selecciona");
            datos.add(dat);

            while (rs.next()) {
                dat = new Mes();
                dat.setId(rs.getInt("id_mes"));
                dat.setMes(rs.getString("descripcion"));
              
                datos.add(dat);
            }
            rs.close();
        } catch (SQLException ex) {
            System.err.println("Error consulta :" + ex.getMessage());
        }
        return datos;
    }
    
    
    
    
    
    
    
    
    
    
}
