
import static org.junit.Assert.assertEquals; //Importamos librerias que necesitamos para hacer Tests.
import org.junit.Test;

public class CheckNumberTest { // Especificamos la clase
    public CheckNumber checkNumber;

    @Test
    public void testComprovaSigneNegativo() { // El primer test que haremos es para verificar que cuando num sea
                                              // negativo que nos devuelva -1
        checkNumber = new CheckNumber(-1d); // Declaramos una variable checkNumber
        double sign = checkNumber.comprovaSigne(); // Guardamos el valor que nos da checkNumber en sign
        assertEquals(sign, -1, 0); // Si sign es igual a -1 el test sera valido

    }

    @Test
    public void testComprovaSignePositivo() { // El segundo test que haremos es para verificar que cuando num sea
                                              // positivo que nos devuelva 1
        checkNumber = new CheckNumber(1d); // Decalaramos la variable checkNumber
        double sign = checkNumber.comprovaSigne(); // Guardamos el valor que nos da checkNumber en sign
        assertEquals(sign, 1, 0); // Si sign es igual a 1 el test sera valido
    }

    @Test
    public void testComprovaSigneZero() { // El tercer test que haremos es para verificar que cuando num sea 0 nos
                                          // devuelva 0
        checkNumber = new CheckNumber(0d); // Decalaramos la variable checkNumber
        double sign = checkNumber.comprovaSigne(); // Guardamos el valor que nos da checkNumber en sign
        assertEquals(sign, 0, 0); // Si sign es igual a 0 el test sera valido
    }
}
