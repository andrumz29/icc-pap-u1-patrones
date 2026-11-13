
package icc.pap.u1.patrones.comportamiento.observer;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class Producto {

    public final List<Consumer<CambioProducto>> observadores;

    private String codigo;
    private double precio;
    private String nombre;

    public Producto(String codigo, double precio, String nombre) {
        this.codigo = codigo;
        this.precio = precio;
        this.nombre = nombre;
        this.observadores = new ArrayList<>();
    }

    public void suscribir(Consumer<CambioProducto> observador) {
        observadores.add(observador);
    }

    private void notifyAll(CambioProducto cambio) {
        for (Consumer<CambioProducto> observador : observadores) {
            observador.accept(cambio);
        }
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        String anterior = this.codigo;
        this.codigo = codigo;

        notifyAll(new CambioProducto(this, "CODIGO", anterior, codigo));
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        double anterior = this.precio;
        this.precio = precio;

        notifyAll(new CambioProducto(this, "PRECIO", anterior, precio));
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        String anterior = this.nombre;
        this.nombre = nombre;

        notifyAll(new CambioProducto(this, "NOMBRE", anterior, nombre));
    }

    @Override
    public String toString() {
        return "Producto [codigo=" + codigo
                + ", precio=" + precio
                + ", nombre=" + nombre + "]";
    }
}