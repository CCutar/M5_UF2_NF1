import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertThrows;
import java.beans.Transient;
import org.junit.Test;

class TreballadorTest {
    @Test
    public void testNomTreballadorIncorrecte() {

        Treballador treballador = new Treballador();

        Exception excepcioMeva = assertThrows(Exception.class, () -> treballador.setNom(""));

        assertEquals("El nom ha de tenir 3 o més caracters",
                excepcioMeva.getMessage());
    }

    @Test
    public void testNomTreballadorCorrecte() {
        String nomTest = "Montsià";
        Treballador treballador = new Treballador();

        try {
            treballador.setNom(nomTest);
        } catch (Exception e) {

            System.out.println(e.getMessage());
        }

        assertEquals(nomTest, treballador.getNom(), "Els noms han de coincidir!!!");
    }

    @Test
    public void testNomina() {
        float nomina = 2300;
        Treballador treballador = new Treballador();

        treballador.setNomina(nomina);

        assertEquals(nomina, treballador.getNomina(), "Els dos valors de la nomina han de coincidir!!!");
    }

    @Test
    public void testHoresExtres() {
        int horesextra = 10;
        Treballador treballador = new Treballador();
        treballador.setHoresExtres(horesextra);
        ;
        assertEquals(horesextra, treballador.getHoresExtres(), "Els dos valors de la nomina han de coincidir!!!");
    }

    @Test
    public void testTipusTreballadorIncorrecte() {
        int tipus1 = 0;
        int tipus2 = 1;
        Treballador treballador = new Treballador();
        try {
            treballador.setTipusTreballador(tipus1);
        } catch (Exception e) {

            System.out.println(e.getMessage());
        }
        assertNotEquals(tipus2, treballador.getTipusTreballador(), "Els dos valors de la nomina han de coincidir!!!");

    }

    @Test
    public void testTipusTreballadorCorrecte() {
        int tipus = 0;
        Treballador treballador = new Treballador();
        try {
            treballador.setTipusTreballador(tipus);
        } catch (Exception e) {

            System.out.println(e.getMessage());
        }
        ;

        assertEquals(tipus, treballador.getTipusTreballador(), "Els dos valors de la nomina han de coincidir!!!");
    }

}