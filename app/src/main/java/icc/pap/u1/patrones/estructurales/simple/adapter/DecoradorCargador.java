
package icc.pap.u1.patrones.estructurales.simple.adapter;

/**
 * Decorador abstracto para los cargadores.
 */
public abstract class DecoradorCargador implements Cargador {

    protected Cargador cargador;

    public DecoradorCargador(Cargador cargador) {
        this.cargador = cargador;
    }

    @Override
    public void cargarCelular() {
        cargador.cargarCelular();
    }
}
