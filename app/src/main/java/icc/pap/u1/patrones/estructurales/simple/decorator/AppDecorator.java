package icc.pap.u1.patrones.estructurales.simple.decorator;

public final class AppDecorator {
    
    public static void main(String[] args) {
        Bebida cafeS = new CafeSimple();
        Bebida cafeSL = new Leche(new CafeSimple());
        Bebida cafeSC = new Chocolate(new CafeSimple());
        Bebida cafeSLC = new Chocolate(new Leche(new CafeSimple()));
        Bebida cafeCCL = new Leche(new Chocolate(new Chocolate(new CafeSimple())));
System.out.println(cafeS.descripcion()+" $ "+cafeS.precio());
System.out.println(cafeSL.descripcion()+" $ "+cafeS.precio());
System.out.println(cafeSC.descripcion()+" $ "+cafeS.precio());
System.out.println(cafeSLC.descripcion()+" $ "+cafeS.precio());
System.out.println(cafeCCL.descripcion()+" $ "+cafeS.precio());

    }
}
