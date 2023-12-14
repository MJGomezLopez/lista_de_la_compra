/**
 * @author Rubén Alonso Quintana
 * @version 1.0
 * @description Función que elimina un producto
 * @university Universidad de BUrgos
 * @subject Gestión de Proyectos
 * 
 * @name
 */

import java.util.ArrayList;
import java.util.Iterator;

public class Eliminar {

	// Debemos instanciar la clase Producto
	private ArrayList<Producto> listaProductos;

	public Eliminar() {
		this.listaProductos = listaProductos;
	}

	public static void EliminarProducto(ArrayList<Producto> listaProductos) {

		System.out.println();
		System.out.println("Por favor ingrese el nombre del articulo a eliminar");
		String NombreProducto = readerString.getInputString();

		Iterator<Producto> it = listaProductos.iterator();

		while (it.hasNext()) {
			Object y = it.next();
			if (y == NombreProducto) {
				listaProductos.remove(y);
			}
		}

		System.out.println();
		System.out.println("El producto ha sido agregado exitosamente");
	}
}
