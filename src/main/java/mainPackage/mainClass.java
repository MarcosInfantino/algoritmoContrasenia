package mainPackage;

import java.util.ArrayList;
import java.util.Scanner;

enum Opcion{
    NEW_ADMIN,
    NEW_USER,
    SIGN_IN
}
public class mainClass {
    public static void main(String [] args) {
        validadorDeContrasenias v=new validadorDeContrasenias();
       System.out.println("Ingrese la contraseña: ");
        Scanner var= new Scanner(System.in);

       // System.out.println(var);

        if(v.contraseniaSegura(var.nextLine())){
            System.out.println("La contraseña es segura.");
        }else{
            System.out.println("La contraseña es insegura.");
        }

    }
}
