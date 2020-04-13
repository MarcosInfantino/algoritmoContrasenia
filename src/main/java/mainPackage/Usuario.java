package mainPackage;

public class Usuario {
    private String user;
    private String password;

    public String user(){
        return user;
    }

    public String password(){
        return password;
    }
    public void registrate(String usuario, String contrasenia){
        user=usuario;
        password=contrasenia;
    }
}
