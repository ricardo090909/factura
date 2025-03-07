/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package facturas;

/**
 *
 * @author HP
 */
public class DetalleFactura {
    private Factura factura;
    private Producto producto;
   // private int precioVenta;
    private int cantidad;
   // private int subTotal;

    public DetalleFactura(int cantidad, Producto producto) {
        this.producto = producto;        
        this.cantidad = cantidad;
        
    }

     
    
    /**
     * @return the factura
     */
    public Factura getFactura() {
        return factura;
    }

    /**
     * @param factura the factura to set
     */
    public void setFactura(Factura factura) {
        this.factura = factura;
    }

    /**
     * @return the producto
     */
    public Producto getProducto() {
        return producto;
    }

    /**
     * @param producto the producto to set
     */
    public void setProducto(Producto producto) {
        this.producto = producto;
    }


    /**
     * @return the cantidad
     */
    public int getCantidad() {
        return cantidad;
    }

    /**
     * @param cantidad the cantidad to set
     */
    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

  
    
    public int calcularSubtotal(){
        return this.cantidad * this.producto.getCosto();
    }
}
