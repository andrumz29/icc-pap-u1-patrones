package icc.pap.u1.patrones.estructurales.bridge;

public abstract class Notificacion {
    protected final CanalEnvio canal;


    public Notificacion(CanalEnvio canal) {
        this.canal = canal;
    }
    public abstract void notificar(String mensaje);
}//constructor dependiente de canal de envio


