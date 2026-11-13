
package icc.pap.u1.patrones.comportamiento.observer;

// Subscripción a tópicos
// El patrón Observer notifica a los suscritos cuando existe alguna modificación.

public class AppObserver {

    public static void main(String[] args) {

        Producto p = new Producto("001", 100, "Pizza");

        // Guardamos el código anterior
        String codigoViejo = p.getCodigo();

        // Primer observador
      //  p.suscribir(cp -> System.out.println("Corre: " + cp));
///** */
        // Segundo observador
      //  p.suscribir(cp -> System.out.println("Registro: " + cp));

        // Tercer observador
        //**
       // p.suscribir(cp -> {

            // Imprimir el nuevo código (solo el código)
            // Siempre cuando cambia solo el CÓDIGO

          //  if (!codigoViejo.equals(cp.getCodigo())) {

             //   System.out.printf( "El código viejo es %s: el nuevo es %s%n",     codigoViejo,     cp.getCodigo()        );
         //   }
     //   });

        // Notifica a todos los consumers
        p.setPrecio(15.50);
        p.setNombre("pizza");
        p.setCodigo("002");

        System.out.println("El código viejo es " + codigoViejo            + " el nuevo código es " + p.getCodigo());

        p.suscribir(cp -> {
            System.out.println("Se modifico el: " + cp.atributo());
            System.out.println("Old= " + cp.anterior() + "| New = " + cp.nuevo());
        }); 
          // Modificamos los atributos
        p.setPrecio(15.50);

        p.setNombre("PIZZZZA");

        p.setCodigo("010");

    }
}

