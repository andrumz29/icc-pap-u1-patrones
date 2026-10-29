package icc.pap.u1.patrones.estructurales.simple.decorator;

public final class Chocolate implements Bebida {
     protected final Bebida bebida;
     
    public Chocolate (Bebida ChocolateUno){
        this.bebida= ChocolateUno;
        //this.ChocolateDos = ChocolateDos;
    }
    @Override 
    public String descripcion(){
        return  bebida.descripcion()+" con Chocolate";
    }
    @Override 
    public double precio(){
        return bebida.precio()+1.5;
    }
}
