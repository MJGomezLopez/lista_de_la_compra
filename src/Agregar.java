/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package partaddproduct;

import java.util.ArrayList;

/**
 *
 * @author sergi
 */
public class Agregar {
    //tenemos en cuenta que la clase Producto no está instanciada
    private ArrayList <Producto> listaProducto;
    private String NombreProducto;
    private int Cantidad;
    private int Precio;
    
    
    public Agregar()
    {
       Cantidad = 0; 
       Precio = 0;
    }
    
    
    public static  Producto AgregarProducto () {
    
        
        System.out.println();
        System.out.println("Por favor ingrese el nombre del articulo");
        NombreProducto = readerString.getInputString();
        System.out.println();
        System.out.println("Por favor, ingrese la cantidad del producto");
        Cantidad = readerInt.getInputInt();
        System.out.println("Por favor ingrese el precio del articulo");
        Precio = readerInt.getInputInt();
        
        listaProducto.add(NombreProcto, Cantidad, Precio);
        
        System.out.println();
        System.out.println("El producto ha sido agregado exitosamente");
        
        
        
    }
}
    


    