import java.time.LocalDate;

public class Prestamo {

    // Atributos
    private int numero;
    private LocalDate fechaPrestamo;
    private Libro libro;
    private Estudiante estudiante;

    // Constructor - la fecha se asigna automáticamente con la fecha actual
    public Prestamo(int numero, Estudiante estudiante, Libro libro) {
        this.numero       = numero;
        this.estudiante   = estudiante;
        this.libro        = libro;
        this.fechaPrestamo = LocalDate.now();
    }

    // Método toString
    @Override
    public String toString() {
        return "Prestamo #" + numero +
               " | Fecha: " + fechaPrestamo +
               " | " + estudiante.toString() +
               " | " + libro.toString();
    }
}
