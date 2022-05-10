
package boletin33;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import static java.lang.Math.random;
import java.util.ArrayList;
import java.util.Collections;


public class Boletin33 {


    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
        Operaciones <Integer> obj = new Operaciones<>();
        ArrayList <Integer> lista = new ArrayList<>();
        
        for (int i = 0; i < 10; i++) {
       Integer numero = (int) (Math.random() * (99 - 1) + 1);
             obj.añadir(numero);
        }
       lista= obj.getLista();
        Collections.sort(lista);
       obj.devolverMinimo(lista);
       obj.devolverMaximo(lista);
       obj.mostrarPosicion(lista);
       
   
    }
    
}
