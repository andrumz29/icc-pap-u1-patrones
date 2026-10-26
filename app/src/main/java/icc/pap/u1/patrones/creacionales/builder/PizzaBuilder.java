package icc.pap.u1.patrones.creacionales.builder;
 /*
    PizzaBuilder va acumular las opciones de una pizza
    y creara el producto del obejto pizza cuando se lo pida 
    al metodo construir(build)
     */
    
import java.util.ArrayList;

import java.util.List;
public class PizzaBuilder {
   private String size = "mediana";
   //lista de ingredienes que no se repiten y se mantiene el orden de insercion 
    private List<String> ingrediente = new ArrayList<>();
//OP 1
    public PizzaBuilder() {
        
        this.size = "mediana";
        this.ingrediente = new ArrayList<>();
        this.ingrediente.add("queso");
    }
    public PizzaBuilder size(String size) {
        this.size = size;
        return this;

    }
   // OP 2
    public PizzaBuilder addIng(String ing) {
      this.ingrediente.add(ing);
      return this;
    }
    ///Metodo BUILD DEVUELVE EL PRODUCTO 
    public Pizza build() {
        return new Pizza(size, ingrediente);
    }
//DIFERENCIA METODOS ACUMULADORES Y EL METODO BUILDER
// METODOS ACUMULADORES LOS MISMAS INSTANCIAS DEL BUILDER
//DAR UN MISMO PRODUCTO

}
