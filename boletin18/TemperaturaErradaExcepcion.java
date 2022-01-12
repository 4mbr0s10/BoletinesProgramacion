
package boletin18;

/**
 *
 * @author dam1
 */
public class TemperaturaErradaExcepcion extends Exception{

    int codigo;

    public TemperaturaErradaExcepcion(int codigo) {
        this.codigo = codigo;
    }

    public TemperaturaErradaExcepcion(int codigo, String message) {
        super(message);
        this.codigo = codigo;
    }

    
     @Override
     public String getMessage(){
         
         String mensaje = "";
        
         switch(codigo){
         
       
             case 1:
             mensaje = "La temperatura introducida no puede ser menor de 80.";
             break;
         }
         
         
         return mensaje;
     }
    
}
