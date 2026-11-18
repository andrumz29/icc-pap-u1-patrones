package icc.pap.u1.patrones.comportamiento.state;

public class Semaforo {
     private ColorSemaforo estado;
     public Semaforo ( ){
        estado = ColorSemaforo.ROJO;
     }
     //define mis estados 
     public String color(){
        return estado.color;
     }
     public void avanzar(){
        estado = estado.siguiente;
     }
     //path 
     // 
}
