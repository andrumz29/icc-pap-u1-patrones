

package icc.pap.u1.patrones.comportamiento.observerDos;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

public class Estudiante {

    private String codigo;
    private String nombreCompleto;
    private double promedioAcademico;
    private int numeroInasistencias;
    private EstadoMatricula estadoMatricula;

    private final List<Consumer<CambioEstudiante>> listaObservers;

    public Estudiante(String codigo, String nombreCompleto,
            double promedioAcademico, int numeroInasistencias,
            EstadoMatricula estadoMatricula) {

        this.codigo = codigo;
        this.nombreCompleto = nombreCompleto;
        this.promedioAcademico = promedioAcademico;
        this.numeroInasistencias = numeroInasistencias;
        this.estadoMatricula = estadoMatricula;

        this.listaObservers = new ArrayList<>();
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {

        if (Objects.equals(this.codigo, codigo)) return;

        String codigoViejo = this.codigo;
        this.codigo = codigo;

        CambioEstudiante cmbEst = new CambioEstudiante(
                this, "codigo", codigoViejo, codigo);

        notificar(cmbEst);
    }

    public String getNombreCompleto() {
        return nombreCompleto;
    }

    public void setNombreCompleto(String nombreCompleto) {

        if (Objects.equals(this.nombreCompleto, nombreCompleto)) return;

        String nombreViejo = this.nombreCompleto;
        this.nombreCompleto = nombreCompleto;

        CambioEstudiante cmbEst = new CambioEstudiante(
                this, "nombreCompleto", nombreViejo, nombreCompleto);

        notificar(cmbEst);
    }

    public double getPromedioAcademico() {
        return promedioAcademico;
    }

    public void setPromedioAcademico(double promedioAcademico) {

        if (Double.compare(this.promedioAcademico, promedioAcademico) == 0) return;

        double promedioViejo = this.promedioAcademico;
        this.promedioAcademico = promedioAcademico;

        CambioEstudiante cmbEst = new CambioEstudiante(
                this, "promedioAcademico", promedioViejo, promedioAcademico);

        notificar(cmbEst);
    }

    public int getNumeroInasistencias() {
        return numeroInasistencias;
    }

    public void setNumeroInasistencias(int numeroInasistencias) {

        if (this.numeroInasistencias == numeroInasistencias) return;

        int inasistenciasViejas = this.numeroInasistencias;
        this.numeroInasistencias = numeroInasistencias;

        CambioEstudiante cmbEst = new CambioEstudiante(
                this, "numeroInasistencias",
                inasistenciasViejas, numeroInasistencias);

        notificar(cmbEst);
    }

    public EstadoMatricula getEstadoMatricula() {
        return estadoMatricula;
    }

    public void setEstadoMatricula(EstadoMatricula estadoMatricula) {

        if (this.estadoMatricula == estadoMatricula) return;

        EstadoMatricula estadoViejo = this.estadoMatricula;
        this.estadoMatricula = estadoMatricula;

        CambioEstudiante cmbEst = new CambioEstudiante(
                this, "estadoMatricula",
                estadoViejo, estadoMatricula);

        notificar(cmbEst);
    }

    // SUSCRIBIR OBSERVADORES

    public void suscribir(Consumer<CambioEstudiante> observer) {
        listaObservers.add(observer);
    }

    // ELIMINAR OBSERVADORES

    public void desuscribir(Consumer<CambioEstudiante> observer) {
        listaObservers.remove(observer);
    }

    // NOTIFICAR CAMBIOS

    public void notificar(CambioEstudiante estudiante) {

        for (Consumer<CambioEstudiante> cambEst :
                new ArrayList<>(listaObservers)) {

            cambEst.accept(estudiante);
        }
    }

    @Override
    public String toString() {

        return "Est. [codigo=" + codigo
                + ", nombreCompleto=" + nombreCompleto
                + ", promedioAcademico=" + promedioAcademico
                + ", numeroInasistencias=" + numeroInasistencias
                + ", estadoMatricula=" + estadoMatricula
                + "]";
    }
}