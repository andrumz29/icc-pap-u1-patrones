package icc.pap.u1.patrones.estructurales.bridge;

public class NotificacionAcademica extends Notificacion {
    public NotificacionAcademica(CanalEnvio canal) {
        super(canal);
    }

    @Override
    public void notificar(String mensaje) {
        canal.enviar("Not Academico: " + mensaje);
    }
}
