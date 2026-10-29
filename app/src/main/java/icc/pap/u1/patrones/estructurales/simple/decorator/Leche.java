package icc.pap.u1.patrones.estructurales.simple.decorator;
/** leche es mi Decorador que envuelve a una Bebida 
 * BEBIDA -> GENERAL PUEDE SER CUALQUIERA COMO UN CAFE 
 * un expreso, chocolate.
 * 
 */
public final class Leche implements Bebida {
    protected final Bebida bebida;
    public Leche (Bebida bebida){
        this.bebida= bebida;
    }
    @Override 
    public String descripcion(){
        return  bebida.descripcion()+" con leche";
    }
    @Override 
    public double precio(){
        return bebida.precio()+0.5;
    }
}
