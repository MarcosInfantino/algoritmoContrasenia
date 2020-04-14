package mainPackage;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class validadorDeContrasenias {

    ArrayList<String> malasContrasenias;

    public void cargarContraseniasComunes(){
        try{//"/C/Users/marco/IdeaProjects/algoritmoContrasenias/contraseniasComunes.txt"
            File archivoContrasenias=new File("contraseniasComunes.txt");
            Scanner sc= new Scanner(archivoContrasenias);
            ArrayList<String> arrayStrings=new ArrayList<String>();
            for(int i=0;sc.hasNext();i++){
                String s=sc.next();
                arrayStrings.add(s);

            }
            this.setMalasContrasenias(arrayStrings);
            sc.close();
        }
        catch (FileNotFoundException e) {
            e.printStackTrace();
        }

    }
    boolean esContraseniaComun(String contrasenia){
        boolean x=malasContrasenias.contains(contrasenia);
        if(x){
            System.out.println("Es una contraseña común");
        }
        return x;
    }
    public boolean contraseniaSegura(String contrasenia){
        return cantidadCaracteresCorrectos(contrasenia) &&
                !esContraseniaComun(contrasenia) &&
                !mismoCaracter(contrasenia);

    }
    public validadorDeContrasenias(){
        this.cargarContraseniasComunes();
    }
    public boolean contraseniaComun(String contrasenia){

        return false;
    }
    public boolean cantidadCaracteresCorrectos(String contrasenia){
        boolean x=contrasenia.length()>=8 && contrasenia.length()<=64;
        if(!x){
            System.out.println("La cantidad de caracteres es incorrecta");
        }
        return x;

    }
    public boolean mismoCaracter(String contrasenia){
        char primerCaracter =contrasenia.charAt(0);
        int i;
        for(i=0;i<contrasenia.length()&&contrasenia.charAt(i)!=primerCaracter;i++) {

        }
        boolean x=i!=contrasenia.length();
        if(x){
            System.out.println("La contraseña repite caracteres todo el tiempo");
        }
        return x;
    }



    public ArrayList<String> getMalasContrasenias() {
        return malasContrasenias;
    }

    public void setMalasContrasenias(ArrayList<String> malasContrasenias) {
        this.malasContrasenias = malasContrasenias;
    }
}
