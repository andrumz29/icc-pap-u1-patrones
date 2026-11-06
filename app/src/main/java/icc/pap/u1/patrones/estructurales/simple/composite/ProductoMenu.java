package icc.pap.u1.patrones.estructurales.simple.composite;

public class ProductoMenu implements ElementoMenu {
    private final String nombre;
    private double precio;
    
    public ProductoMenu(String nombre, double precio) {
        this.nombre = nombre;
        this.precio = precio;
    }
    
    @Override
    public double precio() {
            return this.precio;
    }

    @Override 
    public String toString() {
        return this.nombre + " " + this.precio;
    }
    
}
