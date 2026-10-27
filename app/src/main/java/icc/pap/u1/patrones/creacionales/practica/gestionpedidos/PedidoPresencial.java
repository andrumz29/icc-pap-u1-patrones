
package icc.pap.u1.patrones.creacionales.practica.gestionpedidos;

public final class PedidoPresencial extends Pedido {
// usamos super proque el pedido es protected
    public PedidoPresencial(String codigo, String cliente, double subtotal) {
        super(codigo, cliente, subtotal);
    }
// sobreescribbimos procesar que esta en Pedido
    @Override
    public void procesar() {
        System.out.println("\n--- Pedido presencial ---");
        mostrarInformacion();
    }
//sobreescribimos generarComprobante que esta en peido
    @Override
    protected void generarComprobante() {
        System.out.println("Comprobante generado en tienda.");
    }
}
