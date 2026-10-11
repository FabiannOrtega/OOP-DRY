package ventas.modelo;

// ABSTRACCIÓN: Una clase abstracta define una estructura general 
// y obliga a las subclases a implementar ciertos comportamientos.
public abstract class Persona {
    
    //Encapsulamiento
    private String nombre;
    private String identificacion;

    //constructor
    public Persona(String nombre, String identificacion) {
        this.nombre = nombre;
        this.identificacion = identificacion;
    }

    public String getNombre() {
        return nombre;
    }

    public String getIdentificacion() {
        return identificacion;
    }

    // Método abstracto: obliga a cualquier tipo de persona a definir su rol
    public abstract void mostrarRol();
}