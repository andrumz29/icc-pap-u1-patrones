package icc.pap.u1.patrones.factoryMethod;
public class LecturaPuntoComa implements LecturaLinea {
    @Override
    public Lectura leer(String linea) {
        // Dividir la línea por el separador de punto y coma\
        //devolver una instancia de lectura
      String[] partes = linea.split(";");
        return new Lectura(partes[0], partes[1], Integer.parseInt(partes[2]));
    }
}