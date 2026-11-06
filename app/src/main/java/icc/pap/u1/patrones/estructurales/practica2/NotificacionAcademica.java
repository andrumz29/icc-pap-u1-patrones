package icc.pap.u1.patrones.estructurales.practica2;



public class NotificacionAcademica extends Notificacion {

    public NotificacionAcademica(CanalEnvio canal) {
        super(canal);
    }

    @Override
    public void notificar(String destinatario, String mensaje) {
        canal.enviar(destinatario, "Not Academico: " + mensaje);
    }
}