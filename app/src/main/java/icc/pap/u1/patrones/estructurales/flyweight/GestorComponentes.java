package icc.pap.u1.patrones.estructurales.flyweight;

import java.util.Map;
import java.util.HashMap;

public class GestorComponentes{
    private final Map<String, ComponenteVisual> componentes;

    public GestorComponentes(){
        componentes = new HashMap<>();
    }

    public ComponenteVisual get(String tipo, String color, String border){
        String clave = tipo + " | " + color + " | " + border;
        ComponenteVisual comp = componentes.get(clave);
        if(comp == null){
            componentes.put(clave, new ComponenteVisual(tipo, color, border)); //put siempre agrega y actualiza
            //putIfAbsent: agrega UNA sola VEZ, //put: agrega las veces que sea
        }
        componentes.get(clave);
        return componentes.computeIfAbsent(clave, k -> new ComponenteVisual(tipo, color, border)); //si tiene el valor de la clave la retorna, si no la tiene la crea
        //sirve para tener en un HashMap los componentes visuales
    }

}
