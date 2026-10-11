package ventas.modelo;

public record DetalleVenta(Producto producto, int cantidad) {
    
    //Compartimos los objetos 
    public double calcularSubtotal() {
        return producto.precio() * cantidad;
    }
}