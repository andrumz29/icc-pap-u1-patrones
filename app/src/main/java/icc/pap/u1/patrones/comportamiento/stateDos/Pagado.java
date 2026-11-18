package icc.pap.u1.patrones.comportamiento.stateDos;


public class Pagado implements EstadoPedido {

    @Override
    public void cancelar(Pedido pedido) {
        System.out.println("Pedido cancelado");
        
    }

    @Override
    public void entregar(Pedido pedido) {
        System.out.println("No se puede entregar un pedido que no ha sido enviado");
    }

    @Override
    public void enviar(Pedido pedido) {
        System.out.println("Pedido enviado");
        pedido.changeState(new Enviado());
    }

    @Override
    public String nombre() {
        return "Pagado";
    }

    @Override
    public void pagar(Pedido pedido) {
        System.out.println("El pedido ya está pagado");
    }
}