package icc.pap.u1.patrones.estructurales.practica2;

public class CanalSMS implements CanalEnvio {

    @Override
    public void enviar(String destinatario, String mensaje) {
        System.out.println("Enviando SMS a: " + destinatario);
        System.out.println("Mensaje: " + mensaje);
    }
}
