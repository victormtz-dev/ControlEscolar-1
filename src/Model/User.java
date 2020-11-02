package Model;

//Declaración de la subclase User que extiende de Persona
public class User {

    //Declaración de variables de User
    private int idUsuario;
    private String username;
    private String password;
  
    

    public User() {
    }

    //Constructor de la clase User
    public User(int idUsuario, String username, String password) {
        this.idUsuario = idUsuario;
        this.username = username;
        this.password = password;
       
    }

    

    //Setters y Getters
    public int getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(int idUsuario) {
        this.idUsuario = idUsuario;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

   
}
