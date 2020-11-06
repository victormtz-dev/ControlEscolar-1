/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Connector;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author victormanuel
 */
public class Materia_consulta {
    public void Materia_consulta() {
    } //Metodo constructor
    
     public void Buscarmateria(DefaultTableModel modelo, int grado) {

        Conexion conex = new Conexion();
        try {
            //Crea un objeto Statemen, para poder ejecutar una instrucción SQL
            Statement estatuto = conex.getConnection().createStatement();

            //genera un query o consulta de la tabla especificada
            //Y regresa el resultado de la consulta en un objeto ResultSet
            ResultSet rs = estatuto.executeQuery("SELECT nombre_materia, id_grado"
                    + " FROM materia WHERE id_grado =" + grado + "");

            //Se recorre la tabla virtual(ResultSet)en la memoria
            while (rs.next()) //Mueve el cursor al siguiente registro
            {
                // es para obtener los datos y almacenar las filas
                Object[] fila = new Object[2];
                // para llenar cada columna con lo datos almacenados
                for (int i = 0; i < 2; i++) {
                    fila[i] = rs.getObject(i + 1);
                }
                // Cargar los datos en filas a la tabla modelo
                modelo.addRow(fila);
            }

            estatuto.close();
            conex.disconnect();

        } catch (SQLException e) {
//			System.out.println(e.getMessage());
            JOptionPane.showMessageDialog(null, "Error al consultar y buscar", "Error",
                    JOptionPane.ERROR_MESSAGE);

        }
    }
    
}
