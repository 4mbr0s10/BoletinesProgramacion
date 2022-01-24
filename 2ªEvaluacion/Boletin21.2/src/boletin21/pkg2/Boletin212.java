
package boletin21.pkg2;

/**
 *
 * @author dam1
 */
public class Boletin212 {

 
    public static void main(String[] args) {
        
        int [] notasProg= new int[30];
        int auxCont=0;
        for (int i = 0; i < notasProg.length; i++) {
            int notaRandom= (int) (Math.random()*(10-1)+1);
            notasProg[i]=notaRandom;
        }
        for (int i = 0; i < notasProg.length; i++) {
            if(notasProg[i]>=5){
                System.out.println(notasProg[i]+" Aprobado.");
                
            }else{
                System.out.println(notasProg[i]+" Suspenso.");
            }
        }
        for (int i = 0; i < notasProg.length; i++) {
            
           auxCont= auxCont + notasProg[i];
           
        }
        int notaMedia= auxCont/notasProg.length;
        System.out.println("Nota media clase: "+notaMedia);
    }
    
}
