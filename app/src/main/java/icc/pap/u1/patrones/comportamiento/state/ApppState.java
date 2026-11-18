package icc.pap.u1.patrones.comportamiento.state;

public class ApppState {
    public static void main(String[] args) {
        Semaforo semaforo = new Semaforo();
        System.out.println(semaforo.color());
        semaforo.avanzar();
        System.out.println(semaforo.color());
        try {
             Thread.sleep(3000);
        } catch (Exception e) {
            System.err.println("Error");
        }finally{
semaforo.avanzar();
        System.out.println(semaforo.color());
        }
      
        
    }
}
