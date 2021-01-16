/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Connector;

import com.mysql.jdbc.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author victormanuel
 */
public class Tutor_consulta {

    public void Tutor_consulta() {
    } //Metodo constructor
    
    
 
    
    
    public void modificarTutor(int operador, int id, String curp, String tutor, String correo) {

        //Se instancia la clase conexion
        Conexion con = new Conexion();
        String ls_accion = "";

        
         if (operador == 2) { //actualiza los datos del alumno
            ls_accion = "UPDATE alumno "
                    + " SET nombre_tutor = '"+ tutor +"',"
                    + " correo_tutor = '"+ correo +"',"
                    + " eliminar = 'NO'"
                    + " WHERE curp = '" + curp + "'";

        

        try {
            //Realiza la conexion a la base de datos 
            Statement estatuto = con.getConnection().createStatement();

            //Ejecuta la operacion SQL, según selección "ls_accion"
            estatuto.executeUpdate(ls_accion);

            JOptionPane.showMessageDialog(null,
                    "Se ha modificado Exitosamente", "Información",
                    JOptionPane.INFORMATION_MESSAGE);

            //Cierra la conexion a la base de datos
            estatuto.close();
            con.disconnect();
        

        } catch (SQLException e) {
            System.out.println(e.getMessage());
            JOptionPane.showMessageDialog(null,
                    "No se Registro, verifique la consola para ver el error",
                    "Error", JOptionPane.ERROR_MESSAGE);
        }
        
         }

    }


    public void BuscarA(DefaultTableModel modelo, String ap) {

        Conexion conex = new Conexion();
        try {
            //Crea un objeto Statemen, para poder ejecutar una instrucción SQL
            Statement estatuto = conex.getConnection().createStatement();

            //genera un query o consulta de la tabla especificada
            //Y regresa el resultado de la consulta en un objeto ResultSet
            ResultSet rs = estatuto.executeQuery("SELECT curp, apellido_paterno, apellido_materno, nombre, nombre_tutor, correo_tutor"
                    + " FROM alumno WHERE eliminar = 'NO' and apellido_paterno LIKE '%" + ap + "%'");

            //Se recorre la tabla virtual(ResultSet)en la memoria
            while (rs.next()) //Mueve el cursor al siguiente registro
            {
                // es para obtener los datos y almacenar las filas
                Object[] fila = new Object[6];
                // para llenar cada columna con lo datos almacenados
                for (int i = 0; i < 6; i++) {
                    fila[i] = rs.getObject(i + 1);
                }
                // Cargar los datos en filas a la tabla modelo
                modelo.addRow(fila);
            }

            estatuto.close();
            conex.disconnect();

        } catch (SQLException e) {
			System.out.println(e.getMessage());
            JOptionPane.showMessageDialog(null, "Error al consultar y buscar alumno", "Error",
                    JOptionPane.ERROR_MESSAGE);

        }
    }

    
}
