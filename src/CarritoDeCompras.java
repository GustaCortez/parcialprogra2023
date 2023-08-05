import java.util.ArrayList;
import java.util.List;

public class CarritoDeCompras {
    private List<ElementoVenta> productosSeleccionados = new ArrayList<>();

    public void agregarElemento(ElementoVenta elemento) {
        productosSeleccionados.add(elemento);
    }

    public void eliminarElemento(ElementoVenta elemento) {
        productosSeleccionados.remove(elemento);
    }

    public double calcularTotal() {
        double total = 0;
        for (ElementoVenta elemento : productosSeleccionados) {
            total += elemento.calcularPrecio();
        }
        return total;
    }

    public String generarRecibo() {
        StringBuilder recibo = new StringBuilder("Recibo de compra:\n");
        for (ElementoVenta elemento : productosSeleccionados) {
            recibo.append(elemento.toString()).append("\n");
        }
        recibo.append("Total a pagar: $").append(calcularTotal());
        return recibo.toString();
    }
}