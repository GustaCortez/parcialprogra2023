public class Main {
    public static void main(String[] args) {


                Producto producto1 = new Producto("Camiseta", 20.99, "12345", 10);
                Producto producto2 = new Producto("Pantalón", 34.99, "67890", 15);

                Servicio servicio1 = new Servicio("Limpieza de alfombra", "Limpieza profesional", 50.00);
                Servicio servicio2 = new Servicio("Instalación de software", "Instalación y configuración", 30.00);

                CarritoDeCompras carrito = new CarritoDeCompras();

                carrito.agregarElemento(producto1);
                carrito.agregarElemento(servicio1);
                carrito.agregarElemento(producto2);
                carrito.agregarElemento(servicio2);

                System.out.println(carrito.generarRecibo());
            }





    }
