package productoarraylist;

import java.util.ArrayList;
import libreriaHector.leerDatos;

/**
 * Implementa a clase comercio que conteña os métodos agregar, eliminar,
 * obtener, buscar por código a cantidade de productos que tenemos.  *
 */
/**
 *
 * @author dam1
 */
public class ProductoArrayList {

    public static void main(String[] args) {
        Producto p = new Producto();

        ArrayList<Producto> listP = new ArrayList();

        int o = 0;
        do {
            o = leerDatos.leerInt("Qué desea hacer? \n"
                    + "1- Añadir producto. \n"
                    + "2- Mostrar lista. \n"
                    + "3- Eliminar producto. \n"
                    + "4- Consultar Stock. \n"
                    + "5- ----SALIR----");
            switch (o) {
                case 1:
                    
                    Comercio.agregar(listP);
                    break;

                case 2:

                    Comercio.mostrar(listP);
                    break;

                case 3:

                    Comercio.eliminarProducto(listP, p);
                    break;

                case 4:

                    Comercio.busquedaCodigo(listP, p);

                    break;

            }

        } while (o >= 1 && o <= 5);
    }

}
