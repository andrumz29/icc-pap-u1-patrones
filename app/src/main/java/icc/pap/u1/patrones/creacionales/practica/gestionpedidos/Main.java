
package icc.pap.u1.patrones.creacionales.practica.gestionpedidos;

public class Main {

        public static void main(String[] args) {

                // Obtener la configuracion compartida (Singleton)
                ConfiguracionSistema configuracion = ConfiguracionSistema.getInstancia();

                System.out.println("Configuracion del sistema");
                System.out.printf("Impuesto: %.1f%%%n", configuracion.getImpuesto());

                // Instanciamos para crear el pedido Presnseical
                CreadorPedido creadorPresencial = new CreadorPedidoPresencial();

                Pedido pedidoPresencial = creadorPresencial.crearPedido("P001",  "Ana Torres",
                 100.00);

                pedidoPresencial.procesar();

                // Creamos el pedido en linea instanciando con la clase que ya teniamos hecha
                CreadorPedido creadorEnLinea = new CreadorPedidoEnLinea();

                Pedido pedidoEnLinea = creadorEnLinea.crearPedido(  "P002",  "Juan Perez",
                  200.00);

                pedidoEnLinea.procesar();

                // Comprobar que ambos accesos usan la misma instancia
                ConfiguracionSistema otraConfiguracion = ConfiguracionSistema.getInstancia();

                System.out.println("\nConfiguracion compartida: "  + (configuracion == otraConfiguracion));
        }
}
