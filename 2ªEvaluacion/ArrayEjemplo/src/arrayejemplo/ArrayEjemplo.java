package arrayejemplo;

import arrays.MetodosArrays;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import libreriaHector.leerDatos;
/**
 *
 * @author dam1
 */
public class ArrayEjemplo {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            arrays.MetodosArrays.MetodosArray ma = new arrays.MetodosArrays.MetodosArray();
     float [] nums = new float [5];
    


        
        int o = 0;
        do {

            System.out.println("1- Crear \n"
                    + "2- Mostrar \n"
                    + "3- Salir");
            o = Integer.parseInt(br.readLine());
            switch (o) {
                
                
                case 1:
                    nums= ma.rellenarArray(nums);
                    
                    break;
                    
                case 2:
                    
                    ma.mostrarArray(nums);
                    
                    
                    break;
                    
                case 3 : 
                    
                    ma.salir();
                break;

            }

        } while (o < 3);
    }
    

}
