package mainPackage;
import java.util.Scanner;
enum Opcion{
    NEW_ADMIN,
    NEW_USER,
    SIGN_IN
}
public class mainClass {
    public static void main(String [] args){
        System.out.println("Ingrese la opción:\n0-Crear usuario admin\n1-Crear usuario\n2-Iniciar sesión\n");
        Scanner s=new Scanner(System.in);
        int opcion=s.nextInt();
        GestionUsuarios gestion= new GestionUsuarios();
        switch(Opcion.values()[opcion]){
            case NEW_ADMIN: gestion.registrarAdmin();
                break;
            case NEW_USER: gestion.registrarUser();
                break;
            case SIGN_IN: gestion.iniciarSesion();
                break;
            default: break;
        }


    }
}
