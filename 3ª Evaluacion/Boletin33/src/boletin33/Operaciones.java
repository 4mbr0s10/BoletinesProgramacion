
package boletin33;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;


public class Operaciones <T>{
    
    private ArrayList <T> lista = new ArrayList<>();
    
    public void añadir (T obj){
        lista.add(obj);
        
    }
    
    public ArrayList <T> visualizarLista(){
        
        return lista;
    }
    
  
    public void  devolverMinimo(ArrayList <T> lista){
        
        System.out.println(lista.get(0));
        
    }
    public void devolverMaximo (ArrayList <T> lista){
        
        System.out.println(lista.get(lista.size()-1));
        
    }

    public ArrayList<T> getLista() {
        return lista;
    }

    public void setLista(ArrayList<T> lista) {
        this.lista = lista;
    }
    public void mostrarPosicion (ArrayList <T> lista)throws IOException{
        BufferedReader br = new BufferedReader (new InputStreamReader (System.in));
             System.out.println("Qué número desea buscar? ");
        int b = Integer.parseInt(br.readLine());
     
            
           if(lista.contains(b)==true){
               System.out.println(lista.indexOf(b));
               
          
        }else{
               System.out.println("-1");
               
           }
        
    }
}
