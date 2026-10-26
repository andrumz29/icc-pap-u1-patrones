
package icc.pap.u1.patrones;

import java.util.List;
import icc.pap.u1.patrones.factoryMethod.Importador;
import icc.pap.u1.patrones.factoryMethod.ImportadorPuntoComa;
import icc.pap.u1.patrones.creacionales.prototype.PlantillaEmail;
import icc.pap.u1.patrones.creacionales.builder.Pizza;
import icc.pap.u1.patrones.creacionales.builder.PizzaBuilder;
public class App {

    public static void main(String[] args) {
        runBuilder();
        }
private static void runBuilder() {
       Pizza pizza = new PizzaBuilder().build();
        
        System.out.println(pizza.descripcion());
    }

    private static void runPrototype() {
    
        PlantillaEmail pEmail= new PlantillaEmail("aviso", "pedido listo");
        PlantillaEmail pEmailSolicitud = pEmail.clone();
        pEmailSolicitud.setAsunto("Solicitud");

        System.out.println(pEmailSolicitud.contenido());
        System.out.println(pEmail.contenido());
    }

   

   private static void runFactoryMethod() {
      Importador impPC = new ImportadorPuntoComa();// implemento el crear lector()
      // para devolver LectorpuntoComa
      System.out.println(impPC.importacion(List.of(
    "Libro1;Autor1;100",
    "Libro2;Autor2;200"
)));
      
    }

    
}
