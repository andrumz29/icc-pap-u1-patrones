package icc.pap.u1.patrones.estructurales.simple.adapter;

public class DecoradorSeguridad extends DecoradorCargador {
private boolean permitido;
    

    public DecoradorSeguridad(Cargador cargador, boolean permitido) {
    super(cargador);
    this.permitido = permitido;
}


    @Override
    public void cargarCelular() {
        System.out.println(  "Verificando seguridad..." );
        if (permitido) {
            super.cargarCelular();
        } else {
            System.out.println("Carga bloqueada.");
        }
    }
    
}
