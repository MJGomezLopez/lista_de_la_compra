import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
public class Exportar {
    public static void Fichero(ArrayList<ItemCompra> productos, String ubicacion, String nombreArchivo) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(ubicacion + "/" + nombreArchivo + ".txt"))) {
            for (ItemCompra producto : productos) {
                writer.write("Nombre: " + producto.getNombre() + ", Cantidad: " + producto.getCantidad());
                writer.newLine();
            }

            System.out.println("Se ha generado el archivo en " + ubicacion + "/" + nombreArchivo + ".txt");

        } catch (IOException e) {
            System.err.println("Error al escribir en el archivo: " + e.getMessage());
        }
    }
}
