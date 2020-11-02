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

/**
 *
 * @author victormanuel
 */

import com.mysql.jdbc.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Vector;
import Connector.*;

public class Grupo {
    int id;
    String grupo;
    
    
     public int getId() {
        return id;
    }
     
     public void setId(int id) {
        this.id = id;
    }
     
     public String getGrupo() {
        return grupo;
    }

    public void setGrupo(String grupo) {
        this.grupo = grupo;
    }

    @Override
    public String toString() {
        return this.grupo;
    }
    
     public Vector<Grupo> mostrarGrupo() {

        PreparedStatement ps = null;
        ResultSet rs = null;
        Conexion conn = new Conexion();
        Connection con = (Connection) conn.getConnection();

        Vector<Grupo> datos = new Vector<Grupo>();
        Grupo dat = null;
        try {

            String sql = "SELECT * FROM grupo";
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();

            dat = new Grupo();
            dat.setId(0);
            dat.setGrupo("Selecciona");
            datos.add(dat);

            while (rs.next()) {
                dat = new Grupo();
                dat.setId(rs.getInt("id_grupo"));
                dat.setGrupo(rs.getString("letra"));
              
                datos.add(dat);
            }
            rs.close();
        } catch (SQLException ex) {
            System.err.println("Error consulta :" + ex.getMessage());
        }
        return datos;
    }
}
