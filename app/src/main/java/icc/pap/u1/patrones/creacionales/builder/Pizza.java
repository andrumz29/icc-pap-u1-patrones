package icc.pap.u1.patrones.creacionales.builder;
/*  pizza clase inmutable 


reprsenta una pizza ya configurada

*/    
import java.util.List;

public final class Pizza 
{
    private String size;
    private final List<String> ingredientes;

   
    protected Pizza(String size, List<String> ingredientes) {
        this.size = size;
        this.ingredientes = ingredientes;
    }
    public String descripcion() {
        return "Pizza de tamaño: " + size + " con ingredientes: " + ingredientes;
    }
    

 
}
