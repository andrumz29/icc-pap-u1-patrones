package icc.pap.u1.patrones.estructurales.bridge;

public class AppBridge {
    public static void main(String[] args) {
        
        CanalCorreo canalCorreo = new CanalCorreo();
        CanalPush canalPush = new CanalPush();


        Notificacion not1 = new NotificacionAcademica(canalCorreo);
        Notificacion not2 = new NotificacionAcademica(canalPush);
        Notificacion notSegCorr = new NotificacionSeguridad(new CanalCorreo());
        Notificacion notSegPush = new NotificacionSeguridad(new CanalPush());
            String mensaje = "SOlicitud #44 aprobada";
            String mensajeSeg = "Alerta de correo malicioso";

            not1.notificar(mensaje);
            not2.notificar(mensaje);
            notSegCorr.notificar(mensajeSeg);
            notSegPush.notificar(mensajeSeg);
    }
}
