package mainPackage;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class ValidadorDeContraseniasTest{
    private ValidadorDeContrasenias validador = new ValidadorDeContrasenias();

    @Before
    public void init(){
        // String contraseniaCorta = "Fallo";
        String contraseniaLarga = "Mira todos los caracteres que tengo que escribir para que rompas, ya no se que mas poner dios mio, 64 son un monton de caracteres";
        String contraseniaBien = "Klapeusius63";
    }

    @Test
    public void constraseniaEsCorta(){
        String constraseniaCorta = "Fallo";
        Assert.assertFalse(validador.cantidadCaracteresCorrectos(constraseniaCorta));
    }

    @Test
    public void eliminarEspacios(){
        String contraseniaConEspacios = "Wiki  Prueba";
        String objetivo = "Wiki Prueba";
        Assert.assertEquals(objetivo,validador.eliminarEspacios(contraseniaConEspacios));
    }


}
