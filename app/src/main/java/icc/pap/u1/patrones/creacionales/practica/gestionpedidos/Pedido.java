
package icc.pap.u1.patrones.creacionales.practica.gestionpedidos;

public abstract class Pedido {

    private String codigo;
    private String cliente;
    private double subtotal;

    protected Pedido(String codigo, String cliente, double subtotal) {
        this.codigo = codigo;
        this.cliente = cliente;
        this.subtotal = subtotal;
    }
    

    public abstract void procesar();

    protected abstract void generarComprobante();

    public String getCodigo() {
        return codigo;
    }

    public String getCliente() {
        return cliente;
    }

    public double getSubtotal() {
        return subtotal;
    }

    public double calcularImpuesto() {
        return subtotal * ConfiguracionSistema.getInstancia().getImpuesto() / 100;
    }

    public double calcularTotal() {
        return subtotal + calcularImpuesto();
    }

    public void mostrarInformacion() {
        System.out.println("Código: " + codigo);
        System.out.println("Cliente: " + cliente);
        System.out.printf("Subtotal: $%.2f%n", subtotal);
        System.out.printf("Impuesto: $%.2f%n", calcularImpuesto());
        System.out.printf("Total: $%.2f%n", calcularTotal());
        generarComprobante();
    }
}
