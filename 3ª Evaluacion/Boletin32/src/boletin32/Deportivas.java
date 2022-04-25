
package boletin32;


public class Deportivas extends Barco {
    private int cv;

    public Deportivas(int cv) {
        this.cv = cv;
    }

    public Deportivas(int cv, int diasOcu, int eslora, String matricula) {
        super(diasOcu, eslora, matricula);
        this.cv = cv;
    }

    public int getCv() {
        return cv;
    }

    public void setCv(int cv) {
        this.cv = cv;
    }
    
    @Override
    public void calcularPrecio() {
      int resultado=super.getDiasOcu()*(10*super.getEslora())+(2*cv);
        
       System.out.println("El precio del alquiler es: "+resultado+" Matrícula: "+super.getMatricula()+" Eslora: "+super.getEslora());
    }
    
}
