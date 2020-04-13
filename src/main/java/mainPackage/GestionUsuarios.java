package mainPackage;
import java.util.ArrayList;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.Scanner;
import java.util.StringTokenizer;

public class GestionUsuarios {
    ArrayList<Usuario> users=new ArrayList<Usuario>();
    File malasContrasenias= new File("contraseniasComunes.txt");
    public void registrarAdmin(){

    }
    public void registrarUser(){

    }
    public void iniciarSesion(){

    }
    public void registrarPersona() {
        System.out.println("Ingrese");
    }
    /*public void contraseniaAdecuadaAdmin(String contrasenia){

    }*/
    public void contraseniaAdecuada(String contrasenia){

    }
    public void registrarUsuario(String usuario, String contrasenia){

    }


    public boolean contraseniaComun(String contrasenia){
            BufferedReader leerArchivo = new BufferedReader(new FileReader(this.malasContrasenias));
            String lineaLeida;

            while((lineaLeida = leerArchivo.readLine()) != null) {
                for(int i = 0 ; i < palabras.length ; i++) {
                    if(lineaLeida.equals(contrasenia)) {
                       return true;

                    }
                }
            }
        return false;
    }
    public boolean cantidadCaracteresCorrectos(String contrasenia){
        return contrasenia.length()>=8 && contrasenia.length()<=64;
    }
    public boolean mismoCaracter(String contrasenia){
        char primerCaracter =charAt(0);
        int i;
        for(i=0;i<contrasenia.length()&&contrasenia.charAt(i)!=primerCaracter;i++) {

        }
        return i!=contrasenia.size();
    }

}
