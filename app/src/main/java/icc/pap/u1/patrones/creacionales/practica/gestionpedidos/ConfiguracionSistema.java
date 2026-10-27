
package icc.pap.u1.patrones.creacionales.practica.gestionpedidos;

public final class ConfiguracionSistema {
//singleton ya que aqui usamos la unica instancia que nos pide el problema 
    private static ConfiguracionSistema instancia;

    private double impuesto;

    private ConfiguracionSistema() {
        this.impuesto = 15.0;
    }

    public static ConfiguracionSistema getInstancia() {
        if (instancia == null) {
            instancia = new ConfiguracionSistema();
        }
        return instancia;
    }

    public double getImpuesto() {
        return impuesto;
    }

    public void setImpuesto(double impuesto) {
        if (impuesto < 0 || impuesto > 100) {
            throw new IllegalArgumentException(
                "El impuesto debe estar entre 0 y 100."
            );
        }

        this.impuesto = impuesto;
    }
}

