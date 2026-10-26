package icc.pap.u1.patrones.factoryMethod;

import java.util.ArrayList;
import java.util.List;

public abstract class Importador {

    protected abstract LecturaLinea crearLector();

    public final List<Lectura> importacion(List<String> lecturas) {
            LecturaLinea lector = crearLector();
        List<Lectura> resultado = new ArrayList<>();

        for (String lectura : lecturas) {
            if (lectura.isBlank()) continue;

            try {
                resultado.add(lector.leer(lectura));
            } catch (Exception e) {
                throw new IllegalArgumentException("Linea mal formada", e);
            }
        }

        return resultado;
    }
}