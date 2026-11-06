package icc.pap.u1.patrones.estructurales.practica2;

public class ProxyCanalEnvio implements CanalEnvio {

    private CanalEnvio canalReal;
    private boolean autorizado;

    public ProxyCanalEnvio(CanalEnvio canalReal, boolean autorizado) {
        this.canalReal = canalReal;
        this.autorizado = autorizado;
    }

    @Override
    public void enviar(String destinatario, String mensaje) {

        System.out.println("Verificando autorización...");

        if (autorizado) {
            System.out.println("Usuario autorizado. Enviando notificación.");
            canalReal.enviar(destinatario, mensaje);
        } else {
            System.out.println("Envío bloqueado: usuario no autorizado.");
        }
    }
}
