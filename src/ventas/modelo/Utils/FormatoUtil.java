package ventas.modelo.Utils;

public class FormatoUtil {
    
    // DRY: Centralizamos el formato de moneda en un solo lugar
    public static String moneda(double monto) {
        return String.format("$%.2f", monto);
    }
}