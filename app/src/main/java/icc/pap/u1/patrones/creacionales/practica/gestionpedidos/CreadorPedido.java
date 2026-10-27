
package icc.pap.u1.patrones.creacionales.practica.gestionpedidos;

public abstract class CreadorPedido {
//definimos las variables que ya teniamos
    public abstract Pedido crearPedido( String codigo,   String cliente,   double subtotal   );
}
