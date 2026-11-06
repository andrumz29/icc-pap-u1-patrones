package icc.pap.u1.patrones.estructurales.proxy;

public class DocumentoProxy implements Documento {

    private final String path;
    private DocumentoReal documento;

    public DocumentoProxy(String path) {
        this.path = path;
    }

    @Override
    public void mostrar() {

        if (documento == null) {
            documento = new DocumentoReal(path);
        }

        documento.mostrar();
    }
}