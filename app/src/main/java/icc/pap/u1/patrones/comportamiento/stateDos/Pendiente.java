package icc.pap.u1.patrones.comportamiento.stateDos;



public class Pendiente implements EstadoPedido {

    @Override
    public void cancelar(Pedido pedido) {
        System.out.println("Pedido cancelado");
        pedido.changeState(new Cancelado());
    }

    @Override
    public void entregar(Pedido pedido) {
        System.out.println("El pedido no ha sido ni enviado");
    }

    @Override
    public void enviar(Pedido pedido) {
        System.out.println("Debes pagar primero");
    }

    @Override
    public String nombre() {
        return "Pendiente";
    }

    @Override
    public void pagar(Pedido pedido) {
        System.out.println("Pago realizado");
        pedido.changeState(new Pagado());
    }
}