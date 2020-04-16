package mainPackage;

import java.util.Scanner;

enum Opcion{
    NEW_ADMIN,
    NEW_USER,
    SIGN_IN
}
public class mainClass {
    public static void main(String[] args) {
        ValidadorDeContrasenias v = new ValidadorDeContrasenias();
        System.out.println("Ingrese la contraseña: ");
        Scanner var = new Scanner(System.in);
        System.out.println("Confirme su contraseña: ");
        Scanner varConfirmacion = new Scanner(System.in);
        //System.out.println(var);
        if (varConfirmacion.nextLine() == var.nextLine()) {
            //v.eliminarEspacios(var.nextLine());
            if (v.contraseniaSegura(var.nextLine())) {
                System.out.println("Contrasenia aceptada.");
            } else {
                System.out.println("Las contraseñas no coinciden.");
            }
        }
    }
}
