package icc.pap.u1.patrones.comportamiento.observerDos.observers;

import java.util.function.Consumer;

import icc.pap.u1.patrones.comportamiento.observerDos.CambioEstudiante;
import icc.pap.u1.patrones.comportamiento.observerDos.EstadoMatricula;

public class ControlMatricula implements Consumer<CambioEstudiante> {

    @Override
    public void accept(CambioEstudiante cambio) {

        if (!cambio.atributo().equals("estadoMatricula")) {
            return;
        }

        EstadoMatricula anterior =
                (EstadoMatricula) cambio.valorAnterior();

        EstadoMatricula nuevo =
                (EstadoMatricula) cambio.valorNuevo();

        String nombre = cambio.estudiante().getNombreCompleto();

        if (nuevo == EstadoMatricula.SUSPENDIDO) {

            System.out.println("[MATRICULA] " + nombre
                    + " ha sido SUSPENDIDO.");

        } else if (nuevo == EstadoMatricula.RETIRADO) {

            System.out.println("[MATRICULA] " + nombre
                    + " ha sido RETIRADO.");

        } else if (nuevo == EstadoMatricula.ACTIVO
                && anterior != EstadoMatricula.ACTIVO) {

            System.out.println("[MATRICULA] " + nombre
                    + " ha sido REACTIVADO.");
        }
    }
}