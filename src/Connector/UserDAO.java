/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Connector;

import Model.User;
import java.sql.*;

/**
 *
 * @author lenov
 */
public class UserDAO {
    
    PreparedStatement ps;
    ResultSet rs;
    
    
    Conexion con=new Conexion();
    Connection access;
    
    //Metodo para verificar si el usuario existe
    public User userValidator(String username, String password){
        
        User user = new User();
        
        String query="SELECT id_usuario, nombre_usuario, contrasena "
                + "FROM usuario WHERE contrasena=? and nombre_usuario=?";
        
        try {
            access=con.getConnection(); //conexion a la base de datos
            ps=access.prepareStatement(query); //lee la instruccion sql
            ps.setString(1, password);
            ps.setString(2, username);
            
            rs=ps.executeQuery();
                       
            while(rs.next()){
     
                user.setUsername(rs.getString(1));
                user.setPassword(rs.getString(2));
       
                
            }
        } catch (Exception e) {
        }
        
        return user;
    
}
    
}
