package boletin22;

import libreriaHector.leerDatos;

/**
 *
 * @author dam1
 */
public class Metodos {

    public static int[][] cargarArrayGoles(int[][] goles) {

        for (int fila = 0; fila < goles.length; fila++) {
            for (int columna = 0; columna < goles[fila].length; columna++) {
                goles[fila][columna] = leerDatos.leerInt(" numero de Goles");
            }

        }

        return goles;
    }

//    public static String[] cargarArrayEquipos(String[] equipos, int filas) {
//
//        for (int i = 0; i < filas + 1; i++) {
//            if (i == 0) {
//                equipos[i] = "Equipos/Xornada";
//            }else{
//            equipos[i] = leerDatos.leerString("Introduzca el nombre del equipo: ");
//            }
//            
//        }
//        return equipos;
//    }

    public static void amosar(String[] equipos, int[][] goles, int filas) {
//        for (int i = 0; i < goles.length; i++) {
//                System.out.println("\n");
//            if (i == 0) {
//                for (int j = 0; j < goles[i].length; j++) {
//                    System.out.print(equipos[j] + "  ");
//                }
//            }
//            for (int k = 0; k < goles[i].length; k++) {
//                if (i == 0 && k == 0) {
//                    System.out.print(equipos[0]);
//                } 
//            }
//        }

        for (int i = 0; i < goles.length; i++) {
            System.out.print(equipos[i]+"\t");
            for (int j = 0; j < goles[i].length; j++) {
                System.out.print(goles[i][j]+"\t\t");
            }
        }

    }
    public static String[] ordenMenor(String [] auxEquipos, int [][] goles, int filas, int columnas){
       
        int [] suma=new int [filas];
        int auxPrev=0;
        for (int i = 0; i < goles.length; i++) {
            for (int j = 0; j< goles[i].length; j++) {
              auxPrev= auxPrev+goles[i][j];
             suma[i] = auxPrev;
            }
 
        }
        for (int i = 0; i < (suma.length-1); i++) {
            for (int j = i+1; j <suma.length ; j++) {
                
                if(suma[i]<suma[j]){
                    int aux= suma[i];
                    String auxS = auxEquipos[i];
                    suma[i]=suma[j];
                    auxEquipos[i]=auxEquipos[j];
                    auxEquipos[j]=auxS;
                    suma[j]=aux;
                    
                }
                
            }
            
        }
        
        
        
        
        return auxEquipos;
    }
}
