package icc.pap.u1.patrones.comportamiento.observerDos.observers;

import java.util.function.Consumer;

import icc.pap.u1.patrones.comportamiento.observerDos.CambioEstudiante;
import icc.pap.u1.patrones.comportamiento.observerDos.EstadoMatricula;

public class NotificadorRepresentante implements Consumer<CambioEstudiante> {

    @Override
    public void accept(CambioEstudiante cambio) {

        String nombre = cambio.estudiante().getNombreCompleto();

        switch (cambio.atributo()) {

            case "promedioAcademico":

                double anterior = (double) cambio.valorAnterior();
                double nuevo = (double) cambio.valorNuevo();

                if (anterior >= 6.0 && nuevo < 6.0) {

                    System.out.println("[REPRESENTANTE] Notificar al representante de "
                            + nombre + ": promedio inferior a 6.0.");
                }
                break;

            case "numeroInasistencias":

                int inasistenciasAnteriores =
                        (int) cambio.valorAnterior();

                int inasistenciasNuevas =
                        (int) cambio.valorNuevo();

                if (inasistenciasAnteriores < 8
                        && inasistenciasNuevas >= 8) {

                    System.out.println("[REPRESENTANTE] Notificar al representante de "
                            + nombre + ": tiene 8 o más inasistencias.");
                }
                break;

            case "estadoMatricula":

                EstadoMatricula anteriorEstado =
                        (EstadoMatricula) cambio.valorAnterior();

                EstadoMatricula nuevoEstado =
                        (EstadoMatricula) cambio.valorNuevo();

                if (anteriorEstado != EstadoMatricula.SUSPENDIDO
                        && nuevoEstado == EstadoMatricula.SUSPENDIDO) {

                    System.out.println("[REPRESENTANTE] Notificar al representante de "
                            + nombre + ": matrIcula suspendida.");
                }
                break;
        }
    }
}