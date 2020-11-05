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
public class Alumno_consulta {
    
    public void Alumno_consulta(){} //Metodo constructor
    
    public void registrarAlumno (int operador, int id, String ap, String am, String nom, String sexo, String curp, String tutor, String correo, int grado, int grupo, String eliminar, int edad){
       
        //Se instancia la clase conexion
        Conexion con = new Conexion();
        String ls_accion="";
        
        //Accion para agregar alumno a la tabla
        if (operador == 1){
        
            
            ls_accion = "INSERT INTO alumno VALUES ('" 
                    + id + "', '"
                    + curp + "', '"
                    + ap + "', '"
                    + am + "', '"
                    + nom + "', '"
                    + sexo + "', '"
                    + tutor + "', '"
                    + correo + "', '"
                    + grado + "', '"
                    + grupo + "', '"
                    + eliminar + "', '"
                    + edad + "')";
        
        
        try {
                        //Realiza la conexion a la base de datos 
			Statement estatuto = con.getConnection().createStatement();
                        
                        //Ejecuta la operacion SQL, según selección "ls_accion"
			estatuto.executeUpdate(ls_accion);
                                               
			JOptionPane.showMessageDialog(null,
					"Se ha registrado Exitosamente", "Información",
					JOptionPane.INFORMATION_MESSAGE);
                        
                        //Cierra la conexion a la base de datos
			estatuto.close();
			con.disconnect();
                        
		} catch (SQLException e) {
			//System.out.println(e.getMessage());
			JOptionPane.showMessageDialog(null,
					"No se Registro, verifique la consola para ver el error",
					"Error", JOptionPane.ERROR_MESSAGE);
		}
        
        }
        
        
    }
    
    
    
    public int existeAlumno(String curp){
        
        PreparedStatement ps = null;
        ResultSet rs = null;
        Conexion con = new Conexion();
        String ls_accion="";
        
        
        ls_accion = "SELECT count(id_alumno) FROM alumno Where eliminar = 'NO' and curp = ?";
        
        
          try {
                       
                        
                      ps = (PreparedStatement) con.getConnection().prepareStatement(ls_accion);
                      ps.setString(1,curp);
                      rs = ps.executeQuery();
                        
                        if(rs.next()){
                            return rs.getInt(1);
                        }
                                
                        return 1;
			
                        
                        //Cierra la conexion a la base de datos
			//estatuto.close();
			//con.disconnect();
                        
		} catch (SQLException e) {
			//System.out.println(e.getMessage());
			JOptionPane.showMessageDialog(null,
					"No se Registro, verifique la consola para ver el error",
					"Error", JOptionPane.ERROR_MESSAGE);
                        return 1;
		}
    }
    
    public void consultaAlumnosConTableModel(DefaultTableModel modelo) {

		Conexion conex = new Conexion();
		try {
                        //Crea un objeto Statemen, para poder ejecutar una instrucción SQL
			Statement estatuto = conex.getConnection().createStatement();
                        
                        //genera un query o consulta de la tabla especificada
                        //Y regresa el resultado de la consulta en un objeto ResultSet
			ResultSet rs = estatuto.executeQuery("SELECT a.curp, a.apellido_paterno, a.apellido_materno, a.nombre, a.sexo, a.edad, a.nombre_tutor, a.correo_tutor, gd.descripcion, gp.letra "
                                + " FROM alumno as a, grado as gd, grupo as gp WHERE a.eliminar = 'NO' and a.id_grado = gd.id_grado and a.id_grupo = gp.id_grupo");
                        
                        
                        //Se recorre la tabla virtual(ResultSet)en la memoria
			while (rs.next()) //Mueve el cursor al siguiente registro
                        {
				// es para obtener los datos y almacenar las filas
				Object[] fila = new Object[10];
				// para llenar cada columna con lo datos almacenados
				for (int i = 0; i < 10; i++) {
					fila[i] = rs.getObject(i+1);                                        
                                }
				// Cargar los datos en filas a la tabla modelo
				modelo.addRow(fila);
			}
                       
                        estatuto.close();
			conex.disconnect();

		} catch (SQLException e) {
//			System.out.println(e.getMessage());
			JOptionPane.showMessageDialog(null, "Error al consultar", "Error",
					JOptionPane.ERROR_MESSAGE);

		}
	}
    
    
    public void BuscarAlumno(DefaultTableModel modelo, String ap) {

		Conexion conex = new Conexion();
		try {
                        //Crea un objeto Statemen, para poder ejecutar una instrucción SQL
			Statement estatuto = conex.getConnection().createStatement();
                        
                        //genera un query o consulta de la tabla especificada
                        //Y regresa el resultado de la consulta en un objeto ResultSet
			ResultSet rs = estatuto.executeQuery("SELECT a.curp, a.apellido_paterno, a.apellido_materno, a.nombre, a.sexo, a.edad, gd.descripcion, gp.letra "
                                + " FROM alumno as a, grado as gd, grupo as gp WHERE a.eliminar = 'NO' and a.id_grado = gd.id_grado and a.id_grupo = gp.id_grupo and a.apellido_paterno LIKE '%"+ap+"%'");
                        
                        
                        //Se recorre la tabla virtual(ResultSet)en la memoria
			while (rs.next()) //Mueve el cursor al siguiente registro
                        {
				// es para obtener los datos y almacenar las filas
				Object[] fila = new Object[8];
				// para llenar cada columna con lo datos almacenados
				for (int i = 0; i < 8; i++) {
					fila[i] = rs.getObject(i+1);                                        
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
    
    
    public void BuscarAlumnoxGG(DefaultTableModel modelo, int grado, int grupo) {

		Conexion conex = new Conexion();
		try {
                        //Crea un objeto Statemen, para poder ejecutar una instrucción SQL
			Statement estatuto = conex.getConnection().createStatement();
                        
                        //genera un query o consulta de la tabla especificada
                        //Y regresa el resultado de la consulta en un objeto ResultSet
			ResultSet rs = estatuto.executeQuery("SELECT a.curp, a.apellido_paterno, a.apellido_materno, a.nombre, a.sexo, a.edad, gd.descripcion, gp.letra "
                                + " FROM alumno as a, grado as gd, grupo as gp WHERE a.eliminar = 'NO' and a.id_grado = gd.id_grado and a.id_grupo = gp.id_grupo and a.id_grado ="+grado+" and a.id_grupo ="+grupo+" order by a.apellido_paterno asc");
                        
                        
                        //Se recorre la tabla virtual(ResultSet)en la memoria
			while (rs.next()) //Mueve el cursor al siguiente registro
                        {
				// es para obtener los datos y almacenar las filas
				Object[] fila = new Object[8];
				// para llenar cada columna con lo datos almacenados
				for (int i = 0; i < 8; i++) {
					fila[i] = rs.getObject(i+1);                                        
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
