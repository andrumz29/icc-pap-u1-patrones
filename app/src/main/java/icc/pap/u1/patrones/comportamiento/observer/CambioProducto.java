package icc.pap.u1.patrones.comportamiento.observer;
//objeto se utiliza cualquier tipo de instancia
public record CambioProducto(
        Producto producto,
        String atributo,
        Object anterior,
        Object nuevo
) {
}