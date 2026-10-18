package icc.pap.u1.patrones.creacionales;
class Sensor implements Cloneable {
    private String id;
    private String tipo;
    private double valor;

    public Sensor(String id, String tipo, double valor) {
        this.id = id;
        this.tipo = tipo;
        this.valor = valor;
    }

    @Override
    public Sensor clone() {
        try {
            return (Sensor) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new AssertionError(e);
        }
    }

    public void setId(String id) {
        this.id = id;
    }

    public void mostrar() {
        System.out.println("ID: " + id);
        System.out.println("Tipo: " + tipo);
        System.out.println("Valor: " + valor);
        System.out.println("--------------------");
    }
}

public class PrototypeDemo {

    public static void ejecutar() {
        Sensor original =
                new Sensor("S001", "Temperatura", 25.5);

        Sensor copia = original.clone();
        copia.setId("S002");

        System.out.println("Sensor original:");
        original.mostrar();

        System.out.println("Sensor clonado:");
        copia.mostrar();
    }
}

