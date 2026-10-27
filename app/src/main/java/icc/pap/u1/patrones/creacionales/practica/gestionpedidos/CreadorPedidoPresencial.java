
package icc.pap.u1.patrones.creacionales.practica.gestionpedidos;

public final class CreadorPedidoPresencial extends CreadorPedido {

    @Override
    public Pedido crearPedido( String codigo, String cliente, double subtotal ) {
        return new PedidoPresencial(codigo, cliente, subtotal);
    }
}
