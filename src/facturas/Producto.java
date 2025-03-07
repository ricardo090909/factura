package facturas;
public class Producto {
    private String codigoBarras;
    private String nombre;
    private String categoria;
    private int costo;    
    private String unidadMedida;

    public Producto(String codigoBarras, String nombre, String categoria, int costo, String unidadMedida) {
        this.codigoBarras = codigoBarras;
        this.nombre = nombre;
        this.categoria = categoria;
        this.costo = costo;
        this.unidadMedida = unidadMedida;
    }
    
    
    public String getCodigoBarras() {
        return codigoBarras;
    }

    public void setCodigoBarras(String codigoBarras) {
        this.codigoBarras = codigoBarras;
    }

   
    public String getNombre() {
        return nombre;
    }

    
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

   
    public String getCategoria() {
        return categoria;
    }

    
    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    
    public int getCosto() {
        return costo;
    }

    
    public void setCosto(int costo) {
        this.costo = costo;
    }

    
    public String getUnidadMedida() {
        return unidadMedida;
    }

    
    public void setUnidadMedida(String unidadMedida) {
        this.unidadMedida = unidadMedida;
    }
    
    
}
