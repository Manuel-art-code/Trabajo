public class Estudiante {

    // Atributo
    private String nombre;

    // Constructor
    public Estudiante(String nombre) {
        this.nombre = nombre;
    }

    // Método toString
    @Override
    public String toString() {
        return "Estudiante: " + nombre;
    }
}
