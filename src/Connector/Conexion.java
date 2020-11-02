
package Connector;

import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;


public class Conexion {
	private static final String DBNAME="escuela";
	private static final String USER="root";
	private static final  String PASSWORD="root";
	private static final  String URL="jdbc:mysql://localhost:3306/"+DBNAME;

	Connection con=null;
	//Constructor de la clase
	public Conexion(){
		    try{
            Class.forName("com.mysql.jdbc.Driver");
            con = (com.mysql.jdbc.Connection) DriverManager.getConnection(this.URL, this.USER, this.PASSWORD);
            if (con!=null) {
				System.out.println("¡Conexión Exitosa a : "+DBNAME+"!");
			}
        } catch(SQLException e)
        {
            System.err.println("errror" +e);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Conexion.class.getName()).log(Level.SEVERE, null, ex);
        }
	}
	public Connection getConnection(){
		return con;
	}
	public Conexion disconnect(){
            con=null;
		if(con==null){
                    System.out.println("¡Conexión Terminada!");   
                }
            return (Conexion) con;
	}
}



