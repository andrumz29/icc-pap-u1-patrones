
package icc.pap.u1.patrones.creacionales.practica.gestionpedidos;

public final class PedidoEnLinea extends Pedido {

    public PedidoEnLinea(String codigo, String cliente, double subtotal) {
        super(codigo, cliente, subtotal);
    }
// sobreescribe en pedido pero ahora en la parte digital que necesitabamos ya que la anterior era presencial
    @Override
    public void procesar() {
        System.out.println("\n--- Pedido en línea ---");
        mostrarInformacion();
    }

    @Override
    protected void generarComprobante() {
        System.out.println("Confirmación digital generada.");
    }
}
