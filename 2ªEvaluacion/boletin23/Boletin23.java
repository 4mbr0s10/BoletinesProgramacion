
package boletin23;

import libreriaHector.leerDatos;

/**
 *
 * @author dam1
 */
public class Boletin23 {


    public static void main(String[] args) {
        String str=leerDatos.leerString("Introduzca un String: ");
       int tam= Metodos.tamaño(str);
        System.out.println("Éste é o tamaño do String: "+tam);
        
        Metodos.desmenuza(str);
        String strAux=leerDatos.leerString("Introduzca un String: ");
        Metodos.cadenaInvertida(strAux);
        Metodos.eliminarEspazos(strAux);
        Metodos.contarConVoc(str);
    }
    
}
