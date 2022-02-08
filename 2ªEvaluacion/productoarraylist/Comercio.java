package productoarraylist;

import java.util.ArrayList;
import java.util.Iterator;
import libreriaHector.leerDatos;

/**
 * Implementa la clase comercio que contenga los métodos agregar, eliminar,
 * obtener, buscar por código la cantidad de productos que tenemos. *
 */
/**
 *
 * @author dam1
 */
public class Comercio {

    public static ArrayList<Producto> agregar(ArrayList<Producto> listP) {
        int o = 0;
        int c = 0;
        do {
            o = leerDatos.leerInt("Pulse 1 para añadir un producto: \n"
                    + "Si no desea añadir un producto pulse cualquier otra tecla. ");
            switch (o) {

                case 1:
                    Producto p = new Producto();

                    p.setCodigo(leerDatos.leerInt("Introduzca el codigo del producto: "));
                    p.setNome(leerDatos.leerString("Introduzca el nombre del producto: "));
                    p.setTipo(leerDatos.leerString("Introduzca el tipo del producto"));
                    p.setPrecio(leerDatos.leerFloat("Introduzca el precio del producto: "));
                    p.setStock(leerDatos.leerInt("Introduzca la cantidad de unidades que hay en stock: "));

                    listP.add(c, p);
                    c++;

                    break;

            }
        } while (o == 1);

        return listP;
    }

    public static void mostrar(ArrayList<Producto> listP) {

        Iterator<Producto> productoIte = listP.iterator();
        while (productoIte.hasNext()) {
            Producto elemento = productoIte.next();
            System.out.println(elemento + " / ");
        }
    }

    public static ArrayList<Producto> eliminarProducto(ArrayList<Producto> listP, Producto p) {
        int c = leerDatos.leerInt("Introduzca el código del producto que desea eliminar: ");

        for (int i = 0; i < listP.size(); i++) {
            p = listP.get(i);
            if (c == p.getCodigo()) {
                listP.remove(i);
                System.out.println("El producto ha sido eliminado. ");
            }

        }

        return listP;
    }

    public static void busquedaCodigo(ArrayList<Producto> listP, Producto p) {
        int c = leerDatos.leerInt("Introduzca el código del producto para ver la cántidad de stock: ");

        for (int i = 0; i < listP.size(); i++) {
            p = listP.get(i);
            if (c == p.getCodigo()) {

                System.out.println(p.getStock());
            }

        }

    }

}
