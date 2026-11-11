public class Main {
    public static void main(String[] args) {
        GestorInventario item = new GestorInventario("Laptop Pro", 12500.0, 8);
        InventarioVista vista = new InventarioVista();

        vista.mostrarResumen(item, 10.0);

        item.agregarStock(2);
        vista.mostrarStockActualizado(item);
    }
}