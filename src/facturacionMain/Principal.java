package facturacionMain;

import facturas.*;
import java.util.Scanner;


public class Principal {
    public static void main(String[] args) {
         Cliente cliente = new Cliente("","","","","","");
         Factura factura = new Factura(cliente, "Efectivo");
         Scanner s = new Scanner(System.in);
         
        Producto producto;
        String nombreP;
         String categoriaP;
         String unidadMedidaP;
        int cantidadP;
         
        int costoP;
        
        for (int i = 0; i < 3; i++) {
           producto = new Producto(); 
            System.out.println("ingrese nombre del producto");
            nombreP = s.next();
            producto.setNombre(nombreP);
            
            System.out.println("ingrese nombre de la categoria");
            categoriaP=s.next();
            producto.setCategoria(categoriaP);
            
            System.out.println("ingresa unidad de medida");
            costoP = s.nextInt();
            producto.setCosto(costoP);
            
            System.out.println("ingresa unidad de medida");
            unidadMedidaP=s.next();
            producto.setUnidadMedida(unidadMedidaP);
            
            System.out.println("ingrese la cantidad");
            cantidadP = s.nextInt();
             
            
            
            DetalleFactura detalle = new DetalleFactura(producto, cantidadP);
            factura.addDetalles(detalle);
        }
        System.out.println(factura.consultarDetalles());
    }
    
}