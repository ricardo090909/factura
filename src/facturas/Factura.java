/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package facturas;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author HP
 */
public class Factura {
    private Date fecha;
    private int total;
	private Cliente cliente;
    private int metodoPago;
    private DetalleFactura[] detalles;
    private int indiceDetalles;
    public static final int MAX_DETALLES =10;
    private static int folio;

    
    
    public Factura(Cliente cliente, int metodoPago) {
        this.total = total;
        this.cliente = cliente;
        this.metodoPago = metodoPago;
        this.detalles = new DetalleFactura[MAX_DETALLES];
        this.folio = ++folio;
        this.fecha = new Date();


    }
    
    

    /**
     * @return the folio
     */
    public int getFolio() {
        return folio;
    }


    /**
     * @return the fecha
     */
    public Date getFecha() {
        return fecha;
    }

    /**
     * @param fecha the fecha to set
     */
    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    /**
     * @return the total
     */
    public int getTotal() {
        return total;
    }

    /**
     * @param total the total to set
     */
    public void setTotal(int total) {
        this.total = total;
    }

    public DetalleFactura[] getDetalles() {
        return detalles;
    }

    public void addDetalles(DetalleFactura detalle) {
        if (indiceDetalles < MAX_DETALLES) {
            this.detalles[indiceDetalles++] = detalle;

        }else {
        System.out.println("Numero de productos maximo excedido");
    }
    }

    /**
     * @return the cliente
     */
    public Cliente getCliente() {
        return cliente;
    }

    /**
     * @param cliente the cliente to set
     */
    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    /**
     * @return the metodoPago
     */
    public int getMetodoPago() {
        return metodoPago;
    }

    /**
     * @param metodoPago the metodoPago to set
     */
    public void setMetodoPago(int metodoPago) {
        this.metodoPago = metodoPago;
    }
    
    public int calcularTotal(){
        int total = 0;
        for (DetalleFactura detalle : detalles) {
            if (detalle == null) {
                continue;
            }
            total += detalle.calcularSubtotal();
        }
        return total;
    }
    
    
    
    public StringBuilder consultarDetalles(){
    	StringBuilder sb = new StringBuilder("factura no. 1");
    	sb.append(folio)
    	.append("\n clientes: ")
    	.append(this.cliente.getNombre())
    	.append(this.cliente.getApellidoPaterno())
    	.append("\n RFC:")
    	.append(this.cliente.getRfc())
    	.append("\n")
    	.append("\nNombre\tPrecio\tCantidad.\tTotal\n");
    	
    	SimpleDateFormat df = new SimpleDateFormat("dd de mmmm, yyyy");
    	sb.append("fecha de emision: ")
    	.append(df.format(this.fecha))
    	.append("\n");
    	
    	for(DetalleFactura detalle : this.detalles) {
    		if(detalle ==  null) {
    			continue;
    			
    		}
    		sb.append(detalle.getProducto().getNombre())
    		.append("\t")
    		.append(detalle.getProducto().getCosto())
    		.append("\t")
    		.append(detalle.getCantidad())
    		.append("\t")
    		.append(detalle.calcularSubtotal())
    		.append("\n");
    		
    	}
    	sb.append("\nTotal: ")
    	.append(calcularTotal());
    	return sb;
        
    }
    
}
