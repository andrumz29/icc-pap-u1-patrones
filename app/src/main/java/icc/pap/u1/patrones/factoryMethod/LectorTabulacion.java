package icc.pap.u1.patrones.factoryMethod;
public class LectorTabulacion implements LecturaLinea {
   
        // Dividir la línea por el separador de tabulación
        @Override 
        public Lectura leer(String linea) {
        String[] partes = linea.split("\t");
        return new Lectura(partes[0], partes[1], Integer.parseInt(partes[2]));
    }
    //crear un metodo para leer varios tipos de lectura
}
