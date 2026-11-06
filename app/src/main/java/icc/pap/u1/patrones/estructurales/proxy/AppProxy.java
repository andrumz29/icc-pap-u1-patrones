package icc.pap.u1.patrones.estructurales.proxy;

public class AppProxy {
    public static void main(String[] args) {
        Documento documento = new DocumentoProxy("informe.pdf");
        System.out.println("El proxy ya esta creado");
        documento.mostrar();
        documento.mostrar();
    }
}
