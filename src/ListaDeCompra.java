
import java.util.Scanner;

/**
 * @author Miguel Ángel Jódar de la Torre
 * @version 1.0
 * @description Clase principal que alberga el método main
 * @university Universidad de BUrgos
 * @subject Gestión de Proyectos
 * @date 13/12/2023
 */
public class ListaDeCompra {

	// Códigos ANSI para colores de texto
	private static final String RESET = "\u001B[0m";
	private static final String RED = "\u001B[91m";
	private static final String GREEN = "\u001B[92m";
	private static final String YELLOW = "\u001B[93m";
	private static final String BLUE = "\u001B[94m";
	private static final String MAGENTA = "\u001B[95m";
	private static final String CYAN = "\u001B[96m";

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int opcion;
		do {
			System.out.println("\n--- " + BLUE + "Lista de Compra" + RESET + " ---");
			System.out.println("1. " + GREEN + "Agregar producto" + RESET);
			System.out.println("2. " + RED + "Eliminar producto" + RESET);
			System.out.println("3. " + YELLOW + "Listar productos" + RESET);
			System.out.println("4. " + CYAN + "Marcar producto como comprado" + RESET);
			System.out.println("5. " + MAGENTA + "Exportar lista a un fichero" + RESET);
			System.out.println("6. " + "Salir");
			System.out.print("Seleccione una opción: ");

			opcion = scanner.nextInt();
			scanner.nextLine(); // Consumir el salto de línea después del número

			switch (opcion) {
			case 1:
				agregarProducto(scanner);
				break;
			case 2:
				eliminarProducto(scanner);
				break;
			case 3:
				listarProductos();
				break;
			case 4:
				marcarComoComprado(scanner);
				break;
			case 5:
				exportarLista();
				break;
			case 6:
				System.out.println("¡Hasta la próxima!");
				break;
			default:
				System.out.println("Opción no válida. Inténtelo de nuevo.");
			}

		} while (opcion != 6);
	}

	private static void agregarProducto(Scanner scanner) {
		// TO DO
	}

	private static void eliminarProducto(Scanner scanner) {
		// TO DO
	}

	private static void listarProductos() {

		// TO DO
	}

	private static void marcarComoComprado(Scanner scanner) {
		// TO DO
	}

	private static void exportarLista() {
		// TO DO
	}
}
