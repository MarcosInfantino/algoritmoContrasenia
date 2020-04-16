package mainPackage;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class ValidadorDeContraseniasTest {
    private ValidadorDeContrasenias validador = new ValidadorDeContrasenias();

    @Before
    public void init() {
        validador.cargarContraseniasComunes();
    }

    @Test
    public void constraseniaEsCorta() {
        String constraseniaCorta = "Fallo";
        Assert.assertFalse(validador.cantidadCaracteresCorrectos(constraseniaCorta));
    }

    @Test
    public void contraseniaEsLarga() {
        String contraseniaLarga = "Mira todos los caracteres que tengo que escribir para que rompas, ya no se que mas poner dios mio, 64 son un monton de caracteres";
        Assert.assertFalse(validador.cantidadCaracteresCorrectos(contraseniaLarga));
    }

    @Test
    public void tieneCaracteresRepetidos() {
        String caracteresRepetidos = "aaaa";
        Assert.assertTrue(validador.mismoCaracter(caracteresRepetidos));
    }

    @Test
    public void tieneLetrasSecuenciales(){
        String contraseniaSecuencial = "git.abft";
        Assert.assertTrue(validador.mismoCaracter(contraseniaSecuencial));
    }

    @Test
    public void tieneNumerosSecuenciales(){
        String contraseniaSecuencial = "mas12si";
        Assert.assertTrue(validador.mismoCaracter(contraseniaSecuencial));
    }

    @Test
    public void esUnaContraseniaComun() {
        String contraseniaComun = "pandas";
        Assert.assertTrue(validador.esContraseniaComun(contraseniaComun));
    }

    @Test
    public void esUnaContraseniaSegura() {
        String contraseniaSegura = "Miting132prueba";
        Assert.assertTrue(validador.contraseniaSegura(contraseniaSegura));
    }

/*    @Test
    public void eliminarEspacios(){
        String contraseniaConEspacios = "Wiki  Prueba";
        String objetivo = "Wiki Prueba";
        Assert.assertEquals(objetivo,validador.eliminarEspacios(contraseniaConEspacios));
    }
*/

}
