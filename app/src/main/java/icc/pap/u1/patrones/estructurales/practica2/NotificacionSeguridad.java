package icc.pap.u1.patrones.estructurales.practica2;



public class NotificacionSeguridad extends Notificacion {

    public NotificacionSeguridad(CanalEnvio canal) {
        super(canal);
    }

    @Override
    public void notificar(String destinatario, String mensaje) {
        canal.enviar(destinatario, "Not Seguridad: " + mensaje);
    }
}
