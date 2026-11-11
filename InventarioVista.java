public class InventarioVista {

    public void mostrarResumen(GestorInventario item, double porcentajeDescuento) {
        System.out.println("Artículo: " + item.obtenerNombreArticulo()
                + " | Stock: " + item.obtenerCantidadStock());
        System.out.println("Subtotal: $" + item.calcularSubtotal());
        System.out.println("Descuento (" + porcentajeDescuento + "%): $" + item.calcularMontoDescuento(porcentajeDescuento));
        System.out.println("Total inventario valorizado: $" + item.calcularValorInventario(porcentajeDescuento));
    }

    public void mostrarStockActualizado(GestorInventario item) {
        System.out.println("Stock actualizado de " + item.obtenerNombreArticulo()
                + ": " + item.obtenerCantidadStock());
    }
}