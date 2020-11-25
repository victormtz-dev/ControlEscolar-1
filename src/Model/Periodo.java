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
public class Periodo {
    int id;
    String periodo;
    
     public int getId() {
        return id;
    }
     
     public void setId(int id) {
        this.id = id;
    }
     
     public String getPeriodo() {
        return periodo;
    }

    public void setPeriodo(String periodo) {
        this.periodo = periodo;
    }

    @Override
    public String toString() {
        return this.periodo;
    }
    
     public Vector<Periodo> mostrarPeriodo() {

        PreparedStatement ps = null;
        ResultSet rs = null;
        Conexion conn = new Conexion();
        Connection con = (Connection) conn.getConnection();

        Vector<Periodo> datos = new Vector<Periodo>();
        Periodo dat = null;
        try {

            String sql = "SELECT * FROM periodo";
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();

            dat = new Periodo();
            dat.setId(0);
            dat.setPeriodo("Selecciona");
            datos.add(dat);

            while (rs.next()) {
                dat = new Periodo();
                dat.setId(rs.getInt("id_periodo"));
                dat.setPeriodo(rs.getString("trimestre"));
              
                datos.add(dat);
            }
            rs.close();
        } catch (SQLException ex) {
            System.err.println("Error consulta :" + ex.getMessage());
        }
        return datos;
    }
    
    
    
    
    
    
    
    
    
    
}
