/**
 * @author Ignacio Moreno Piqureas
 * @version 1.0
 * @description Clase Producto para representar y manejar la información de productos.

 * @university Universidad de Burgos
 * @subject Gestión de Proyectos
 * @date 10/12/2023 
 */

public class Producto {
    private String nombreDelProducto;
    private int cantidad;
    private double precio;
    private boolean comprado;

    // Constructor
    public Producto(String nombreDelProducto, int cantidad, double precio) {
        this.nombreDelProducto = nombreDelProducto;
        this.cantidad = cantidad;
        this.precio = precio;
        this.comprado = false; // valor por defecto
    }

    // Getters
    public String getNombreDelProducto() {
        return nombreDelProducto;
    }

    public int getCantidad() {
        return cantidad;
    }

    public double getPrecio() {
        return precio;
    }

    public boolean isComprado() {
        return comprado;
    }

    // Setters
    public void setNombreDelProducto(String nombreDelProducto) {
        this.nombreDelProducto = nombreDelProducto;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public void setComprado(boolean comprado) {
        this.comprado = comprado;
    }
}
