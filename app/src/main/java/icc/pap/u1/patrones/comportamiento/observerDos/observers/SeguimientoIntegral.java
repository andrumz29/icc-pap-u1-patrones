package icc.pap.u1.patrones.comportamiento.observerDos.observers;

import java.util.function.Consumer;

import icc.pap.u1.patrones.comportamiento.observerDos.CambioEstudiante;
import icc.pap.u1.patrones.comportamiento.observerDos.EstadoMatricula;

public class SeguimientoIntegral implements Consumer<CambioEstudiante> {

    @Override
    public void accept(CambioEstudiante cambio) {

        var estudiante = cambio.estudiante();

        double promedio = estudiante.getPromedioAcademico();

        int inasistencias = estudiante.getNumeroInasistencias();

        EstadoMatricula estado = estudiante.getEstadoMatricula();

        boolean riesgoActual =
                promedio < 7.0
                && inasistencias >= 6
                && estado == EstadoMatricula.ACTIVO;

        // Obtener los valores anteriores al cambio
        double promedioAnterior = promedio;
        int inasistenciasAnteriores = inasistencias;
        EstadoMatricula estadoAnterior = estado;

        switch (cambio.atributo()) {

            case "promedioAcademico":
                promedioAnterior = (double) cambio.valorAnterior();
                break;

            case "numeroInasistencias":
                inasistenciasAnteriores = (int) cambio.valorAnterior();
                break;

            case "estadoMatricula":
                estadoAnterior =
                        (EstadoMatricula) cambio.valorAnterior();
                break;
        }

        boolean riesgoAnterior =
                promedioAnterior < 7.0
                && inasistenciasAnteriores >= 6
                && estadoAnterior == EstadoMatricula.ACTIVO;

        if (!riesgoAnterior && riesgoActual) {

            System.out.println("[RIESGO INTEGRAL] ALERTA: "
                    + estudiante.getNombreCompleto()
                    + " presenta bajo rendimiento, inasistencias criticas "
                    + "y matrícula activa.");
        }
    }
}