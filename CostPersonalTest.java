import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class CostPersonalTest {

    @Test
    public void testCalculaCostDelPersonalPle() { // Aqui haremos el test con los datos de los trabajadores rellenados
                                                  // completamente
        Treballador treballador1 = new Treballador(null, Treballador.DIRECTOR, 1000, 0);
        Treballador treballador2 = new Treballador(null, Treballador.SUBDIRECTOR, 900, 0);
        Treballador treballador3 = new Treballador(null, Treballador.BASE, 800, 10);

        Treballador[] treballadors = { treballador1, treballador2, treballador3 };

        float resultat = CostPersonal.CalculaCostDelPersonal(treballadors);

        assertEquals((1000 + 900 + 800 + (10 * 20)), resultat, 0); // Aqui el resultado deberia ser 2900 y como podemos
                                                                   // ver el test es valido

    }

    @Test
    public void testCalculaCostDelPersonalVuit() { // Aqii haremos el test con los datos de los trabajadores vacios
        Treballador treballador1 = new Treballador(null, Treballador.DIRECTOR, 0, 0);
        Treballador treballador2 = new Treballador(null, Treballador.SUBDIRECTOR, 0, 0);
        Treballador treballador3 = new Treballador(null, Treballador.BASE, 0, 0);

        Treballador[] treballadors = { treballador1, treballador2, treballador3 };
        float resultat = CostPersonal.CalculaCostDelPersonal(treballadors);

        assertEquals(0, resultat, 0);// El resultado deberia ser 0 y como podemos ver el test es valido

    }

    @Test
    public void testCalculaCostDelPersonalMitjes() { // Aqui haremos el test de Trabajadores a con los datos rellenados
                                                     // a medias
        Treballador treballador1 = new Treballador(null, Treballador.DIRECTOR, 1400, 0);
        Treballador treballador2 = new Treballador(null, Treballador.SUBDIRECTOR, 1400, 0);
        Treballador treballador3 = new Treballador(null, Treballador.BASE, 0, 0);

        Treballador[] treballadors = { treballador1, treballador2, treballador3 };
        float resultat = CostPersonal.CalculaCostDelPersonal(treballadors);

        assertEquals((1400 + 1400), resultat, 0);// El resultado deberia ser 2800 y como podemos ver el test es valido

    }

    @Test
    public void testCalculaCostSensePersonal() { // Aqui haremos el test sin ningun trabajador que el resultado deberia
                                                 // ser 0
        Treballador treballador1 = new Treballador(null, Treballador.DIRECTOR, 1400, 0);
        Treballador treballador2 = new Treballador(null, Treballador.SUBDIRECTOR, 1400, 0);
        Treballador treballador3 = new Treballador(null, Treballador.BASE, 0, 0);

        Treballador[] treballadors = {};
        float resultat = CostPersonal.CalculaCostDelPersonal(treballadors);

        assertEquals(0, resultat, 0);// Aqui el resultado deberia ser 0 y como podemos ver el test es valido

    }

    @Test
    public void testCalculaCostUnPersonal() {// Aqiu haremos el test pero solo con un trabajador
        Treballador treballador1 = new Treballador(null, Treballador.DIRECTOR, 1400, 0);
        Treballador treballador2 = new Treballador(null, Treballador.SUBDIRECTOR, 1400, 0);
        Treballador treballador3 = new Treballador(null, Treballador.BASE, 0, 0);

        Treballador[] treballadors = { treballador1 }; // Heneramos solo un trabajador
        float resultat = CostPersonal.CalculaCostDelPersonal(treballadors);

        assertEquals(1400, resultat, 0); // El resultado es 1400 y como podemos ver el test es valido

    }

    @Test
    public void testCostTreballador() { // Aqui haremos el test para solo un trabajador que es un trabajador Base
        Treballador treballador3 = new Treballador(null, Treballador.BASE, 900, 10);
        float resultat = CostPersonal.CostTreballador(treballador3);

        assertEquals(900 + (10 * 20), resultat, 0); // El resultado deberia ser 1100 y como podemos ver el test es
                                                    // valido

    }

    @Test
    public void testCalculaCostDelPersonal2() { // Aqui haremos el test usando el metodo refacturizado
        Treballador treballador1 = new Treballador(null, Treballador.DIRECTOR, 1400, 0);
        Treballador treballador2 = new Treballador(null, Treballador.SUBDIRECTOR, 1400, 0);
        Treballador treballador3 = new Treballador(null, Treballador.BASE, 900, 10);

        Treballador[] treballadors = { treballador1, treballador2, treballador3 };
        float resultat = CostPersonal.CalculaCostDelPersonal2(treballadors);

        assertEquals(1400 + 1400 + 900 + 200, resultat, 0);

    }
}
