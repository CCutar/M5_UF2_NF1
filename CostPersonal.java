/**
 * Classe per a calcular el cost total de les nomines del personal
 *
 * @author INSMontsià
 *
 */
public class CostPersonal {
    // static enum TipusTreballador{
    // DIRECTOR, SUBDIRECTOR, BASE
    // }
    static float CalculaCostDelPersonal(Treballador treballadors[]) {
        float costFinal = 0; // Declaramos CostFinal
        Treballador treballador;
        for (int i = 0; i < treballadors.length; i++) { // Mientras que hayan trabajadores en la array hará lo siguiente
            treballador = treballadors[i]; // El primer trabajador sera igual a la primer posicion y consecutivamente.
            if (treballador.getTipusTreballador() == Treballador.DIRECTOR // Si el trabajador es Director o Subdirector
                                                                          // el costfinal se sumara a la nomina y nos
                                                                          // devolvera el costfinal.
                    || treballador.getTipusTreballador() == Treballador.SUBDIRECTOR) {
                costFinal += treballador.getNomina();
            } else {
                costFinal += treballador.getNomina() + (treballador.getHoresExtres() * 20); // Si el trabajador es Base
                                                                                            // el costfinal se sumara a
                                                                                            // la nomina y las horas
                                                                                            // extra por 20 que es el
                                                                                            // precio de una hora
            }
        }
        return costFinal;
    }

    static float CostTreballador(Treballador treballador) {
        if (treballador.getTipusTreballador() == Treballador.DIRECTOR // Si el trabajador es Director o Subdirector nos
                                                                      // devolvera la nomida del trabajador
                || treballador.getTipusTreballador() == Treballador.SUBDIRECTOR) {
            return treballador.getNomina();
        } else {
            return treballador.getNomina() + (treballador.getHoresExtres() * 20); // Si el trabajador es Base nos
                                                                                  // devolvera la nomina mas las horas
                                                                                  // extra.
        }
    }

    static float CalculaCostDelPersonal2(Treballador treballadors[]) {
        // Versio refactoritzada del mètode anterior
        float costFinal = 0;
        Treballador treballador;
        for (int i = 0; i < treballadors.length; i++) {
            costFinal = costFinal + CostTreballador(treballadors[i]); // Aqui utilizamo el metodo CostTreballador creado
                                                                      // antes para calcular el CostFinal.
        }
        return costFinal;
    }
}