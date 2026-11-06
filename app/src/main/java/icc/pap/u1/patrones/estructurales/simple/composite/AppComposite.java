package icc.pap.u1.patrones.estructurales.simple.composite;

public class AppComposite {
    public static void main(String[] args) {
        GrupoMenu combo = new GrupoMenu();
       
    GrupoMenu hamburgesa = new GrupoMenu();
        hamburgesa.addItem(new ProductoMenu("Queso", .5));
        hamburgesa.addItem(new ProductoMenu("Carne", 1));
        hamburgesa.addItem(new ProductoMenu("Pan", 0.5));
        hamburgesa.addItem(new ProductoMenu("Lechuga", 0.25));
        ProductoMenu bebida = new ProductoMenu("Coca Cola", 1.35);

      combo.addItem(hamburgesa);
      combo.addItem(bebida);
      System.out.println("Precio del combo: " + combo.precio());
    }
}
