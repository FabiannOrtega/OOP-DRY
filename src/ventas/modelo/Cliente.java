package ventas.modelo;

//Herencia
public class Cliente extends Persona {

    public Cliente(String nombre, String identificacion) {
        super(nombre, identificacion); // Llama al constructor de la clase padre (Persona)
    }

    // Implementación obligatoria del método abstracto de la clase padre
    @Override
    public void mostrarRol() {
        System.out.println("Rol en el sistema: Cliente comprador");
    }
}