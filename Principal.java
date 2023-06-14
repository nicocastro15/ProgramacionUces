public class Principal {
    public static void main(String[] args) {
        Producto[] productos = new Producto[3];
        productos[0] = new Producto("Leche", 2.5, 10);
        productos[1] = new Producto("Pan", 1.0, 5);
        productos[2] = new Producto("Huevos", 0.5, 12);

        for (Producto producto : productos) {
            double valorTotal = producto.getPrecio() * producto.getCantidad();
            System.out.println("Nombre: " + producto.getNombre());
            System.out.println("Valor total: " + valorTotal);
            System.out.println("--------------------------");
        }
    }

    public static class Producto {
        private String nombre;
        private double precio;
        private int cantidad;

        public Producto(String nombre, double precio, int cantidad) {
            this.nombre = nombre;
            this.precio = precio;
            this.cantidad = cantidad;
        }

        public String getNombre() {
            return nombre;
        }

        public double getPrecio() {
            return precio;
        }

        public int getCantidad() {
            return cantidad;
        }
    }
}