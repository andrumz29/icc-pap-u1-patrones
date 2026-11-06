package icc.pap.u1.patrones.estructurales.facade;
/**
 * 
 * Facade que representa un sistema de cine en casa coordina los componentes necessarios para ver una pelicula
 * ver una pelicula requiere encender el proyector y reproducir la pelicula
 * centraliza la logica 
 */
public class CineEnCasa {
private Proyector proyector;
private final Reproductor reproductor;
public CineEnCasa() {
    this.proyector = new Proyector();
    this.reproductor = new Reproductor();   


}
public void verPelicula(String pelicula) {
    proyector.encender();
    reproductor.reproducir(pelicula);
    
}
}