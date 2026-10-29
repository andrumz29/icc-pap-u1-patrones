package icc.pap.u1.patrones.estructurales.simple.adapter;

public class AdaptadorCargadorIna implements Cargador {
    private final CargadorInalambrico cInalambrico;
    public AdaptadorCargadorIna(CargadorInalambrico     cInalambrico){
        this.cInalambrico= cInalambrico;
    }
    @Override 
    public void cargarCelular(){
cInalambrico.cargarBase();
    }
    
}