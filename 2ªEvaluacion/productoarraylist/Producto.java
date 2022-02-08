
package productoarraylist;

/**
 *
 * @author dam1
 */
public class Producto {
    
    
   private int codigo;
   private String nome;
   private String tipo;
   private float precio;
   private int stock;

    public Producto() {
    }

    public Producto(int codigo, String nome, String tipo, float precio, int stock) {
        this.codigo = codigo;
        this.nome = nome;
        this.tipo = tipo;
        this.precio = precio;
        this.stock = stock;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public float getPrecio() {
        return precio;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    @Override
    public String toString() {
        return "Producto{" + "codigo=" + codigo + ", nome=" + nome + ", tipo=" + tipo + ", precio=" + precio + ", stock=" + stock + '}';
    }
  
}
