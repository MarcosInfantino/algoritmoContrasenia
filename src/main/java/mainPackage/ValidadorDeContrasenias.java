package mainPackage;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class ValidadorDeContrasenias {

    ArrayList<String> malasContrasenias;

    public ArrayList<String> getMalasContrasenias() {
        return malasContrasenias;
    }

    public void setMalasContrasenias(ArrayList<String> malasContrasenias) {
        this.malasContrasenias = malasContrasenias;
    }

    //-------------------------- Cargar Contraseñas --------------------------//

    public void validadorDeContrasenias() {
        this.cargarContraseniasComunes();
    }

    public void cargarContraseniasComunes() {
        try {//"/C/Users/marco/IdeaProjects/algoritmoContrasenias/contraseniasComunes.txt"
            File archivoContrasenias = new File("contraseniasComunes.txt");
            Scanner sc = new Scanner(archivoContrasenias);
            ArrayList<String> arrayStrings = new ArrayList<String>();
            for (int i = 0; sc.hasNext(); i++) {
                String s = sc.next();
                arrayStrings.add(s);

            }
            this.setMalasContrasenias(arrayStrings);
            sc.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

    }

    // -------------------------- Validaciones Debiles -------------------------- //

    public boolean contraseniaSegura(String contrasenia) {
        boolean aux = this.cantidadCaracteresCorrectos(contrasenia) &&
                !(this.esContraseniaComun(contrasenia) &&
                this.mismoCaracter(contrasenia));
        if(!aux){ System.out.println("Contraseña no aceptada"); }
        return aux;
    }

    public boolean cantidadCaracteresCorrectos(String contrasenia) {
        boolean x = contrasenia.length() >= 8 && contrasenia.length() <= 64;
        if (!x) {
            System.out.println("La cantidad de caracteres es incorrecta, deber ser mayor a 8 y menor a 64");
        }
        return x;
    }

    public boolean esContraseniaComun(String contrasenia) {
        boolean x = malasContrasenias.contains(contrasenia);
        if (x) {
            System.out.println("Contrasenia debil");
        }
        return x;
    }

    public boolean mismoCaracter(String contrasenia) {
        char caracterGuia = contrasenia.charAt(0);
        int i;
        for (i = 0; i < contrasenia.length() &&
                contrasenia.charAt(i) != caracterGuia &&
                contrasenia.charAt(i) + 1 != contrasenia.charAt(i+1); i++) {
            caracterGuia = contrasenia.charAt(i);
        }
        boolean x = i != contrasenia.length();
        //if(x){System.out.println("Aca estoy");}
        if (x) {
            System.out.println("La contrasenia tiene al menos dos caracteres iguales seguidos o dos caracteres secuenciales seguidos");
        }
        return x;
    }

    // -------------------------- Eliminar Espacios -------------------------- //

    public String eliminarEspacios(String contrasenia) {
        boolean seCambio = false;
        if(contrasenia.contains("W")){ System.out.println("Llego perro");}
        /*while(contrasenia.contains("  ")){
            contrasenia.replaceAll("  "," ");
            seCambio = true;
        }*/
        if(seCambio){
            System.out.println("Los multiples espacios de tu contrasenia se han modificado por un espacio solo");
        }
        return contrasenia;
    }
}
