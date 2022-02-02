package boletin23;

import libreriaHector.leerDatos;

/**
 *
 * @author dam1
 */
public class Metodos {

    public static int tamaño(String str) {
        int tamaño = str.length();

        return tamaño;
    }

    public static void desmenuza(String str) {
        for (int i = 0; i < str.length(); i++) {
            System.out.println(str.charAt(i));

        }

    }

    public static void cadenaInvertida(String str) {
        for (int i = str.length() - 1; i >= 0; i--) {
            System.out.println(str.charAt(i));

        }

    }

    public static void eliminarEspazos(String str) {

        String strNo = str.replace(" ", "");
        System.out.print(strNo);

    }

    public static void contarConVoc(String str) {
        int v=0;
        int c=0;
        for (int i = 0; i < str.length(); i++) {
            if(str.charAt(i)=='a' ||str.charAt(i)=='e' ||str.charAt(i)=='i'||
                    str.charAt(i)=='o'||str.charAt(i)=='u'){
                v++;
                
            }else if(str.charAt(i)!=' '){
                c++;
                
                
            }

        }
            System.out.println("Número de vogales: "+v+"\n"
                    + "Número de consoantes: "+c);
    }
    
 

}
