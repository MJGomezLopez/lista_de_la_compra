import java.util.ArrayList;

/**
 * @author Miguel José Gómez López
 * @version 1.0
 * @description Clase utilizada para marcar productos como comprados
 * @university Universidad de BUrgos
 * @subject Gestión de Proyectos
 * @date 09/12/2023 
 */
public class Marcar {
	
	//Variables estaticas para colocar colores en los mensajes de salida
	private static String RESET = "\u001B[0m";
	private static String VERDE = "\u001B[32m";
	
	/**
	 * Método para marcar, utilizando el setter de la clase Producto, los productos
	 * de la lista de productos como 'Comprados' 
	 * 
	 * @param productos	ArrayList con la lista de proudctos
	 * @param nombre	Nombre de el/los producto(s) que se desea usar el setter
	 */
	public static void MarcarProducto(ArrayList<Producto> productos, String nombre) {
		// variable para contar cuantos productos seran marcados como 'Comprados'
		int contador = 0;
		
		//Recorriendo la lista de producto
		for (Producto producto: productos) {
			if (producto.getNombre() == nombre) { //buscando quien cumpla la condición
				producto.setComprado(true); //marcamos como 'Comprado'
				contador++; ////aumentamos el contador
			}
		}
		
		//mensaje de salida
		System.out.println(VERDE + "Se han marcado " + contador + " producto(s) como COMPRADO(S) con el nombre: " + nombre + RESET);
	}
}
