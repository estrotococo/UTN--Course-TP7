package app;

/**
 * Item
 */
public class Item {

    private int cantidadPromedioUnidades;
    private double precioUnitario;
    private String descripcion;

    /**
     * @param descripcion
     * @param cantidadPromedioUnidades
     * @param precioUnitario
     */
    public Item(String descripcion, int cantidadPromedioUnidades, double precioUnitario) {
        this.cantidadPromedioUnidades = cantidadPromedioUnidades;
        this.precioUnitario = precioUnitario;
        this.descripcion = descripcion;
    }

    public int getCantidadPromedioUnidades() {
        return cantidadPromedioUnidades;
    }

    public void setCantidadPromedioUnidades(int cantidadPromedioUnidades) {
        this.cantidadPromedioUnidades = cantidadPromedioUnidades;
    }

    public double getPrecioUnitario() {
        return precioUnitario;
    }

    public void setPrecioUnitario(double precioUnitario) {
        this.precioUnitario = precioUnitario;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    
}