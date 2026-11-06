package icc.pap.u1.patrones.estructurales.flyweight;

public class AppFlyweight {
    public static void main(String[] args){

        GestorComponentes gestor = new GestorComponentes();
        ComponenteVisual boton1 = gestor.get("boton", "azul", "24px");
     ComponenteVisual boton2 = gestor.get("boton", "azul", "24px");

      ComponenteVisual card = gestor.get("boton", "azul", "12px");
      boton1.dibujar("Aceptar", 10, 20);
      boton2.dibujar("Cancelar", 100, 20);
        card.dibujar("Opciones", 5, 25);
        System.out.println("boton1 == boton2: " + (boton1 == boton2));
    }
}
