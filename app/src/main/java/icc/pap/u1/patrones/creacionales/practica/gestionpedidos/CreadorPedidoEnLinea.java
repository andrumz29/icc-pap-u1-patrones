
package icc.pap.u1.patrones.creacionales.practica.gestionpedidos;

public final class CreadorPedidoEnLinea extends CreadorPedido {
//sobreescribimos la Clase Padre que es CreadorPedido
    @Override
    public Pedido crearPedido( String codigo,  String cliente,double subtotal ) {
        return new PedidoEnLinea(codigo, cliente, subtotal);
    }
}
