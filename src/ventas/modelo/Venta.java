package ventas.modelo;

import java.util.ArrayList;
import java.util.List;
//Importamos la clase util para aplicar DRY(Dont repeat yourself)
import ventas.modelo.Utils.FormatoUtil;

//Clase normal con atributos,metodos y constructor.
public class Venta {
    private String idVenta;
    private Cliente cliente;
    private List<DetalleVenta> detalles;

    public Venta(String idVenta, Cliente cliente) {
        this.idVenta = idVenta;
        this.cliente = cliente;
        this.detalles = new ArrayList<>();
    }

    public void agregarProducto(Producto producto, int cantidad) {
        if (producto.hayStock(cantidad)) {
            detalles.add(new DetalleVenta(producto, cantidad));
            System.out.println("-> Producto agregado: " + producto.nombre() + " (x" + cantidad + ")");
        } else {
            System.out.println("-> Stock insuficiente para: " + producto.nombre());
        }
    }
    
    //Polimorfismo
    private double calcularTotal() {
        double total = 0;
        for (DetalleVenta detalle : detalles) {
            total += detalle.calcularSubtotal();
        }
        return total;
    }

    public void generarTicket() {
        System.out.println("\n==================================");
        System.out.println("          TICKET DE VENTA         ");
        System.out.println("==================================");
        System.out.println("ID Venta: " + idVenta);
        System.out.println("Cliente: " + cliente.getNombre() + " (ID: " + cliente.getIdentificacion() + ")");
        System.out.println("----------------------------------");
        
        for (DetalleVenta detalle : detalles) {
            // Aplicando DRY: Usamos FormatoUtils en lugar de repetir "$..."
            System.out.println(detalle.producto().nombre() + " x" + detalle.cantidad() + 
                               " -> Subtotal: " + FormatoUtil.moneda(detalle.calcularSubtotal()));
        }
        System.out.println("----------------------------------");
        // Aplicando DRY: Reutilizamos la misma utilidad para el total
        System.out.println("TOTAL A PAGAR: " + FormatoUtil.moneda(calcularTotal()));
        System.out.println("==================================\n");
    }
}