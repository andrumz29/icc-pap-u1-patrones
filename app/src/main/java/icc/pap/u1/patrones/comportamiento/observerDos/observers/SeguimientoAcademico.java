package icc.pap.u1.patrones.comportamiento.observerDos.observers;

import java.util.function.Consumer;

import icc.pap.u1.patrones.comportamiento.observerDos.CambioEstudiante;

public class SeguimientoAcademico implements Consumer<CambioEstudiante> {

    @Override
    public void accept(CambioEstudiante cambioEstudiante) {

        if (!cambioEstudiante.atributo().equals("promedioAcademico")) {
            return;
        }

        double anterior = (double) cambioEstudiante.valorAnterior();
        double nuevo = (double) cambioEstudiante.valorNuevo();

        // Detectar bajo rendimiento
        if (anterior >= 7.0 && nuevo < 7.0) {

            System.out.println("[ACADEMICO] Bajo rendimiento: "
                    + cambioEstudiante.estudiante().getNombreCompleto());

        }

        // Detectar recuperación académica
        if (anterior < 7.0 && nuevo >= 7.0) {

            System.out.println("[ACADÉMICO] RecuperaciOn académica: "
                    + cambioEstudiante.estudiante().getNombreCompleto());
        }
    }
}