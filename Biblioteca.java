import java.util.ArrayList;
import java.util.List;

public class Biblioteca {

    // Atributos
    private List<Libro> listaLibros;
    private List<Prestamo> listaPrestamos;

    // Constructor - crea las dos listas vacías
    public Biblioteca() {
        listaLibros    = new ArrayList<>();
        listaPrestamos = new ArrayList<>();
    }

    // Agrega un libro a la lista
    public void agregarLibro(Libro libro) {
        listaLibros.add(libro);
    }

    // Registra un préstamo en la lista
    public void realizarPrestamo(Prestamo prestamo) {
        listaPrestamos.add(prestamo);
    }

    // Busca un libro por su ISBN; retorna null si no lo encuentra
    public Libro buscarLibro(String isbn) {
        for (Libro libro : listaLibros) {
            if (libro.getIsbn().equals(isbn)) {
                return libro;
            }
        }
        return null;
    }

    // Muestra todos los libros registrados
    public void mostrarLibros() {
        System.out.println("=== Libros de la Biblioteca ===");
        for (Libro libro : listaLibros) {
            System.out.println(libro);
        }
    }

    // Muestra todos los préstamos realizados
    public void mostrarPrestamos() {
        System.out.println("=== Préstamos Realizados ===");
        for (Prestamo prestamo : listaPrestamos) {
            System.out.println(prestamo);
        }
    }
}
