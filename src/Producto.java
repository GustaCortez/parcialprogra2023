public class Producto implements ElementoVenta {
    private String nombre;
    private double precio;
    private String codigoBarras;
    private int cantidadEnStock;

    public Producto(String nombre, double precio, String codigoBarras, int cantidadEnStock) {
        this.nombre = nombre;
        this.precio = precio;
        this.codigoBarras = codigoBarras;
        this.cantidadEnStock = cantidadEnStock;
    }

    public double calcularPrecio() {
        return precio;
    }

    public String toString() {
        return nombre + " - $" + precio;
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