public class GestorInventario {
    private String nombreArticulo;
    private double precioUnitario;
    private int cantidadStock;

    public GestorInventario(String nombre, double precio, int stock) {
        this.nombreArticulo = nombre;
        this.precioUnitario = precio;
        this.cantidadStock = stock;
    }

    public double calcularSubtotal() {
        return cantidadStock * precioUnitario;
    }

    public double calcularMontoDescuento(double porcentajeDescuento) {
        return calcularSubtotal() * (porcentajeDescuento / 100.0);
    }

    public double calcularValorInventario(double porcentajeDescuento) {
        return calcularSubtotal() - calcularMontoDescuento(porcentajeDescuento);
    }

    public void actualizarStock(int nuevoStock) {
        this.cantidadStock = nuevoStock;
    }

    public void agregarStock(int cantidad) {
        this.cantidadStock += cantidad;
    }

    public void reducirStock(int cantidad) {
        this.cantidadStock -= cantidad;
    }

    public String obtenerNombreArticulo() {
        return nombreArticulo;
    }

    public double obtenerPrecioUnitario() {
        return precioUnitario;
    }

    public int obtenerCantidadStock() {
        return cantidadStock;
    }
}