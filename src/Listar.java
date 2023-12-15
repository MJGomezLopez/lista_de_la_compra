
import java.util.ArrayList;

/**
 * @author Santiago Peris
 * @version 1.0
 * @description Función listar producto
 * @university Universidad de BUrgos
 * @subject Gestión de Proyectos
 * 
 * @name
 */


// Clase Lista con el método estático ListarProductos
public class Lista {
    public static void ListarProductos(ArrayList<Producto> productos) {
        // Recorrer el arraylist e imprimir la información de cada producto
        for (Producto p : productos) {
            System.out.println("Nombre: " + p.getNombre());
            System.out.println("Cantidad: " + p.getCantidad());
            System.out.println("Precio: " + p.getPrecio());
            System.out.println("Comprado: " + (p.isComprado() ? "Sí" : "No"));
            System.out.println("--------------------");
        }
    }
}
