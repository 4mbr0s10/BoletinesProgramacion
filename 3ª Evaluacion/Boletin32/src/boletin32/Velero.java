
package boletin32;

public class Velero extends Barco{
    
    private int mastiles;

    public Velero(int mastiles) {
        this.mastiles = mastiles;
    }

    public Velero() {
    }

    public Velero(int diasOcu, int eslora, String matricula) {
        super(diasOcu, eslora, matricula);
    }

    public int getMastiles() {
        return mastiles;
    }

    public void setMastiles(int mastiles) {
        this.mastiles = mastiles;
    }

    @Override
    public void calcularPrecio() {
        int resultado=super.getDiasOcu()*(10*super.getEslora())+(8*mastiles);
        
        System.out.println("El precio del alquiler es: "+resultado+" Matrícula: "+super.getMatricula()+" Eslora: "+super.getEslora());
    }
    
    
}
