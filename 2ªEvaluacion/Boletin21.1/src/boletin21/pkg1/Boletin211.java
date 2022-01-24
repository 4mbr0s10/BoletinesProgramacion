
package boletin21.pkg1;

/**
 *
 * @author dam1
 */
public class Boletin211 {

   
    public static void main(String[] args) {
        
        int numale []=new int[6];
        for (int i = 0; i < numale.length; i++) {
            int rand = (int) (Math.random() * (50-1)+1);
            numale[i]= rand;
            
            
        }
        for (int i = numale.length-1; i >=0; i--) {
            System.out.println(numale[i]);
            
        }
    }
    
}
