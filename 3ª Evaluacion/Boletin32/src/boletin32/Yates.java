
package boletin32;


public class Yates extends Barco {
private int cv;
private int camarotes;

    public Yates(int cv, int camarotes) {
        this.cv = cv;
        this.camarotes = camarotes;
    }

    public Yates(int cv, int camarotes, int diasOcu, int eslora, String matricula) {
        super(diasOcu, eslora, matricula);
        this.cv = cv;
        this.camarotes = camarotes;
    }

    public int getCv() {
        return cv;
    }

    public void setCv(int cv) {
        this.cv = cv;
    }

    public int getCamarotes() {
        return camarotes;
    }

    public void setCamarotes(int camarotes) {
        this.camarotes = camarotes;
    }

    @Override
    public void calcularPrecio() {
     int resultado=super.getDiasOcu()*(10*super.getEslora())+(2*cv)+(25*camarotes);
        
         System.out.println("El precio del alquiler es: "+resultado+" Matrícula: "+super.getMatricula()+" Eslora: "+super.getEslora());
    }
    
}
