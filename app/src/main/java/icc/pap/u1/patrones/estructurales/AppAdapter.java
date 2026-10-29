package icc.pap.u1.patrones.estructurales;

import icc.pap.u1.patrones.estructurales.simple.adapter.AdaptadorCargador;
import icc.pap.u1.patrones.estructurales.simple.adapter.AdaptadorCargadorIna;
import icc.pap.u1.patrones.estructurales.simple.adapter.CargadorAntiguo;
import icc.pap.u1.patrones.estructurales.simple.adapter.CargadorInalambrico;
import icc.pap.u1.patrones.estructurales.simple.adapter.DecoradorRegistro;
import icc.pap.u1.patrones.estructurales.simple.adapter.DecoradorSeguridad;
import icc.pap.u1.patrones.estructurales.simple.adapter.Cargador;

public final class AppAdapter {
    public static void main(String[] args) {
        
/**
 * //Cargar mi celular con un cargador 
      
        /// Pero como ahora tengo un ca debo crear un adaptador
        CargadorAntiguo cAntiguo = new CargadorAntiguo();
        Cargador cargadorUno= new AdaptadorCargador(cAntiguo) ;
        CargadorInalambrico  cInalambrico = new CargadorInalambrico();
        ///cargar el celular
        Cargador cargadorDos = new AdaptadorCargadorIna(cInalambrico);

            cargadorUno.cargarCelular();
        ///cargar el celular - sin el patron
        // si el cargador es antiguo 
        cAntiguo.cargarConector();
        cInalambrico.cargarBase();
        cargadorDos.cargarCelular();
 */

        Cargador c1 = new DecoradorRegistro(new AdaptadorCargador(new CargadorAntiguo()));

        c1.cargarCelular();
            
        Cargador c2 = new DecoradorSeguridad(new AdaptadorCargadorIna(new CargadorInalambrico()), true);
        c2.cargarCelular();
            
        Cargador c3 = new DecoradorSeguridad(new AdaptadorCargador(new CargadorAntiguo()), false);
        c3.cargarCelular();
          
       Cargador c4 = new DecoradorSeguridad(
    new DecoradorRegistro(
        new AdaptadorCargadorIna(new CargadorInalambrico()) ),    true);
        c4.cargarCelular();
        
    }
}
