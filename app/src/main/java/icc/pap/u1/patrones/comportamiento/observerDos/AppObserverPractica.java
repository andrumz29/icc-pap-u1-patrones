package icc.pap.u1.patrones.comportamiento.observerDos;

import java.util.function.Consumer;

import icc.pap.u1.patrones.comportamiento.observerDos.observers.ControlAsistencia;
import icc.pap.u1.patrones.comportamiento.observerDos.observers.ControlMatricula;
import icc.pap.u1.patrones.comportamiento.observerDos.observers.NotificadorRepresentante;
import icc.pap.u1.patrones.comportamiento.observerDos.observers.SeguimientoAcademico;
import icc.pap.u1.patrones.comportamiento.observerDos.observers.SeguimientoIntegral;

public class AppObserverPractica {

    public static void main(String[] args) {

        // CREAR ESTUDIANTES

        Estudiante ana = new Estudiante(
                "EST001", "Ana Torres", 8.5, 1,
                EstadoMatricula.ACTIVO);

        Estudiante luis = new Estudiante(
                "EST002", "Luis Pérez", 7.2, 4,
                EstadoMatricula.ACTIVO);

        Estudiante maria = new Estudiante(
                "EST003", "María López", 9.1, 0,
                EstadoMatricula.ACTIVO);


        // OBSERVADOR 1: AUDITORÍA
        // MOSTRAR ESTUDIANTES REGISTRADOS

        System.out.println("\n========== ESTUDIANTES REGISTRADOS ==========");

        System.out.printf("%-12s %-18s %-12s %-15s %-12s%n",
        "Código", "Nombre", "Promedio", "Inasistencias", "Estado");

        System.out.printf("%-12s %-18s %-12s %-15s %-12s%n",
        ana.getCodigo(), ana.getNombreCompleto(),
        ana.getPromedioAcademico(), ana.getNumeroInasistencias(),
        ana.getEstadoMatricula());

        System.out.printf("%-12s %-18s %-12s %-15s %-12s%n",
        luis.getCodigo(), luis.getNombreCompleto(),
        luis.getPromedioAcademico(), luis.getNumeroInasistencias(),
        luis.getEstadoMatricula());

        System.out.printf("%-12s %-18s %-12s %-15s %-12s%n",
        maria.getCodigo(), maria.getNombreCompleto(),
        maria.getPromedioAcademico(), maria.getNumeroInasistencias(),
        maria.getEstadoMatricula());
        Consumer<CambioEstudiante> auditoria = cambio -> {

            System.out.printf("[AUDITORÍA] %s | %s | %s -> %s%n",
                    cambio.estudiante().getNombreCompleto(),
                    cambio.atributo(),
                    cambio.valorAnterior(),
                    cambio.valorNuevo());
        };


        // OBSERVADOR 2: SEGUIMIENTO ACADÉMICO

        SeguimientoAcademico seguimiento = new SeguimientoAcademico();


        // OBSERVADOR 3: CONTROL DE ASISTENCIA

        ControlAsistencia asistencia = new ControlAsistencia();


        // OBSERVADOR 4: CONTROL DE MATRÍCULA

        ControlMatricula matricula = new ControlMatricula();


        // OBSERVADOR 5: SEGUIMIENTO INTEGRAL

        SeguimientoIntegral integral = new SeguimientoIntegral();


        // SUSCRIBIR OBSERVADORES A LOS TRES ESTUDIANTES

        Estudiante[] estudiantes = {ana, luis, maria};

        for (Estudiante estudiante : estudiantes) {

            estudiante.suscribir(auditoria);
            estudiante.suscribir(seguimiento);
            estudiante.suscribir(asistencia);
            estudiante.suscribir(matricula);
            estudiante.suscribir(integral);
        }


        // CASO 1: DISMINUCIÓN DEL RENDIMIENTO ACADÉMICO

        System.out.println("\n========== CASO 1 ==========");

        ana.setPromedioAcademico(6.5);


        // CASO 2: RECUPERACIÓN ACADÉMICA

        System.out.println("\n========== CASO 2 ==========");

        ana.setPromedioAcademico(7.8);


        // CASO 3: CAMBIO DE NIVEL DE ASISTENCIA

        System.out.println("\n========== CASO 3 ==========");

        luis.setNumeroInasistencias(7);


        // CASO 4: MODIFICACIÓN DEL ESTADO DE MATRÍCULA

        System.out.println("\n========== CASO 4 ==========");

        maria.setEstadoMatricula(EstadoMatricula.SUSPENDIDO);

        maria.setEstadoMatricula(EstadoMatricula.ACTIVO);


        // CASO 5: IDENTIFICACIÓN DE RIESGO INTEGRAL

        System.out.println("\n========== CASO 5 ==========");

        luis.setPromedioAcademico(6.4);


        // CASO 6: MODIFICACIONES SIN CAMBIOS REALES

        System.out.println("\n========== CASO 6 ==========");

        maria.setPromedioAcademico(9.1);

        maria.setNumeroInasistencias(0);

        maria.setEstadoMatricula(EstadoMatricula.ACTIVO);


        // CASO 7: OBSERVACIÓN DE MÚLTIPLES ESTUDIANTES

        System.out.println("\n========== CASO 7 ==========");

        ana.setPromedioAcademico(7.4);

        ana.setNumeroInasistencias(2);

        luis.setPromedioAcademico(6.8);

        maria.setPromedioAcademico(8.9);

        maria.setNumeroInasistencias(3);


        // CASO 8: INCORPORACIÓN DE UN NUEVO OBSERVADOR

        System.out.println("\n========== CASO 8 ==========");

        NotificadorRepresentante representante =
                new NotificadorRepresentante();

        // Suscribir únicamente a Ana y Luis

        ana.suscribir(representante);

        luis.suscribir(representante);


        // Probar promedio inferior a 6

        ana.setPromedioAcademico(5.8);

        // Probar inasistencias iguales o superiores a 8

        luis.setNumeroInasistencias(8);

        // Probar promedio inferior a 6 en Luis

        luis.setPromedioAcademico(5.9);

        // Probar matrícula suspendida

        ana.setEstadoMatricula(EstadoMatricula.SUSPENDIDO);

    }
}