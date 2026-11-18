package icc.pap.u1.patrones.comportamiento.stateDos;



public class Enviado implements EstadoPedido {

    @Override
    public void cancelar(Pedido pedido) {
        System.out.println("No se puede cancelar un pedido que ya fue enviado");
    }

    @Override
    public void entregar(Pedido pedido) {
        System.out.println("Pedido entregado");
        pedido.changeState(new Entregado());
    }

    @Override
    public void enviar(Pedido pedido) {
        System.out.println("El pedido ya fue enviado");
    }

    @Override
    public String nombre() {
        return "Entregado";
    }

    @Override
    public void pagar(Pedido pedido) {
        System.out.println("El pedido ya está pagado");
    }

}