
package boletin32;


public abstract class  Barco {
    private int diasOcu;
    private int eslora;
    private String matricula;

    public Barco() {
    }

    public Barco(int diasOcu, int eslora, String matricula) {
        this.diasOcu = diasOcu;
        this.eslora = eslora;
        this.matricula = matricula;
    }

    public int getDiasOcu() {
        return diasOcu;
    }

    public void setDiasOcu(int diasOcu) {
        this.diasOcu = diasOcu;
    }

    public int getEslora() {
        return eslora;
    }

    public void setEslora(int eslora) {
        this.eslora = eslora;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }
    
    
    public abstract void calcularPrecio ();
        
    
}
