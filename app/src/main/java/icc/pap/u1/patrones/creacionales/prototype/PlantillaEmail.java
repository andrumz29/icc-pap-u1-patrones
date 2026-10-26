package icc.pap.u1.patrones.creacionales.prototype;

public class PlantillaEmail {
    private String asunto;
    private String mensaje;

    //constructor lleno con los dos atributos
    public PlantillaEmail(String asunto, String mensaje) {
        this.asunto = asunto;
        this.mensaje = mensaje;
    }

    public PlantillaEmail clone() {
        return new PlantillaEmail(asunto, mensaje);
    }
    
    public void setAsunto(String asunto) {
        this.asunto = asunto;
    }
    public String contenido() {
        return this.toString();
    }
    @Override 
    public String toString() {
        return "asunto" + ":" + mensaje;
    }
}
