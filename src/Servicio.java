public class Servicio implements ElementoVenta {
    private String nombre;
    private String descripcion;
    private double precio;

    public Servicio(String nombre, String descripcion, double precio) {
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.precio = precio;
    }

    public double calcularPrecio() {
        return precio;
    }

    public String toString() {
        return nombre + " - " + descripcion + " - $" + precio;
    }

    @Override
    public int agregarProucto() {
        return 0;
    }

    @Override
    public int eliminarProductos() {
        return 0;
    }

    @Override
    public int totalCompras() {
        return 0;
    }

    @Override
    public double calcularPrecioProductos() {
        return 0;
    }

    @Override
    public double calcularPrecioServicios() {
        return 0;
    }
}
