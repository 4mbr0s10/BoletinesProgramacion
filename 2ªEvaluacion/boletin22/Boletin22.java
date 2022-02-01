
package boletin22;

import java.util.Arrays;
import libreriaHector.leerDatos;

/**
 *
 * @author dam1
 */
public class Boletin22 {


    public static void main(String[] args) {
        int filas=leerDatos.leerInt(" numero de filas");
        int columnas=leerDatos.leerInt("número de columnas");
        int [][] goles= new int [filas][columnas];
        String [] equipos ={"\nCelta","\nBilbao","\nMalaga" } ;
        String [] auxEquipos = Arrays.copyOf(equipos, filas);
        Metodos.cargarArrayGoles(goles);
//        Metodos.cargarArrayEquipos(equipos, filas);
        System.out.println("Equipo\nXornada\tX1           \tX2          \tx3");
        Metodos.amosar(equipos, goles, filas);
        
        
        
       auxEquipos= Metodos.ordenMenor(auxEquipos, goles, filas, columnas);
        for (int i = 0; i < auxEquipos.length; i++) {
            System.out.println(auxEquipos[i]);
        }
    }
    
}
