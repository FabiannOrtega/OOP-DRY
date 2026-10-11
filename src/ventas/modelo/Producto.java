package ventas.modelo;

//Tipo especial de Clase en Java para representar portadores de datos inmutables (es decir, datos que no cambian una vez creados)
public record Producto(String codigo, String nombre, double precio, int stock) {

    public boolean hayStock(int cantidad) {
        return stock >= cantidad;
    }

    public boolean NoHayStock(int cantidad) {
        return stock < cantidad; 
    }
}