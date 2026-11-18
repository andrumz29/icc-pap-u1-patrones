package icc.pap.u1.patrones.comportamiento.stateDos;

public abstract class EstadoFinal implements EstadoPedido {

    @Override
    public void cancelar(Pedido pedido) {
        // TODO Auto-generated method stub
        System.out.println("opeacion no permitida");
    }

    @Override
    public void entregar(Pedido pedido) {
        // TODO Auto-generated method stub
                System.out.println("opeacion no permitida");

        
    }

    @Override
    public void enviar(Pedido pedido) {
        // TODO Auto-generated method stub
                System.out.println("opeacion no permitida");

        
    }


    @Override
    public void pagar(Pedido pedido) {
        // TODO Auto-generated method stub
                System.out.println("opeacion no permitida");

    }
    
}
