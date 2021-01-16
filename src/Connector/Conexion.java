package Connector;

import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Conexion {

    private static final String DBNAME = "escuela"; //nombre de la base
    private static final String USER = "root"; //usuario de sgbd
    private static final String PASSWORD = "root"; //contraseña del sgbd
    private static final String URL = "jdbc:mysql://localhost:3306/" + DBNAME; //direccion de donde se encuentra nuestra base

    Connection con = null;

    //Constructor de la clase
    public Conexion() {
        try {
            Class.forName("com.mysql.jdbc.Driver"); //uso del jdbc
            con = (com.mysql.jdbc.Connection) DriverManager.getConnection(this.URL, this.USER, this.PASSWORD);
            if (con != null) {
                System.out.println("¡Conexión Exitosa a : " + DBNAME + "!");
            }
        } catch (SQLException e) {
            System.err.println("errror" + e);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Conexion.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public Connection getConnection() {
        return con; //nos dice si hay conexion
    }

    public Conexion disconnect() {
        con = null;
        if (con == null) {
            System.out.println("¡Conexión Terminada!");   //nos dice cuando se termina la conexion
        }
        return (Conexion) con;
    }
    
    public String getUsuario(){
        return USER;
    }
    
    public String getPass(){
        return PASSWORD;
    }
    
    public String getBD(){
        return DBNAME;
    }
}


