import ventas.modelo.Cliente;
import ventas.modelo.Producto;
import ventas.modelo.Venta;

//Clase principal donde se ejecuta el programa
public class App {
    public static void main(String[] args) {
        
        // Objetos(Instancia de una clase.)

        // ------------Crear productos
        Producto laptop = new Producto("P-01", "Laptop HP", 850.00, 5);
        Producto mouse = new Producto("P-02", "Mouse Gamer", 25.50, 20);

        //------------ Registrar cliente
        Cliente cliente = new Cliente("Carlos Ruiz", "ID-112233");

        // ------------Iniciar venta
        Venta venta = new Venta("V-999", cliente);

        // ------------Llamadas a métodos
        venta.agregarProducto(laptop, 1); 
        venta.agregarProducto(mouse, 2);
        venta.generarTicket();
    }
}