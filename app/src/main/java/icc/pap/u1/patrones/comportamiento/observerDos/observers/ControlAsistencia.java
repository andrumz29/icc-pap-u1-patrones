package icc.pap.u1.patrones.comportamiento.observerDos.observers;

import java.util.function.Consumer;

import icc.pap.u1.patrones.comportamiento.observerDos.CambioEstudiante;

public class ControlAsistencia implements Consumer<CambioEstudiante> {

    @Override
    public void accept(CambioEstudiante cambioEstudiante) {

        if (!cambioEstudiante.atributo().equals("numeroInasistencias")) {
            return;
        }

        int anterior = (int) cambioEstudiante.valorAnterior();
        int nuevo = (int) cambioEstudiante.valorNuevo();

        String nivelAnterior = obtenerNivel(anterior);
        String nivelNuevo = obtenerNivel(nuevo);

        if (!nivelAnterior.equals(nivelNuevo)) {

            System.out.println("[ASISTENCIA] "
                    + cambioEstudiante.estudiante().getNombreCompleto()
                    + " cambió de " + nivelAnterior
                    + " a " + nivelNuevo);
        }
    }

    private String obtenerNivel(int inasistencias) {

        if (inasistencias <= 2) {
            return "NORMAL";
        }

        if (inasistencias <= 5) {
            return "ADVERTENCIA";
        }

        return "CRITICO";
    }
}