
package boletin18;


import java.io.IOException;

import java.util.Scanner;

/**
 *
 * @author dam1
 */
public class ConversorTemperaturas {
    final float tempLim=80.0f;

    public ConversorTemperaturas() {
    }

    
    public float pedirTemperatura(float tempPedida){
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduzca una temperatura en grados Centígrados: ");
        tempPedida = sc.nextFloat();
        return tempPedida;
    }
   public float centigradosAFharenheit (float tempPedida)throws IOException{
       
       
       float tempeConv=(9.0f/5.0f)*pedirTemperatura(tempPedida)+32.4f;
       
       return tempeConv;
   }
   public void centigradosAReamur(float tempPedida) throws IOException{
       
       
       
       float tempeConv=(5.0f/4.0f) * pedirTemperatura(tempPedida);
       System.out.println("La temperatura despues de la conversión es: "+tempeConv);
       
       
   }
    
    
}
