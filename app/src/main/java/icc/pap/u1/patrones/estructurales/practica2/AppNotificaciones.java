package icc.pap.u1.patrones.estructurales.practica2;

public class AppNotificaciones {

    public static void main(String[] args) {

        // CASO 1: Notificación académica por correo electrónico
        System.out.println("\n=== CASO 1 ===");

        CanalEnvio correo = new CanalCorreo();

        Notificacion n1 = new NotificacionAcademica(correo);

        n1.notificar("estudiante@universidad.edu",  "Sus calificaciones están disponibles.");

        // CASO 2: Notificación administrativa por SMS
        System.out.println("\n=== CASO 2 ===");

        CanalEnvio sms = new CanalSMS();

        Notificacion n2 = new NotificacionAdministrativa(sms);

        n2.notificar( "0991234567",  "Existe un trámite pendiente.");

        // CASO 3: Notificación de seguridad autorizada
        System.out.println("\n=== CASO 3 ===");

        CanalEnvio proxyAutorizado = new ProxyCanalEnvio( new CanalPush(),  true);

        Notificacion n3 = new NotificacionSeguridad( proxyAutorizado);

        n3.notificar( "usuario123",  "Se detectó un nuevo inicio de sesión.");

        // CASO 4: Notificación académica sin autorización
        System.out.println("\n=== CASO 4 ===");

        CanalEnvio proxyNoAutorizado = new ProxyCanalEnvio( new CanalSMS(),   false);

        Notificacion n4 = new NotificacionAcademica(  proxyNoAutorizado);

        n4.notificar(  "0987654321",   "Sus calificaciones están disponibles.");

        // CASO 5: Reutilización del mismo canal con diferentes notificaciones
        System.out.println("\n=== CASO 5 ===");

        CanalEnvio mismoCorreo = new CanalCorreo();

        Notificacion n5a = new NotificacionAcademica( mismoCorreo);

        Notificacion n5b = new NotificacionAdministrativa( mismoCorreo);

        n5a.notificar(  "estudiante@universidad.edu",    "Tiene nuevas calificaciones.");

        n5b.notificar(   "estudiante@universidad.edu",   "Tiene un trámite pendiente.");

        // CASO 6: Bridge y Proxy con diferentes canales
        System.out.println("\n=== CASO 6 ===");

        CanalEnvio proxyCorreo = new ProxyCanalEnvio(new CanalCorreo(),  true);

        CanalEnvio proxySMS = new ProxyCanalEnvio( new CanalSMS(),  false);

        Notificacion n6a = new NotificacionSeguridad( proxyCorreo);

        Notificacion n6b = new NotificacionSeguridad(proxySMS);

        n6a.notificar( "usuario@universidad.edu",  "Alerta de seguridad institucional.");

        n6b.notificar( "0991234567",  "Alerta de seguridad institucional.");

    }
}