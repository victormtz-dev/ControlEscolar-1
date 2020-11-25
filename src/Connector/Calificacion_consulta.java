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
public class Calificacion_consulta {

    public void Calificacion_consulta() {
    } //Metodo constructor
    
    
    
 public void registrarCalificacion1(int operador, int id, String curp, int grado, double c1, double c2, double c3, double c4, double c5, double c6, double c7, double c8, double c9, int mes, int periodo) {

        //Se instancia la clase conexion
        Conexion con = new Conexion();
        String ls_accion = "";

        //Accion para agregar calificacion a la tabla
        if (operador == 1) {

            ls_accion = "INSERT INTO calificaciones1 VALUES ('"
                    + id + "', '"
                    + curp + "', '"
                    + grado + "', '"
                    + c1 + "', '"
                    + c2 + "', '"
                    + c3 + "', '"
                    + c4 + "', '"
                    + c5 + "', '"
                    + c6 + "', '"
                    + c7 + "', '"
                    + c8 + "', '"
                    + c9 + "', '"
                    + mes + "', '"
                    + periodo + "')";
        

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
            System.out.println(e.getMessage());
            JOptionPane.showMessageDialog(null,
                    "No se Registro, verifique la consola para ver el error *",
                    "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    }
    
 public void registrarCalificacion2(int operador, int id, String curp, int grado, double c1, double c2, double c3, double c4, double c5, double c6, double c7, double c8, double c9, int mes, int periodo) {

        //Se instancia la clase conexion
        Conexion con = new Conexion();
        String ls_accion = "";

        //Accion para agregar calificacion a la tabla
        if (operador == 1) {

            ls_accion = "INSERT INTO calificaciones2 VALUES ('"
                    + id + "', '"
                    + curp + "', '"
                    + grado + "', '"
                    + c1 + "', '"
                    + c2 + "', '"
                    + c3 + "', '"
                    + c4 + "', '"
                    + c5 + "', '"
                    + c6 + "', '"
                    + c7 + "', '"
                    + c8 + "', '"
                    + c9 + "', '"
                    + mes + "', '"
                    + periodo + "')";
        

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
            System.out.println(e.getMessage());
            JOptionPane.showMessageDialog(null,
                    "No se Registro, verifique la consola para ver el error *",
                    "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    }
    
 public void registrarCalificacion3(int operador, int id, String curp, int grado, double c1, double c2, double c3, double c4, double c5, double c6, double c7, double c8, int mes, int periodo) {

        //Se instancia la clase conexion
        Conexion con = new Conexion();
        String ls_accion = "";

        //Accion para agregar calificacion a la tabla
        if (operador == 1) {

            ls_accion = "INSERT INTO calificaciones3 VALUES ('"
                    + id + "', '"
                    + curp + "', '"
                    + grado + "', '"
                    + c1 + "', '"
                    + c2 + "', '"
                    + c3 + "', '"
                    + c4 + "', '"
                    + c5 + "', '"
                    + c6 + "', '"
                    + c7 + "', '"
                    + c8 + "', '"
                    + mes + "', '"
                    + periodo + "')";
        

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
            System.out.println(e.getMessage());
            JOptionPane.showMessageDialog(null,
                    "No se Registro, verifique la consola para ver el error *",
                    "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    }
    
 public void registrarCalificacion4(int operador, int id, String curp, int grado, double c1, double c2, double c3, double c4, double c5, double c6, double c7, double c8, double c9, double c10, int mes, int periodo) {

        //Se instancia la clase conexion
        Conexion con = new Conexion();
        String ls_accion = "";

        //Accion para agregar calificacion a la tabla
        if (operador == 1) {

            ls_accion = "INSERT INTO calificaciones4 VALUES ('"
                    + id + "', '"
                    + curp + "', '"
                    + grado + "', '"
                    + c1 + "', '"
                    + c2 + "', '"
                    + c3 + "', '"
                    + c4 + "', '"
                    + c5 + "', '"
                    + c6 + "', '"
                    + c7 + "', '"
                    + c8 + "', '"
                    + c9 + "', '"
                    + c10 + "', '"
                    + mes + "', '"
                    + periodo + "')";
        

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
            System.out.println(e.getMessage());
            JOptionPane.showMessageDialog(null,
                    "No se Registro, verifique la consola para ver el error *",
                    "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    }
    
 public void registrarCalificacion5(int operador, int id, String curp, int grado, double c1, double c2, double c3, double c4, double c5, double c6, double c7, double c8, double c9, double c10, double c11, int mes, int periodo) {

        //Se instancia la clase conexion
        Conexion con = new Conexion();
        String ls_accion = "";

        //Accion para agregar calificacion a la tabla
        if (operador == 1) {

            ls_accion = "INSERT INTO calificaciones4 VALUES ('"
                    + id + "', '"
                    + curp + "', '"
                    + grado + "', '"
                    + c1 + "', '"
                    + c2 + "', '"
                    + c3 + "', '"
                    + c4 + "', '"
                    + c5 + "', '"
                    + c6 + "', '"
                    + c7 + "', '"
                    + c8 + "', '"
                    + c9 + "', '"
                    + c10 + "', '"
                    + c11 + "', '"
                    + mes + "', '"
                    + periodo + "')";
        

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
            System.out.println(e.getMessage());
            JOptionPane.showMessageDialog(null,
                    "No se Registro, verifique la consola para ver el error *",
                    "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    }
    
 public void registrarCalificacion6(int operador, int id, String curp, int grado, double c1, double c2, double c3, double c4, double c5, double c6, double c7, double c8, double c9, double c10, double c11, int mes, int periodo) {

        //Se instancia la clase conexion
        Conexion con = new Conexion();
        String ls_accion = "";

        //Accion para agregar calificacion a la tabla
        if (operador == 1) {

            ls_accion = "INSERT INTO calificaciones4 VALUES ('"
                    + id + "', '"
                    + curp + "', '"
                    + grado + "', '"
                    + c1 + "', '"
                    + c2 + "', '"
                    + c3 + "', '"
                    + c4 + "', '"
                    + c5 + "', '"
                    + c6 + "', '"
                    + c7 + "', '"
                    + c8 + "', '"
                    + c9 + "', '"
                    + c10 + "', '"
                    + c11 + "', '"
                    + mes + "', '"
                    + periodo + "')";
        

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
            System.out.println(e.getMessage());
            JOptionPane.showMessageDialog(null,
                    "No se Registro, verifique la consola para ver el error *",
                    "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    }
       
    
    
    
    
    
    public void registrarInasistencia(int operador, int id, String curp, int grado, int inasistencia, int mes, int periodo) {

        //Se instancia la clase conexion
        Conexion con = new Conexion();
        String ls_accion = "";

        //Accion para agregar las inasistencias a la tabla
        if (operador == 1) {

            ls_accion = "INSERT INTO inasistencias VALUES ('"
                    + id + "', '"
                    + curp + "', '"
                    + grado + "', '"
                    + inasistencia + "', '"
                    + mes + "', '"
                    + periodo + "')";
        

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
            System.out.println(e.getMessage());
            JOptionPane.showMessageDialog(null,
                    "No se Registro, verifique la consola para ver el error **",
                    "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    }
    
    
    
  
   

    
    
    
    
    
    
    
    
    public void consultaCalificacion1ConTableModel(DefaultTableModel modelo, String curp) {

        Conexion conex = new Conexion();
        try {
            //Crea un objeto Statemen, para poder ejecutar una instrucción SQL
            Statement estatuto = conex.getConnection().createStatement();

            //genera un query o consulta de la tabla especificada
            //Y regresa el resultado de la consulta en un objeto ResultSet
            ResultSet rs = estatuto.executeQuery("SELECT distinct p.trimestre , m.descripcion , cal.curp, cal.calif1 , cal.calif2 , cal.calif3 , cal.calif4 , cal.calif5 , cal.calif6 , cal.calif7 , cal.calif8, cal.calif9 "
                    + " FROM calificaciones1 as cal, grado as g, mes as m, periodo as p WHERE g.id_grado = cal.id_grado and m.id_mes = cal.id_mes and p.id_periodo = cal.id_periodo and cal.id_grado = '1' and cal.curp= '"+curp+"'");

            //Se recorre la tabla virtual(ResultSet)en la memoria
            while (rs.next()) //Mueve el cursor al siguiente registro
            {
                // es para obtener los datos y almacenar las filas
                Object[] fila = new Object[12];
                // para llenar cada columna con lo datos almacenados
                for (int i = 0; i < 12; i++) {
                    fila[i] = rs.getObject(i + 1);
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

    
    public void consultaCalificacion2ConTableModel(DefaultTableModel modelo, String curp) {

        Conexion conex = new Conexion();
        try {
            //Crea un objeto Statemen, para poder ejecutar una instrucción SQL
            Statement estatuto = conex.getConnection().createStatement();

            //genera un query o consulta de la tabla especificada
            //Y regresa el resultado de la consulta en un objeto ResultSet
            ResultSet rs = estatuto.executeQuery("SELECT distinct p.trimestre , m.descripcion , cal.curp, cal.calif1 , cal.calif2 , cal.calif3 , cal.calif4 , cal.calif5 , cal.calif6 , cal.calif7 , cal.calif8, cal.calif9 "
                    + " FROM calificaciones2 as cal, grado as g, mes as m, periodo as p WHERE g.id_grado = cal.id_grado and m.id_mes = cal.id_mes and p.id_periodo = cal.id_periodo and cal.id_grado = '2' and cal.curp= '"+curp+"'");

            //Se recorre la tabla virtual(ResultSet)en la memoria
            while (rs.next()) //Mueve el cursor al siguiente registro
            {
                // es para obtener los datos y almacenar las filas
                Object[] fila = new Object[12];
                // para llenar cada columna con lo datos almacenados
                for (int i = 0; i < 12; i++) {
                    fila[i] = rs.getObject(i + 1);
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
    
   public void consultaCalificacion3ConTableModel(DefaultTableModel modelo, String curp) {

        Conexion conex = new Conexion();
        try {
            //Crea un objeto Statemen, para poder ejecutar una instrucción SQL
            Statement estatuto = conex.getConnection().createStatement();

            //genera un query o consulta de la tabla especificada
            //Y regresa el resultado de la consulta en un objeto ResultSet
            ResultSet rs = estatuto.executeQuery("SELECT distinct p.trimestre , m.descripcion , cal.curp, cal.calif1 , cal.calif2 , cal.calif3 , cal.calif4 , cal.calif5 , cal.calif6 , cal.calif7 , cal.calif8"
                    + " FROM calificaciones3 as cal, grado as g, mes as m, periodo as p WHERE g.id_grado = cal.id_grado and m.id_mes = cal.id_mes and p.id_periodo = cal.id_periodo and cal.id_grado = '3' and cal.curp= '"+curp+"'");

            //Se recorre la tabla virtual(ResultSet)en la memoria
            while (rs.next()) //Mueve el cursor al siguiente registro
            {
                // es para obtener los datos y almacenar las filas
                Object[] fila = new Object[11];
                // para llenar cada columna con lo datos almacenados
                for (int i = 0; i < 11; i++) {
                    fila[i] = rs.getObject(i + 1);
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
    
    public void consultaCalificacion4ConTableModel(DefaultTableModel modelo, String curp) {

        Conexion conex = new Conexion();
        try {
            //Crea un objeto Statemen, para poder ejecutar una instrucción SQL
            Statement estatuto = conex.getConnection().createStatement();

            //genera un query o consulta de la tabla especificada
            //Y regresa el resultado de la consulta en un objeto ResultSet
            ResultSet rs = estatuto.executeQuery("SELECT distinct p.trimestre , m.descripcion , cal.curp, cal.calif1 , cal.calif2 , cal.calif3 , cal.calif4 , cal.calif5 , cal.calif6 , cal.calif7 , cal.calif8, cal.calif9, cal.calif10"
                    + " FROM calificaciones4 as cal, grado as g, mes as m, periodo as p WHERE g.id_grado = cal.id_grado and m.id_mes = cal.id_mes and p.id_periodo = cal.id_periodo and cal.id_grado = '4' and cal.curp= '"+curp+"'");

            //Se recorre la tabla virtual(ResultSet)en la memoria
            while (rs.next()) //Mueve el cursor al siguiente registro
            {
                // es para obtener los datos y almacenar las filas
                Object[] fila = new Object[13];
                // para llenar cada columna con lo datos almacenados
                for (int i = 0; i < 13; i++) {
                    fila[i] = rs.getObject(i + 1);
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
    
    public void consultaCalificacion5ConTableModel(DefaultTableModel modelo, String curp) {

        Conexion conex = new Conexion();
        try {
            //Crea un objeto Statemen, para poder ejecutar una instrucción SQL
            Statement estatuto = conex.getConnection().createStatement();

            //genera un query o consulta de la tabla especificada
            //Y regresa el resultado de la consulta en un objeto ResultSet
            ResultSet rs = estatuto.executeQuery("SELECT distinct p.trimestre , m.descripcion , cal.curp, cal.calif1 , cal.calif2 , cal.calif3 , cal.calif4 , cal.calif5 , cal.calif6 , cal.calif7 , cal.calif8, cal.calif9, cal.calif10, cal.calif11 "
                    + " FROM calificaciones5 as cal, grado as g, mes as m, periodo as p WHERE g.id_grado = cal.id_grado and m.id_mes = cal.id_mes and p.id_periodo = cal.id_periodo and cal.id_grado = '5' and cal.curp= '"+curp+"'");

            //Se recorre la tabla virtual(ResultSet)en la memoria
            while (rs.next()) //Mueve el cursor al siguiente registro
            {
                // es para obtener los datos y almacenar las filas
                Object[] fila = new Object[14];
                // para llenar cada columna con lo datos almacenados
                for (int i = 0; i < 14; i++) {
                    fila[i] = rs.getObject(i + 1);
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
    
    
    public void consultaCalificacion6ConTableModel(DefaultTableModel modelo, String curp) {

        Conexion conex = new Conexion();
        try {
            //Crea un objeto Statemen, para poder ejecutar una instrucción SQL
            Statement estatuto = conex.getConnection().createStatement();

            //genera un query o consulta de la tabla especificada
            //Y regresa el resultado de la consulta en un objeto ResultSet
            ResultSet rs = estatuto.executeQuery("SELECT distinct p.trimestre , m.descripcion , cal.curp, cal.calif1 , cal.calif2 , cal.calif3 , cal.calif4 , cal.calif5 , cal.calif6 , cal.calif7 , cal.calif8, cal.calif9, cal.calif10, cal.calif11 "
                    + " FROM calificaciones6 as cal, grado as g, mes as m, periodo as p WHERE g.id_grado = cal.id_grado and m.id_mes = cal.id_mes and p.id_periodo = cal.id_periodo and cal.id_grado = '6' and cal.curp= '"+curp+"'");

            //Se recorre la tabla virtual(ResultSet)en la memoria
            while (rs.next()) //Mueve el cursor al siguiente registro
            {
                // es para obtener los datos y almacenar las filas
                Object[] fila = new Object[14];
                // para llenar cada columna con lo datos almacenados
                for (int i = 0; i < 14; i++) {
                    fila[i] = rs.getObject(i + 1);
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
    
    public void consultaInasistenciaConTableModel(DefaultTableModel modelo, String curp) {

        Conexion conex = new Conexion();
        try {
            //Crea un objeto Statemen, para poder ejecutar una instrucción SQL
            Statement estatuto = conex.getConnection().createStatement();

            //genera un query o consulta de la tabla especificada
            //Y regresa el resultado de la consulta en un objeto ResultSet
            ResultSet rs = estatuto.executeQuery("SELECT   periodo.trimestre, mes.descripcion, inasistencias.ina"
                    + " from inasistencias, mes, periodo WHERE inasistencias.id_mes = mes.id_mes and inasistencias.id_periodo = periodo.id_periodo and inasistencias.curp= '"+curp+"'");

            //Se recorre la tabla virtual(ResultSet)en la memoria
            while (rs.next()) //Mueve el cursor al siguiente registro
            {
                // es para obtener los datos y almacenar las filas
                Object[] fila = new Object[3];
                // para llenar cada columna con lo datos almacenados
                for (int i = 0; i < 3; i++) {
                    fila[i] = rs.getObject(i + 1);
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
    
    
    
    
    
    
    
    
    
    
    
public void BuscarC1(DefaultTableModel modelo, String ap) {

        Conexion conex = new Conexion();
        try {
            //Crea un objeto Statemen, para poder ejecutar una instrucción SQL
            Statement estatuto = conex.getConnection().createStatement();

            //genera un query o consulta de la tabla especificada
            //Y regresa el resultado de la consulta en un objeto ResultSet
            ResultSet rs = estatuto.executeQuery("SELECT a.curp, a.apellido_paterno, a.apellido_materno, a.nombre, a.id_grado , gp.letra "
                    + " FROM alumno as a, grado as gd, grupo as gp WHERE a.eliminar = 'NO' and a.id_grado = gd.id_grado and a.id_grupo = gp.id_grupo and a.id_grado = '1' and a.apellido_paterno LIKE '%" + ap + "%'");

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
            JOptionPane.showMessageDialog(null, "Error al consultar y buscar", "Error",
                    JOptionPane.ERROR_MESSAGE);

        }
    }

public void BuscarC2(DefaultTableModel modelo, String ap) {

        Conexion conex = new Conexion();
        try {
            //Crea un objeto Statemen, para poder ejecutar una instrucción SQL
            Statement estatuto = conex.getConnection().createStatement();

            //genera un query o consulta de la tabla especificada
            //Y regresa el resultado de la consulta en un objeto ResultSet
            ResultSet rs = estatuto.executeQuery("SELECT a.curp, a.apellido_paterno, a.apellido_materno, a.nombre, a.id_grado , gp.letra "
                    + " FROM alumno as a, grado as gd, grupo as gp WHERE a.eliminar = 'NO' and a.id_grado = gd.id_grado and a.id_grupo = gp.id_grupo and a.id_grado = '2' and a.apellido_paterno LIKE '%" + ap + "%'");

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
            JOptionPane.showMessageDialog(null, "Error al consultar y buscar", "Error",
                    JOptionPane.ERROR_MESSAGE);

        }
    }

public void BuscarC3(DefaultTableModel modelo, String ap) {

        Conexion conex = new Conexion();
        try {
            //Crea un objeto Statemen, para poder ejecutar una instrucción SQL
            Statement estatuto = conex.getConnection().createStatement();

            //genera un query o consulta de la tabla especificada
            //Y regresa el resultado de la consulta en un objeto ResultSet
            ResultSet rs = estatuto.executeQuery("SELECT a.curp, a.apellido_paterno, a.apellido_materno, a.nombre, a.id_grado , gp.letra "
                    + " FROM alumno as a, grado as gd, grupo as gp WHERE a.eliminar = 'NO' and a.id_grado = gd.id_grado and a.id_grupo = gp.id_grupo and a.id_grado = '3' and a.apellido_paterno LIKE '%" + ap + "%'");

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
            JOptionPane.showMessageDialog(null, "Error al consultar y buscar", "Error",
                    JOptionPane.ERROR_MESSAGE);

        }
    }

public void BuscarC4(DefaultTableModel modelo, String ap) {

        Conexion conex = new Conexion();
        try {
            //Crea un objeto Statemen, para poder ejecutar una instrucción SQL
            Statement estatuto = conex.getConnection().createStatement();

            //genera un query o consulta de la tabla especificada
            //Y regresa el resultado de la consulta en un objeto ResultSet
            ResultSet rs = estatuto.executeQuery("SELECT a.curp, a.apellido_paterno, a.apellido_materno, a.nombre, a.id_grado , gp.letra "
                    + " FROM alumno as a, grado as gd, grupo as gp WHERE a.eliminar = 'NO' and a.id_grado = gd.id_grado and a.id_grupo = gp.id_grupo and a.id_grado = '4' and a.apellido_paterno LIKE '%" + ap + "%'");

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
            JOptionPane.showMessageDialog(null, "Error al consultar y buscar", "Error",
                    JOptionPane.ERROR_MESSAGE);

        }
    }

public void BuscarC5(DefaultTableModel modelo, String ap) {

        Conexion conex = new Conexion();
        try {
            //Crea un objeto Statemen, para poder ejecutar una instrucción SQL
            Statement estatuto = conex.getConnection().createStatement();

            //genera un query o consulta de la tabla especificada
            //Y regresa el resultado de la consulta en un objeto ResultSet
            ResultSet rs = estatuto.executeQuery("SELECT a.curp, a.apellido_paterno, a.apellido_materno, a.nombre, a.id_grado , gp.letra "
                    + " FROM alumno as a, grado as gd, grupo as gp WHERE a.eliminar = 'NO' and a.id_grado = gd.id_grado and a.id_grupo = gp.id_grupo and a.id_grado = '5' and a.apellido_paterno LIKE '%" + ap + "%'");

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
            JOptionPane.showMessageDialog(null, "Error al consultar y buscar", "Error",
                    JOptionPane.ERROR_MESSAGE);

        }
    }

public void BuscarC6(DefaultTableModel modelo, String ap) {

        Conexion conex = new Conexion();
        try {
            //Crea un objeto Statemen, para poder ejecutar una instrucción SQL
            Statement estatuto = conex.getConnection().createStatement();

            //genera un query o consulta de la tabla especificada
            //Y regresa el resultado de la consulta en un objeto ResultSet
            ResultSet rs = estatuto.executeQuery("SELECT a.curp, a.apellido_paterno, a.apellido_materno, a.nombre, a.id_grado , gp.letra "
                    + " FROM alumno as a, grado as gd, grupo as gp WHERE a.eliminar = 'NO' and a.id_grado = gd.id_grado and a.id_grupo = gp.id_grupo and a.id_grado = '6' and a.apellido_paterno LIKE '%" + ap + "%'");

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
            JOptionPane.showMessageDialog(null, "Error al consultar y buscar", "Error",
                    JOptionPane.ERROR_MESSAGE);

        }
    }



public void Correo1(DefaultTableModel modelo, String ap) {

        Conexion conex = new Conexion();
        try {
            //Crea un objeto Statemen, para poder ejecutar una instrucción SQL
            Statement estatuto = conex.getConnection().createStatement();

            //genera un query o consulta de la tabla especificada
            //Y regresa el resultado de la consulta en un objeto ResultSet
            ResultSet rs = estatuto.executeQuery("SELECT a.curp, a.apellido_paterno, a.apellido_materno, a.nombre, a.nombre_tutor, a.correo_tutor"
                    + " FROM alumno as a WHERE a.eliminar = 'NO' and a.id_grado = '1' and a.apellido_paterno LIKE '%" + ap + "%'");

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
            JOptionPane.showMessageDialog(null, "Error al consultar y buscar", "Error",
                    JOptionPane.ERROR_MESSAGE);

        }
    }




}
